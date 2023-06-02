package br.senac.sp.epictask.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Tarefa {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private String nome;
    
    private int nota;
    private String situacao;
    
    
    
    public int getNota() {
        return nota;
    }
    
    public void setNota(int nota) {
        this.nota = nota;
    }
    
    public String getSituacao() {
        return situacao;
    }
    
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
