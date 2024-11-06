package br.com.desafiofsbr.model;

import javax.persistence.*;

@Entity
public class Cliente {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    private String nome;

	    @Column(nullable = false, unique = true)
	    private String email;

	    @Column(nullable = false)
	    private String telefone;

	    @Column(nullable = false)
	    private String cep;

	    @Column(nullable = false)
	    private String endereco;

	    @Column(nullable = false)
	    private String bairro;

	    @Column(nullable = false)
	    private String cidade;

	    @Column(nullable = false)
	    private String estado;
	    
	    public String getCep() {
	        return cep;
	    }

	    public void setCep(String cep) {
	        this.cep = cep;
	    }

	    public String getEndereco() {
	        return endereco;
	    }

	    public void setEndereco(String endereco) {
	        this.endereco = endereco;
	    }

	    public String getBairro() {
	        return bairro;
	    }

	    public void setBairro(String bairro) {
	        this.bairro = bairro;
	    }

	    public String getCidade() {
	        return cidade;
	    }

	    public void setCidade(String cidade) {
	        this.cidade = cidade;
	    }

	    public String getEstado() {
	        return estado;
	    }

	    public void setEstado(String estado) {
	        this.estado = estado;
	    }

	}