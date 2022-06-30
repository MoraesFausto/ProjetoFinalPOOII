/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.fausto.pfboxe.modelo.rn;

import br.edu.utfpr.fausto.pfboxe.modelo.dao.TreinadorDAO;
import br.edu.utfpr.fausto.pfboxe.modelo.dao.TreinadorDAOImpl;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.Categoria;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.Treinador;
import java.util.List;
import org.hibernate.HibernateException;
/**
 *
 * @author FaustoMoraes
 */
public class TreinadorRN {
    private TreinadorDAO treinadorDAO;
    
    public TreinadorRN(){
        treinadorDAO = new TreinadorDAOImpl();
    }
    
    public void salvar(Treinador treinador){
        try{
            treinadorDAO.salvar(treinador);
        }catch(HibernateException he){
            System.out.println(he);
        }
    }
    
    public void atualizar(Treinador treinador){
        treinadorDAO.atualizar(treinador);
    }
    public void excluir(Treinador treinador){
        treinadorDAO.excluir(treinador);
    }
    
    public List<Treinador> listarTodos(){
        return treinadorDAO.listarTodos();
    }
    public boolean verificaCategoria(Categoria categoria){
        return treinadorDAO.verificaCategoria(categoria);
    }
    public Treinador listarUm(Long id){
        return treinadorDAO.listarUm(id);
    }
}
