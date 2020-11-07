package com.nvh.testgridview;

public class Country {

    private String countryName;

    // Image name (Without extension)
    private int flagName;
    private int population;

    public Country(String countryName, int flagName, int population) {
        this.countryName= countryName;
        this.flagName= flagName;
        this.population= population;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getFlagName() {
        return flagName;
    }

    public void setFlagName(int flagName) {
        this.flagName = flagName;
    }

    @Override
    public String toString()  {
        return this.countryName+" (Population: "+ this.population+")";
    }
}