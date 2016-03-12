package model.aircraft.ussr;

import model.aircraft.Aircraft;

public class Il2_Aircraft extends Aircraft {

    private static final String NAME = "Il-2";
    private static final String COUNTRY = "USSR";

    public String getDescription() {
        return NAME + " " + COUNTRY;
    }

}
