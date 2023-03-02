package dao;

import domain.Profissional;
import domain.Tecnico;

import javax.persistence.Query;
import java.util.List;

public class TecnicoDAO extends ProfissionalDAO{

    public void saveOrUpdate(Tecnico tecnico) {
        saveOrUpdate(tecnico);
    }
    public Tecnico findById(Class clazz, Long id) {
        return findById(clazz, id);
    }

    public void remove(Tecnico tecnico) {
        remove(tecnico);
    }

    public List<Tecnico> finAll(){
        Query query = getJpaPersistence().getEm().createNamedQuery("tecnico.findAll");
        return query.getResultList();
    }
}
