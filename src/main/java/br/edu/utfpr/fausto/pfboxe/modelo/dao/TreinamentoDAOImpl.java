/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.fausto.pfboxe.modelo.dao;

import br.edu.utfpr.fausto.pfboxe.modelo.vo.Categoria;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.ObjectNotFoundException;

import br.edu.utfpr.fausto.pfboxe.modelo.vo.Treinador;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.Treinamento;

/**
 *
 * @author f4ustx
 */
public class TreinamentoDAOImpl implements TreinamentoDAO {
    EntityManager manager;

    public TreinamentoDAOImpl() {
        manager = ConexaoHibernate.getInstance();
    }

    @Override
    public void salvar(Treinamento treinamento) {
        manager.getTransaction().begin();
        manager.persist(treinamento);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(Treinamento treinamento) {
        manager.getTransaction().begin();
        manager.merge(treinamento);
        manager.getTransaction().commit();
    }

    @Override
    public void excluir(Treinamento treinamento) {
        manager.getTransaction().begin();
        manager.remove(treinamento);
        manager.getTransaction().commit();
    }

    @Override
    public List<Treinamento> listarTodos() {
        List<Treinamento> treinamentos;

        Query query = manager.createQuery("SELECT t FROM Treinamento t");
        treinamentos = query.getResultList();
 
        return treinamentos;
    }

    @Override
    public Treinamento listarUm(Long id) {
        Treinamento treinamento;

        Query query = manager.createQuery("SELECT t FROM Treinamento t WHERE t.codigo = " + id);
        treinamento = (Treinamento) query.getSingleResult();
        return treinamento;
    }
   
    @Override
    public Treinamento listarDesc(String descricao){
        List<Treinamento> treinamentos;

        Query query = manager.createQuery("SELECT t FROM Treinamento t WHERE t.tr_desc LIKE '%" + descricao + "%'");
        treinamentos = query.getResultList();
        return treinamentos.get(0);
    }

}
