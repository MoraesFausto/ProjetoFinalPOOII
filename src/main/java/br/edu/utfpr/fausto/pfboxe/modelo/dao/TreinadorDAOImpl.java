/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.fausto.pfboxe.modelo.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.Treinador;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.Categoria;


/**
 *
 * @author f4ustx
 */
public class TreinadorDAOImpl implements TreinadorDAO {
        EntityManager manager;

    public TreinadorDAOImpl(){
        manager = ConexaoHibernate.getInstance();
    }
    
    @Override
    public void salvar(Treinador treinador) {
        treinador.setBolsaTreinador();
        manager.getTransaction().begin();
            manager.persist(treinador);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(Treinador treinador) {
        manager.getTransaction().begin();
            manager.merge(treinador);
        manager.getTransaction().commit();
    }

    @Override
    public void excluir(Treinador treinador) {
        manager.getTransaction().begin();
            manager.remove(treinador);
        manager.getTransaction().commit();
    }

    @Override
    public List<Treinador> listarTodos() {
        List<Treinador> treinadores;
        
        Query query = manager.createQuery("SELECT t FROM Treinador t");
        treinadores = query.getResultList();
     
        return treinadores;
    }

    @Override
    public Treinador listarUm(Long id) {
        Treinador treinador;
        
        Query query = manager.createQuery("SELECT t FROM Treinador t WHERE t.codigo = " + id);
        treinador = (Treinador)query.getSingleResult();
        
        return treinador;
    }

    @Override
    public boolean verificaCategoria(Categoria categoria) {
        List<Treinador> treinadores = listarTodos();
        
        for(Treinador t : treinadores){
            if(t.getCategoria() != null && t.getCategoria().getCodigo() == categoria.getCodigo()){
                return true;
            }
        }
        
        return false;
    }
}
