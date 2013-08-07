package fiscal;

// Generated 10/07/2009 10:49:54 by Hibernate Tools 3.2.0.b9

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Infracao generated by hbm2java
 */
@Entity
@Table(name = "TBINFRACAO")
public class FiscalInfracao implements java.io.Serializable {

	private Long id;
	private Long codigo;
	private String descricaoResumida;
	private String descricaoDetalhada;
	private String unidadeMedida;
	private Double valor;
	private List<FiscalTicket> tickets = new ArrayList<FiscalTicket>(0);

	public FiscalInfracao() {
	}

	public FiscalInfracao(Long id) {
		this.id = id;
	}

	public FiscalInfracao(Long id, Long codigo, String descricaoResumida, String descricaoDetalhada, String unidadeMedida,
			Double valor, List<FiscalTicket> tickets) {
		this.id = id;
		this.codigo = codigo;
		this.descricaoResumida = descricaoResumida;
		this.descricaoDetalhada = descricaoDetalhada;
		this.unidadeMedida = unidadeMedida;
		this.valor = valor;
		this.tickets = tickets;
	}

	@Id
	@GeneratedValue
	@Column(name = "INFRACAO_ID", unique = true, nullable = false, precision = 38, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "CODIGO", precision = 38, scale = 0)
	public Long getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	@Column(name = "DESCRICAO_RESUMIDA", length = 50)
	public String getDescricaoResumida() {
		return this.descricaoResumida;
	}

	public void setDescricaoResumida(String descricaoResumida) {
		this.descricaoResumida = descricaoResumida;
	}

	@Column(name = "DESCRICAO_DETALHADA", length = 100)
	public String getDescricaoDetalhada() {
		return this.descricaoDetalhada;
	}

	public void setDescricaoDetalhada(String descricaoDetalhada) {
		this.descricaoDetalhada = descricaoDetalhada;
	}

	@Column(name = "UNIDADE_MEDIDA", length = 50)
	public String getUnidadeMedida() {
		return this.unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	@Column(name = "VALOR", precision = 50, scale = 0)
	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "infracao")
	public List<FiscalTicket> getTickets() {
		return this.tickets;
	}

	public void setTickets(List<FiscalTicket> tickets) {
		this.tickets = tickets;
	}

	// The following is extra code specified in the hbm.xml files
	private static final long serialVersionUID = 1L;
	// end of extra code specified in the hbm.xml files

}
