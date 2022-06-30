/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.fausto.pfboxe.modelo.vo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author FaustoMoraes
 */
@Entity
@Table(name = "Treinador")
public class Treinador extends Pessoa {

    @Column(nullable = false)
    private String licenca;

    @Enumerated(EnumType.STRING)
    private tipoTreinador tipo;

    @ManyToOne
    private Categoria categoria;

    @OneToMany(mappedBy = "treinador")
    List<Sessao> sessoes;


    public void setBolsaTreinador() {
        if (this.getBolsa() < .3)
            this.setBolsa((float) .3);
    }

    public String getLicenca() {
        return licenca;
    }

    public void setLicenca(String licenca) {
        this.licenca = licenca;
    }

    public tipoTreinador getTipo() {
        return tipo;
    }

    public void setTipo(tipoTreinador tipo) {
        this.tipo = tipo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }

}

