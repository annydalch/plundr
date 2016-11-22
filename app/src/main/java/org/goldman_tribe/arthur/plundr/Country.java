package org.goldman_tribe.arthur.plundr;
import java.util.ArrayList;
/**
 * Created by gnome2 on 10/31/2016.
 */

public class Country {
    long defence;
    String resources;
    String name;
    static ArrayList<Country> Countries = new ArrayList<Country>();
    public Country(String Name, long defenceBudget, String NR, boolean IsImp){
        defence = defenceBudget;
        resources = NR;
        name = Name;
        Countries.add(this);
    }
    public void capture(long offence) {
        //the offence variable is a place holder until I determine what it should be called
        offence = offence + defence;
    }
public static void main(String[] args) {


    Country Afganistan = new Country("Afganistan",17418609000L, "natural gas, petroleum, coal, copper, chromite, talc, barites, sulfur, lead, zinc, iron ore, salt, precious and semiprecious stones, arable land", false);
    Country USA = new Country("United States of America", 784740000000L, "coal, copper, lead, molybdenum, phosphates, rare earth elements, uranium, bauxite, gold, iron, mercury, nickel, potash, silver, tungsten, zinc, petroleum, natural gas, timber, arable land", true);
    Country Sweden = new Country("Sweden" ,5222800000L, "iron ore, copper, lead, zinc, gold, silver, tungsten, uranium, arsenic, feldspar, timber, hydropower", false);
    Country Norway = new Country("The Kingdom of Norway" ,5676300000L, "petroleum, natural gas, iron ore, copper, lead, zinc, titanium, pyrites, nickel, fish, timber, hydropower", false);
    Country IsleOfMan = new Country("Isle of Man" ,0L, "null", false);
    Country Togo = new Country("Togo", 174080000L, "phosphates, limestone, marble, arable land", false);
    Country AtlanticOcean = new Country("The Atlantic Ocean" ,0L, "fish and shit"/* Not to be confused with fish and chips*/, false);
    Country NorfolkIsland = new Country("Norfolk Island" ,0L, "fish", false);
    Country Jersey = new Country("Jersey (no, not that Jersey. The old one.)" ,0L, "arable land", false);
    Country Austria = new Country("Austria" ,2228050000L, "oil, coal, lignite, timber, iron ore, copper, zinc, antimony, magnesite, tungsten, graphite, salt, hydropower", false);
    Country AntiguaAndBarbuda = new Country("Antigua and Barbuda" ,0L, "NEGL; pleasant climate fosters tourism, prostitution", false);
    Country Aruba = new Country("Aruba" ,0L, "NEGL; white sandy beaches foster tourism, transit point for US- and Europe-bound narcotics with some accompanying money-laundering activity; relatively high percentage of population consumes cocaine", false);
    Country Algeria = new Country("Algeria", 26015360000L, "petroleum, natural gas, iron ore, phosphates, uranium, lead, zinc", false);
    Country Fiji = new Country("Fiji", 118540800L, "timber, fish, gold, copper, offshore oil potential, hydropower", false);
    Country Akrotiri = new Country("Akrotiri", 0L, "null", false);


    for (int i = 0; i < Countries.size(); i++) {
        System.out.println(Countries.get(i).name);
    }

    //System.out.println(Countries.get(1).name);




}}
