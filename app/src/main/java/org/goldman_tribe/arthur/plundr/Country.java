package org.goldman_tribe.arthur.plundr;

/**
 * Created by gnome2 on 10/31/2016.
 */

public class Country {

    long defence;
    String resources;
    public Country(long defenceBudget, String NR, boolean IsImp){
        defence = defenceBudget;
        resources = NR;

    }
    public void capture(long offence) {
        //the offence variable is a place holder until I determine what it should be called
        offence = offence + defence;
    }
public static void main(String[] args) {
    Country Afganistan = new Country(17418609000L, "natural gas, petroleum, coal, copper, chromite, talc, barites, sulfur, lead, zinc, iron ore, salt, precious and semiprecious stones, arable land", false);
    Country US = new Country(784740000000L, "coal, copper, lead, molybdenum, phosphates, rare earth elements, uranium, bauxite, gold, iron, mercury, nickel, potash, silver, tungsten, zinc, petroleum, natural gas, timber, arable land", true);
    Country Sweden = new Country(5222800000L, "iron ore, copper, lead, zinc, gold, silver, tungsten, uranium, arsenic, feldspar, timber, hydropower", false);
    Country Norway = new Country(5676300000L, "petroleum, natural gas, iron ore, copper, lead, zinc, titanium, pyrites, nickel, fish, timber, hydropower", false);
    Country IsleOfMan = new Country(0L, "None", false);
    Country Togo = new Country(174080000L, "phosphates, limestone, marble, arable land", false);
    Country AtlanticOceon = new Country(0L, "fish and shit"/* Not to be confused with fish and chips*/, false);
    Country NorfolkIsland = new Country(0L, "fish", false);

}



}
