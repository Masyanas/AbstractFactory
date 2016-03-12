package factory.enginery.germany;

import factory.enginery.EngineryFactory;
import model.aircraft.Aircraft;
import model.aircraft.germany.MesserschmittBf110_Aircraft;
import model.tank.Tank;
import model.tank.germany.E25_Tank;

public class GermanEngineryFactory implements EngineryFactory {

    @Override
    public Tank createTank() {
        return new E25_Tank();
    }

    @Override
    public Aircraft createAircraft() {
        return new MesserschmittBf110_Aircraft();
    }

}
