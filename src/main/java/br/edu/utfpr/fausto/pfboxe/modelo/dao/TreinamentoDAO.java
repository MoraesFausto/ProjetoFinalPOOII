/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.fausto.pfboxe.modelo.dao;

import java.util.List;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.Treinamento;

/**
 *
 * @author FaustoMoraes
 */
public interface TreinamentoDAO {
    void salvar(Treinamento treinamento);

    void atualizar(Treinamento treinamento);

    void excluir(Treinamento treinamento);
  
    List<Treinamento> listarTodos();

    Treinamento listarUm(Long id);
    
    Treinamento listarDesc(String descricao);

}
