package by.it.kasiyanov.project.java.dao;

import by.it.kasiyanov.project.java.dao.resetdb.C_Init;

public class Dao {

    private static Dao dao;

    private Dao(){
        roles = new RolesDao();
        user = new UserDao();
        travelOffers = new TravelOffersDao();
    }

    public RolesDao roles;
    public UserDao user;
    public TravelOffersDao travelOffers;

    public static void reset(){
        C_Init.main(new String[]{});
    }

    public static Dao getDao() {
        if (dao == null)
            synchronized (Dao.class) {
                if (dao == null)
                    dao = new Dao();
            }
        return dao;
    }


}
