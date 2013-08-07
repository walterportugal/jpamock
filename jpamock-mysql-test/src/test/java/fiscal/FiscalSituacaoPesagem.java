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
 * SituacaoPesagem generated by hbm2java
 */
@Entity
@Table(name = "TBSITUACAO_PESAGEM")
public class FiscalSituacaoPesagem implements java.io.Serializable {

	private Long id;
	private String nome;
	private String descricao;
	private List<FiscalHistoricoTicket> historicoTickets = new ArrayList<FiscalHistoricoTicket>(0);
	private List<FiscalTicket> tickets = new ArrayList<FiscalTicket>(0);

	public FiscalSituacaoPesagem() {
	}

	public FiscalSituacaoPesagem(Long id) {
		this.id = id;
	}

	public FiscalSituacaoPesagem(Long id, String nome, String descricao, List<FiscalHistoricoTicket> historicoTickets,
			List<FiscalTicket> tickets) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.historicoTickets = historicoTickets;
		this.tickets = tickets;
	}

	@Id
	@GeneratedValue
	@Column(name = "SITUACAO_PESAGEM_ID", unique = true, nullable = false, precision = 38, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "NOME", length = 50)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "DESCRICAO", length = 100)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "situacaoPesagem")
	public List<FiscalHistoricoTicket> getHistoricoTickets() {
		return this.historicoTickets;
	}

	public void setHistoricoTickets(List<FiscalHistoricoTicket> historicoTickets) {
		this.historicoTickets = historicoTickets;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "situacaoPesagem")
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
