package org.goldman_tribe.arthur.plundr;

/**
 * Created by gnome2 on 10/31/2016.
 */

public class Country {

    long defence;
    String resources;
    public Country(long defenceBudget, String NR){
        defence = defenceBudget;
        resources = NR;

    }
    public void capture(long ofence) {
        //the next variable is a place holder until I determine what it should be called
        ofence = ofence + defence;
    }
public static void main(String[] args) {
    Country Afganistan = new Country(17418609000L, "natural gas, petroleum, coal, copper, chromite, talc, barites, sulfur, lead, zinc, iron ore, salt, precious and semiprecious stones, arable land" );
}



}
