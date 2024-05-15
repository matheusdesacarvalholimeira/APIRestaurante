package Restaurante.API.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "funcionarios")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID idFuncionario;
    String nome;
    String CPF;
    Date dataNasc;


}
