package dao;

import domain.Campeonato;
import persistance.JpaPersistence;

public class CampeonatoDAO implements GenericDAO<Campeonato> {

    private JpaPersistence jpaPersistence;

    public CampeonatoDAO(){
        this.jpaPersistence = new JpaPersistence();
    }

    @Override
    public void saveOrUpdate(Campeonato campeonato) {
        this.jpaPersistence.getEm().getTransaction().begin();
        this.getJpaPersistence().getEm().persist(campeonato);
        this.getJpaPersistence().getEm().getTransaction().commit();
    }
    @Override
    public Campeonato findById(Class clazz, Long id) {
        return (Campeonato) this.getJpaPersistence().getEm().find(clazz, id);
    }
    @Override
    public void remove(Campeonato campeonato) {
        this.getJpaPersistence().getEm().remove(campeonato);
        this.getJpaPersistence().getEm().getTransaction().commit();

    }
    public JpaPersistence getJpaPersistence() {
        return jpaPersistence;
    }
}
