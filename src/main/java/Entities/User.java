package Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column
    private String pesel;
    @Column
    private String lastName;
    @Column
    private int quarantine;
    @Column
    private int recovered;
    @Column
    private int infected;
    @Column
    private int dead;
}