/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.fausto.pfboxe.modelo.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import java.util.List;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.Categoria;
/**
 *
 * @author FaustoMoraes
 */
public class CategoriaDAOImpl implements CategoriaDAO {
    
    EntityManager manager;
    
    public CategoriaDAOImpl(){
        manager = ConexaoHibernate.getInstance();
    }
    
    @Override
    public void salvar(Categoria categoria) {
        manager.getTransaction().begin();
                manager.persist(categoria);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(Categoria categoria) {
        manager.getTransaction().begin();
            manager.merge(categoria);
        manager.getTransaction().commit();
    }

    @Override
    public void excluir(Categoria categoria) {
        manager.getTransaction().begin();
            manager.remove(categoria);
        manager.getTransaction().commit();
    }

    @Override
    public List<Categoria> listarTodos() {
        List<Categoria> categorias;
        TypedQuery<Categoria> query = manager.createQuery("SELECT c FROM Categoria c", Categoria.class);
        categorias = query.getResultList();
        return categorias;

    }

    @Override
    public Categoria listarUm(Long id) {
        Categoria categoria;
        Query query = manager.createQuery("SELECT c FROM Categoria c WHERE c.codigo = " + id);
        categoria = (Categoria)query.getSingleResult();
        return categoria;
    }
    
    @Override
    public Categoria listarDesc(String desc){
        List<Categoria> categorias;
        Query query = manager.createQuery("SELECT c FROM Categoria c WHERE c.descricao LIKE '%" + desc + "%'");
        categorias = query.getResultList();
        return categorias.get(0);
    }
    
}
