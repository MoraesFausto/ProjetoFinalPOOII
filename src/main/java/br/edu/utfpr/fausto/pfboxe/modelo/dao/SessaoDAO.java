/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.fausto.pfboxe.modelo.dao;

import java.util.List;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.Sessao;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.tipoSessao;

/**
 *
 * @author FaustoMoraes
 */
public interface SessaoDAO {
    void salvar(Sessao sessao);
    void atualizar(Sessao sessao);
    void excluir(Sessao sessao);
    
    List<Sessao> listarTodos();
    Sessao listarUm(Long id);
    Sessao listarDesc(String descricao);

}

