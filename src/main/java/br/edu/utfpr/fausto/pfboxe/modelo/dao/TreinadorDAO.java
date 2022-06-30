/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.fausto.pfboxe.modelo.dao;

import br.edu.utfpr.fausto.pfboxe.modelo.vo.Categoria;
import java.util.List;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.Treinador;
/**
 *
 * @author FaustoMoraes
 */
public interface TreinadorDAO {
    void salvar(Treinador treinador);
    void atualizar(Treinador treinador);
    void excluir(Treinador treinador);
    
    List<Treinador> listarTodos();
    boolean verificaCategoria(Categoria categoria);
    Treinador listarUm(Long id);
}
