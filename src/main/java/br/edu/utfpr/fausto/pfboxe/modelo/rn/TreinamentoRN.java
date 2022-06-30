/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.fausto.pfboxe.modelo.rn;

import org.hibernate.HibernateException;
import java.util.List;

import br.edu.utfpr.fausto.pfboxe.modelo.dao.TreinamentoDAO;
import br.edu.utfpr.fausto.pfboxe.modelo.dao.TreinamentoDAOImpl;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.Treinamento;

/**
 *
 * @author FaustoMoraes
 */
public class TreinamentoRN {
    TreinamentoDAO treinamentoDAO;

    public TreinamentoRN() {
        treinamentoDAO = new TreinamentoDAOImpl();
    }

    public void salvar(Treinamento treinamento) {

        // Validações antes de salvar Treinamento

        try {
            treinamentoDAO.salvar(treinamento);
        } catch (org.hibernate.ObjectNotFoundException err) {
            System.out.println(err);
        } catch (HibernateException he) {
            System.out.println(he);
        }

    }

    public List<Treinamento> listaTodos() {
        return treinamentoDAO.listarTodos();
    }

    public Treinamento listarUm(Long id) {
        return treinamentoDAO.listarUm(id);
    }

    public void atualizar(Treinamento Treinamento) {
        treinamentoDAO.atualizar(Treinamento);
    }

    public void excluir(Treinamento Treinamento) {
        treinamentoDAO.excluir(Treinamento);
    }

    public Treinamento listarDesc(String treinamento){
        return treinamentoDAO.listarDesc(treinamento);
    }

}
