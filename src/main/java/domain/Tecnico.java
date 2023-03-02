package domain;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Data
@DiscriminatorValue("T")
public class Tecnico extends Profissional{

    @OneToOne
    private Equipe equipe;
}
