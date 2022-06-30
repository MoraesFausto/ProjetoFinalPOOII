/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.fausto.pfboxe.modelo.rn;
import br.edu.utfpr.fausto.pfboxe.modelo.dao.CategoriaDAO;
import br.edu.utfpr.fausto.pfboxe.modelo.dao.CategoriaDAOImpl;
import br.edu.utfpr.fausto.pfboxe.modelo.vo.Categoria;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author FaustoMoraes
 */
public class CategoriaRN {
    CategoriaDAO categoriaDAO;

    public CategoriaRN() {
        categoriaDAO = new CategoriaDAOImpl();
    }

    public void salvar(Categoria categoria) {
        // Validações antes de salvar categoria
        try {
            categoriaDAO.salvar(categoria);
        } catch (HibernateException he) {
            System.out.println(he);
        }
    }

    public List<Categoria> listaTodos() {
        return categoriaDAO.listarTodos();
    }

    public Categoria listarUm(Long id) {
        return categoriaDAO.listarUm(id);
    }
    public Categoria listarDesc(String desc) {
        return categoriaDAO.listarDesc(desc);
    }
    public void atualizar(Categoria categoria) {
        categoriaDAO.atualizar(categoria);
    }

    public void excluir(Categoria categoria) {
        categoriaDAO.excluir(categoria);
    }
}