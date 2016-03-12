import factory.enginery.EngineryFactory;
import factory.enginery.germany.GermanEngineryFactory;
import factory.enginery.ussr.USSREngineryFactory;
import model.aircraft.Aircraft;
import model.tank.Tank;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        EngineryFactory engineryFactory = new USSREngineryFactory();

        System.out.println("USSR enginery:");
        showEnginery(engineryFactory);

        System.out.println();

        System.out.println("German enginery:");
        engineryFactory = new GermanEngineryFactory();
        showEnginery(engineryFactory);
    }

    public static void showEnginery(EngineryFactory engineryFactory) {
        Tank tank = engineryFactory.createTank();
        System.out.println(tank.getDescription());

        Aircraft aircraft = engineryFactory.createAircraft();
        System.out.println(aircraft.getDescription());
    }
}
