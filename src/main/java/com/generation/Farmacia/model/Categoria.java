package com.generation.Farmacia.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Este atributo é de preenchimento obrigatório")
	@Size(min = 5, max = 100, message = "Este atributo tem que ter no mínimo 5 caracteres e no máximo 100 caracteres")
	private String nome;

	
	@Size(min = 10, max = 1000, message = "Este atributo tem que ter no mínimo 10 caracteres e no máximo 1000 caracteres")
	private String descricao;

	@Size(min = 5, max = 1000, message = "Este atributo tem que ter no mínimo 10 caracteres e no máximo 1000 caracteres")
	private String datadeValidade;
	
	@OneToMany (fetch = FetchType.LAZY, mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	private List <Produto> produto;


	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDatadeValidade() {
		return datadeValidade;
	}

	public void setDatadeValidade(String datadeValidade) {
		this.datadeValidade = datadeValidade;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	
	

}