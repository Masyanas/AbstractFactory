package factory.enginery.ussr;

import factory.enginery.EngineryFactory;
import model.aircraft.Aircraft;
import model.aircraft.ussr.Il2_Aircraft;
import model.tank.ussr.T34_Tank;
import model.tank.Tank;

public class USSREngineryFactory implements EngineryFactory {

    @Override
    public Tank createTank() {
        return new T34_Tank();
    }

    @Override
    public Aircraft createAircraft() {
        return new Il2_Aircraft();
    }
}
