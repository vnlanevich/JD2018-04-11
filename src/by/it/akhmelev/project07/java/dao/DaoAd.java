package by.it.akhmelev.project07.java.dao;


import by.it.akhmelev.project07.java.beans.Ad;
import by.it.akhmelev.project07.java.dao.UniversalDAO;

public class DaoAd extends UniversalDAO<Ad> {
    public DaoAd() {
        super(new Ad(), "ads");
    }
}
