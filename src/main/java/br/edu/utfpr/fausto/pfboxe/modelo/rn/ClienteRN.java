/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.fausto.pfboxe.modelo.rn;
import br.edu.utfpr.fausto.pfboxe.modelo.dao.ClienteDAO;
import br.edu.utfpr.fausto.pfboxe.modelo.dao.ClienteDAOImpl;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.Cliente;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author FaustoMoraes
 */
public class ClienteRN {
     private ClienteDAO clienteDao;
    
    public ClienteRN() {
        clienteDao = new ClienteDAOImpl();
    }
    
    public void salvar(Cliente cliente) {
        // Validações antes de salvar cliente
        try {
            clienteDao.salvar(cliente);
        } catch (HibernateException he) {
            System.out.println(he); 
        }
    }
    
    public List<Cliente> listaTodos() {
        return clienteDao.listarTodos();
    }
    
    public Cliente listarUm(Long id) {
        return clienteDao.listarUm(id);
    }
    
    public Cliente listarPes(Long id) {
        return clienteDao.listarPes(id);
    }
    
    public void atualizar(Cliente cliente) {
        clienteDao.atualizar(cliente);
    }
    
    public void excluir(Cliente cliente) {
        clienteDao.excluir(cliente);
    }
    
}   

