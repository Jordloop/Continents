package models;


import controllers.CountController;

import java.util.TreeMap;

public class Continents
{
    private TreeMap<String, Continent> continents = new TreeMap<>();

    public Continents()
    {
        Continent africa = new Continent("Africa", 4900, 1215770813, "africa.jpg");
        Continent asia = new Continent("Asia", 8849, 4400000000L, "asia.jpg");
        Continent northAmerica = new Continent("North America", 6190, 550000000L, "northAmerica.jpg");
        Continent southAmerica = new Continent("South America", 6961, 385000000L, "southAmerica.jpg");
        Continent antarctica = new Continent("Antarctica", 4900, 10000, "antarctica.jpg");
        Continent europe = new Continent("Europe", 5624, 742000000L, "europe.jpg");
        Continent australia = new Continent("Australia", 3754, 24000000, "australia.jpg");


        continents.put(africa.getName(), africa);
        continents.put(asia.getName(), africa);
        continents.put(northAmerica.getName(), africa);
        continents.put(southAmerica.getName(), africa);
        continents.put(antarctica.getName(), africa);
        continents.put(europe.getName(), africa);
        continents.put(australia.getName(), africa);
    }

}