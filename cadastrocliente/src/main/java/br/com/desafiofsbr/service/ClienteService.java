package br.com.desafiofsbr.service;

import br.com.desafiofsbr.model.Cliente;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


public class ClienteService {
    @PersistenceContext
    private EntityManager em;

    public void salvar(Cliente cliente) {
        em.persist(cliente);
    }

    public Cliente buscarPorId(Long id) {
        return em.find(Cliente.class, id);
    }

    public List<Cliente> listarTodos() {
        return em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
    }

    public void atualizar(Cliente cliente) {
        em.merge(cliente);
    }

    public void remover(Long id) {
        Cliente cliente = buscarPorId(id);
        if (cliente != null) {
            em.remove(cliente);
        }
    }
}

