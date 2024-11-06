package br.com.desafiofsbr.bean;

import br.com.desafiofsbr.model.Cliente;
import br.com.desafiofsbr.service.ClienteService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.json.JsonObject;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;

import org.hibernate.service.spi.InjectService;

import java.util.List;

@Named
@RequestScoped
public class ClienteBean {
    private Cliente cliente = new Cliente();
    private List<Cliente> clientes;

    @Inject
    ClienteService clienteService;

    public void salvar() {
        clienteService.salvar(cliente);
        cliente = new Cliente();
        listarTodos();
    }
    
    
    public void listarTodos() {
        clientes = clienteService.listarTodos();
    }

    public void excluir(Long id) {
        clienteService.remover(id);
        listarTodos();
    }
    
    public void consultarEndereco() {
        if (cliente.getCep() != null && !cliente.getCep().isEmpty()) {
            // Consumir a API ViaCEP para obter o endereço 
            Client client = ClientBuilder.newClient();
            WebTarget target = client.target("https://viacep.com.br/ws/" + cliente.getCep() + "/json/");
            Response response = target.request().get();
            if (response.getStatus() == 200) {
                JsonObject json = response.readEntity(JsonObject.class);
                cliente.setEndereco(json.getString("logradouro"));
                cliente.setBairro(json.getString("bairro"));
                cliente.setCidade(json.getString("localidade"));
                cliente.setEstado(json.getString("uf"));
            }
        }
    }

    
}