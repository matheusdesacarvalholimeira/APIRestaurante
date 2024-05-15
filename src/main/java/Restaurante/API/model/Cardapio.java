package Restaurante.API.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "cardapio")
public class Cardapio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID idItem;
    String nome;
    int quantidade;
    boolean disponibilidade;
    float valor;

    public void setIdItem(UUID idItem) {
        this.idItem = idItem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public UUID getIdItem() {
        return idItem;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public float getValor() {
        return valor;
    }

    public Cardapio() {
    }
    public Cardapio(String nome, int quantidade, boolean disponibilidade, float valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.disponibilidade = disponibilidade;
        this.valor = valor;
    }





}
