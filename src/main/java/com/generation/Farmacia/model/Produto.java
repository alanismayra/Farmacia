package com.generation.Farmacia.model;

	import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

    import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
    import jakarta.persistence.ManyToOne;
    import jakarta.persistence.Table;
	import jakarta.validation.constraints.NotNull;
    import jakarta.validation.constraints.Size;

	@Entity
	@Table(name = "tb_produto")
	public class Produto {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotNull(message = "Este campo NOME é de preenchimento obrigatório")
		private String nome;
		
		@Size(min = 5, max = 1000, message = "Este atributo tem que ter no mínimo 10 caracteres e no máximo 1000 caracteres")
		private String marca;
		
		@Size(min = 5, max = 1000, message = "Este atributo tem que ter no mínimo 10 caracteres e no máximo 1000 caracteres")
		private String descricao;
		
		@ManyToOne 
		@JsonIgnoreProperties("produto")
		private Categoria categoria;


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

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		
		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}

		

		

}
