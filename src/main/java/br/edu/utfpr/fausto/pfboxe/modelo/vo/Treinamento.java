/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.fausto.pfboxe.modelo.vo;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author FaustoMoraes
 */

@Entity
@Table(name = "Treinamento")
public class Treinamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(nullable = false)
    private float valor;

    @Column(nullable = false, length = 25)
    private String tr_desc;

    @Column(nullable = false)
    private boolean pagamento;
    
    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Categoria categoria;
    
    @ManyToOne
    private Sessao sessao;

    @Enumerated(EnumType.STRING)
    private tipoTreinamento tipo;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public float getValor() {
        float valorFinal = valor - valor * cliente.getBolsa();
        return valorFinal;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDesc() {
        return tr_desc;
    }

    public void setDesc(String desc) {
        this.tr_desc = desc;
    }

    public boolean getPagamento() {
        return pagamento;
    }

    public void setPagamento(boolean pagamento) {
        this.pagamento = pagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public tipoTreinamento getTipo() {
        return tipo;
    }

    public void setTipo(tipoTreinamento tipo) {
        this.tipo = tipo;
    }
    
    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

 }

