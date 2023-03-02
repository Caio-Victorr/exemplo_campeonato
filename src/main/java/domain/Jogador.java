package domain;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@DiscriminatorValue("J")
public class Jogador extends Profissional{

    private String posicao;
    private boolean isTitular;
}
