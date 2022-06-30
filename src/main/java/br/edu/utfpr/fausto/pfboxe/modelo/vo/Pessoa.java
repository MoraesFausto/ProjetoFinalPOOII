/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.fausto.pfboxe.modelo.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author FaustoMoraes
 */
@Entity
@Table(name = "Pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
  
    @Column(nullable = false, unique = true, length = 11)
    private String cpf;
    
    @Column(nullable=false)
    private String nome;
    
    @Column(nullable=false)
    private int idade;
    
    @Column(nullable=false)
    private String sexo;

    @Column(nullable=false)
    private String telefone;
    
    @Column(nullable=false)
    private float bolsa;
    
    @Enumerated(EnumType.STRING)
    private tipoPeso tipopeso;


    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        if(this.bolsa < bolsa)
            this.bolsa = bolsa;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public tipoPeso getTipopeso() {
        return tipopeso;
    }

    public void setTipopeso(tipoPeso tipopeso) {
        this.tipopeso = tipopeso;
    }
    
    
   
}

