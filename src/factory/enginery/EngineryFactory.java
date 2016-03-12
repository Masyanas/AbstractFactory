package factory.enginery;

import model.aircraft.Aircraft;
import model.tank.Tank;

public interface EngineryFactory {

    Tank createTank();

    Aircraft createAircraft();

}
