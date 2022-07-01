/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.fausto.pfboxe.modelo.vo;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author FaustoMoraes
 */
@Entity
@Table(name = "Sessao")
public class Sessao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
  
    @Enumerated(EnumType.STRING)
    private tipoSessao tiposessao;

    public tipoSessao getTiposessao() {
        return tiposessao;
    }

    public void setTiposessao(tipoSessao tiposessao) {
        this.tiposessao = tiposessao;
    }
    
    @ManyToOne
    private Treinamento treinamento;
    
    @ManyToOne
    private Treinador treinador;

    private tipoPeso peso;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    
    public Treinador getTreinador() {
        return treinador;
    }

    public Treinamento getTreinamento() {
        return treinamento;
    }

    public void setTreinamento(Treinamento treinamento) {
        this.treinamento = treinamento;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }

    public tipoPeso getPeso() {
        return peso;
    }

    public void setPeso(tipoPeso peso) {
        this.peso = peso;
    }

}

