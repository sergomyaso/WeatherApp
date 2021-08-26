package com.sergomyaso.webweather.Provider;


import org.springframework.web.reactive.function.client.WebClient;


import java.util.stream.IntStream;

public class WeatherAtpmProvider {
    private static final String TEMPLATE_API_URL = "http://pogoda.atpm-air.ru/data.aspx?action=temperature&dat1=%s&dat2=%s&comparison=0";
    private static final String SEPARATOR = ",";
    static final WebClient webClient = WebClient.create();

    static public double getAverageValue(String dateFrom, String dateTo) {
        String url = String.format(TEMPLATE_API_URL, dateFrom, dateTo);
        var resultApi = webClient.get().uri(url).retrieve().bodyToMono(String.class).block();
        var temperatureDateValues = resultApi.substring(0, resultApi.length() - 1).split(SEPARATOR);
        int countTemperatureValues = temperatureDateValues.length / 2; // Half are dates, half are values
        return IntStream.range(0, temperatureDateValues.length).filter(i -> i % 2 != 0).mapToDouble(i -> Double.parseDouble(temperatureDateValues[i])).sum() / countTemperatureValues;
    }

}
