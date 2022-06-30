/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.fausto.pfboxe.modelo.dao;

import java.util.List;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.Categoria;

/**
 *
 * @author FaustoMoraes
 */
public interface CategoriaDAO {
    void salvar(Categoria categoria);
    void atualizar(Categoria categoria);
    void excluir(Categoria categoria);
    
    List<Categoria> listarTodos();
    Categoria listarUm(Long id);
    Categoria listarDesc(String desc);

}