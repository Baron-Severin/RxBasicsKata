package com.macys.rxkataandroid;


class Country {
    private final String name;
    private final String currency;
    private final long population;

    Country(String name, String currency, long population) {
        this.name = name;
        this.currency = currency;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getCurrency() {
        return currency;
    }

    public long getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", currency='" + currency + '\'' +
                ", population=" + population +
                '}';
    }
}
