/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.fausto.pfboxe.modelo.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.Sessao;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.tipoSessao;
/**
 *
 * @author f4ustx
 */
public class SessaoDAOImpl implements SessaoDAO {
    EntityManager manager;
    
    public SessaoDAOImpl(){
        manager = ConexaoHibernate.getInstance();
    }
    
    @Override
    public void salvar(Sessao sessao) {
        manager.getTransaction().begin();
            manager.persist(sessao);
        manager.getTransaction().commit();
    }

    @Override
    public void atualizar(Sessao sessao) {
        manager.getTransaction().begin();
            manager.merge(sessao);
        manager.getTransaction().commit();
    }

    @Override
    public void excluir(Sessao sessao) {
        manager.getTransaction().begin();
            manager.remove(sessao);
        manager.getTransaction().commit();
    }

    @Override
    public List<Sessao> listarTodos() {
        List <Sessao> sessoes;
        
        Query query = manager.createQuery("SELECT s FROM Sessao s");
        sessoes = query.getResultList();
        
        return sessoes;                
    }

    @Override
    public Sessao listarUm(Long id) {
        Sessao sessao;
        
        Query query = manager.createQuery("SELECT s FROM Sessao s WHERE s.codigo=" + id);
        sessao = (Sessao) query.getSingleResult();
        
        return sessao;
    }
    
    @Override
    public Sessao listarDesc(String descricao){
        List<Sessao> sessoes;
        
        Query query = manager.createQuery("SELECT s FROM Sessao s WHERE s.tiposessao LIKE '%" + descricao + "%'");
        sessoes = query.getResultList();
        
        return sessoes.get(0);
    }

}
