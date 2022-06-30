/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.fausto.pfboxe.modelo.rn;

import org.hibernate.HibernateException;
import java.util.List;

import br.edu.utfpr.fausto.pfboxe.modelo.dao.SessaoDAO;
import br.edu.utfpr.fausto.pfboxe.modelo.dao.SessaoDAOImpl;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.Sessao;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.tipoSessao;

/**
 *
 * @author FaustoMoraes
 */
public class SessaoRN {
    SessaoDAO SessaoDAO;

    public SessaoRN() {
        SessaoDAO = new SessaoDAOImpl();
    }

    public void salvar(Sessao Sessao) {
        // Validações antes de salvar Sessao
        try {
            SessaoDAO.salvar(Sessao);
        } catch (HibernateException he) {
            System.out.println(he);
        }
    }

    public List<Sessao> listaTodos() {
        return SessaoDAO.listarTodos();
    }

    public Sessao listarUm(Long id) {
        return SessaoDAO.listarUm(id);
    }
    
    public Sessao listarDesc(String descricao) {
        return SessaoDAO.listarDesc(descricao);
    }

    public void atualizar(Sessao Sessao) {
        SessaoDAO.atualizar(Sessao);
    }

    public void excluir(Sessao Sessao) {
        SessaoDAO.excluir(Sessao);
    }
}
