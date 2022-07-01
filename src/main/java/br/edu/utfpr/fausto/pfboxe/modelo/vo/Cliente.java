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
@Table(name = "Cliente")
public class Cliente extends Pessoa {

     @Enumerated(EnumType.STRING)
    private tipoCliente ranking;

    public tipoCliente getRanking() {
        return ranking;
    }

    public void setRanking(tipoCliente ranking) {
        this.ranking = ranking;
    }
    
}

