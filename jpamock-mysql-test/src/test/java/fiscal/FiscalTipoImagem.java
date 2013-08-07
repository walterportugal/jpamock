package fiscal;

// Generated 10/07/2009 10:49:54 by Hibernate Tools 3.2.0.b9

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Municipio generated by hbm2java
 */
@Entity
@Table(name = "TBTIPO_IMAGEM")
public class FiscalTipoImagem implements java.io.Serializable {

	private Long id;
	private String nome;
	private String descricao;

	public FiscalTipoImagem() {
	}

	public FiscalTipoImagem(Long id) {
		this.id = id;
	}

	public FiscalTipoImagem(Long id, String nome, String descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

	@Id
	@GeneratedValue
	@Column(name = "TIPO_IMAGEM_ID", unique = true, nullable = false, precision = 38, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "NOME", length = 50)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "DESCRICAO", length = 250)
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// The following is extra code specified in the hbm.xml files
	private static final long serialVersionUID = 1L;
	// end of extra code specified in the hbm.xml files

}
