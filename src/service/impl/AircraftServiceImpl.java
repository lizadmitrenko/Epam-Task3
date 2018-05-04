package service.impl;

public class AircraftServiceImpl {
    private static AircraftServiceImpl ourInstance = new AircraftServiceImpl();

    public static AircraftServiceImpl getInstance() {
        return ourInstance;
    }

    private AircraftServiceImpl() {
    }
}
