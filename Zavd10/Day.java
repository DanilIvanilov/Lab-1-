package com.company.Zavd10;

public class Day {
    public Day(final NameOfDay nameOfDay, final TypeOfWeather typeOfWeather, final double temperature, final Integer atmosphericPressure, final Integer humidity) {
        this.nameOfDay = nameOfDay;
        this.weather.setTypeOfWeather (typeOfWeather);
        this.weather.setTemperature (temperature);
        this.weather.setAtmosphericPressure (atmosphericPressure);
        this.weather.setHumidity (humidity);

    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(final Weather weather) {
        this.weather = weather;
    }

    public NameOfDay getNameOfDay() {
        return nameOfDay;
    }

    private Weather weather = new Weather ();
    private final NameOfDay nameOfDay;

    @Override
    public int hashCode() {
        return this.getWeather().hashCode() + 50 * getNameOfDay().hashCode();
    }

    @Override
    public String toString() {
        return "День <" +
                "" + nameOfDay+"> " + weather  +
                '>';
    }
}


