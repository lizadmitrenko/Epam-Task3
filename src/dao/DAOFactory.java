package dao;

import dao.impl.AircraftDAOImpl;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final AircraftDAO aircraftDAO = new AircraftDAOImpl();

    private DAOFactory() {}

    public AircraftDAO getApplianceDAO() {
        return aircraftDAO;
    }

    public static DAOFactory getInstance() {
        return instance;
    }
}
