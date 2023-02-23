package domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public abstract class Profissional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = false)
    private String nome;
    @Column(unique = true, nullable = false)
    private String cpf;
}
