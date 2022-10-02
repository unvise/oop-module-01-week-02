package com.unvise.oop.task1.c;

import java.util.Objects;

public class BadmintonPlayResolver {
    public static boolean resolve(String dayOfWeek,
                                  String temperature,
                                  String precipitation,
                                  String humidity,
                                  String air) {
        dayOfWeek = dayOfWeek.toLowerCase();
        temperature = temperature.toLowerCase();
        precipitation = precipitation.toLowerCase();
        humidity = humidity.toLowerCase();
        air = air.toLowerCase();

        boolean isDayOfWeekOk = Objects.equals(dayOfWeek, "воскресенье");
        boolean isTemperatureOk = Objects.equals(temperature, "тепло");
        boolean isPrecipitationOk = Objects.equals(precipitation, "ясно");
        boolean isHumidityOK = Objects.equals(humidity, "низкая");
        boolean isAir = Objects.equals(air, "нет");

        return isDayOfWeekOk
                && isTemperatureOk
                && isPrecipitationOk
                && isHumidityOK
                && isAir;
    }
}
