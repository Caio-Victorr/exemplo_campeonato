package dao;

import domain.Jogador;
import domain.Profissional;
import domain.Tecnico;

import javax.persistence.Query;
import java.util.List;

public class JogadorDAO extends ProfissionalDAO{

    public void saveOrUpdate(Jogador jogador) {
        saveOrUpdate(jogador);
    }
    public Jogador findById(Class clazz, Long id) {
        return findById(clazz, id);
    }

    public void remove(Jogador jogador) {
        super.remove(jogador);
    }

    public List<Jogador> finAll(){
        Query query = getJpaPersistence().getEm().createNamedQuery("jogador.findAll");
        return query.getResultList();
    }
}
