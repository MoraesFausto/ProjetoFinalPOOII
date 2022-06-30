/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.fausto.pfboxe.modelo.dao;

import java.util.List;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.Cliente;
/**
 *
 * @author FaustoMoraes
 */
public interface ClienteDAO {
    void salvar(Cliente cliente);
    void atualizar(Cliente cliente);
    void excluir(Cliente cliente);
    
    List<Cliente> listarTodos();
    Cliente listarUm(Long id);
    Cliente listarPes(Long id);

}
