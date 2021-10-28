package com.company.Zavd10;

public class Main {
    public static void main(final String[] args) {
        final int n=7;
        final Day [] days = new Day[n];

        days[0] = new Day (NameOfDay.MONDAY,TypeOfWeather.STORMY,25.5,950,84);
        days[1] = new Day (NameOfDay.TUESDAY,TypeOfWeather.RAINY,27,850,74);
        days[2] = new Day (NameOfDay.WEDNESDAY,TypeOfWeather.CLOUDY,22,550,58);
        days[3] = new Day (NameOfDay.THURSDAY,TypeOfWeather.SUNNY,25,550,64);
        days[4] = new Day (NameOfDay.FRIDAY,TypeOfWeather.HOT,33.5,400,64);
        days[5] = new Day (NameOfDay.SATURDAY,TypeOfWeather.WARM,28,750,68);
        days[6] = new Day (NameOfDay.SUNDAY,TypeOfWeather.COLD,30.5,550,54);
        printWeatherCalendar (days);
    }
    private static void printWeatherCalendar(final Day [] days){
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

    }
}
