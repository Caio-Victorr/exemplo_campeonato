package domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@DiscriminatorValue("T")
@NamedQueries({
        @NamedQuery(name = "tecnico.findAll", query = "select t from Tecnico t")
})
public class Tecnico extends Profissional{

    @OneToOne
    private Equipe equipe;
}
