package service;

import service.impl.AircraftServiceImpl;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final AircraftService aircraftService = new AircraftServiceImpl();

    private ServiceFactory() {}

    public AircraftService getAircraftService() {

        return aircraftService;
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

}
