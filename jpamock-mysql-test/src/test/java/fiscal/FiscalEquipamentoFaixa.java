package fiscal;

// Generated 10/07/2009 10:49:54 by Hibernate Tools 3.2.0.b9

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * EquipamentoFaixa generated by hbm2java
 */
@Entity
@Table(name = "TBEQUIPAMENTO_FAIXA")
public class FiscalEquipamentoFaixa implements java.io.Serializable {

	private Long id;
	private FiscalEquipamento equipamento;
	private FiscalUnidadeFiscal unidadeFiscal;
	private FiscalLocal local;
	private FiscalAcaoTicket acaoTicket;
	private String sentido;
	private Long faixa;
	private List<FiscalTrafego> trafegos = new ArrayList<FiscalTrafego>(0);
	@SuppressWarnings("unused") private boolean equipamentoDeEntrada;

	public FiscalEquipamentoFaixa() {
	}

	public FiscalEquipamentoFaixa(Long id, FiscalEquipamento equipamento, FiscalUnidadeFiscal unidadeFiscal, FiscalLocal local,
			FiscalAcaoTicket acaoTicket) {
		this.id = id;
		this.equipamento = equipamento;
		this.unidadeFiscal = unidadeFiscal;
		this.local = local;
		this.acaoTicket = acaoTicket;
	}

	public FiscalEquipamentoFaixa(Long id, FiscalEquipamento equipamento, FiscalUnidadeFiscal unidadeFiscal, FiscalLocal local,
			FiscalAcaoTicket acaoTicket, String sentido, Long faixa, List<FiscalTrafego> trafegos) {
		this.id = id;
		this.equipamento = equipamento;
		this.unidadeFiscal = unidadeFiscal;
		this.local = local;
		this.acaoTicket = acaoTicket;
		this.sentido = sentido;
		this.faixa = faixa;
		this.trafegos = trafegos;
	}

	@Id
	@GeneratedValue
	@Column(name = "EQUIPAMENTO_FAIXA_ID", unique = true, nullable = false, precision = 38, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EQUIPAMENTO_ID", nullable = false)
	public FiscalEquipamento getEquipamento() {
		return this.equipamento;
	}

	public void setEquipamento(FiscalEquipamento equipamento) {
		this.equipamento = equipamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNIDADE_FISCAL_ID", nullable = false)
	public FiscalUnidadeFiscal getUnidadeFiscal() {
		return this.unidadeFiscal;
	}

	public void setUnidadeFiscal(FiscalUnidadeFiscal unidadeFiscal) {
		this.unidadeFiscal = unidadeFiscal;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LOCAL_ID", nullable = false)
	public FiscalLocal getLocal() {
		return this.local;
	}

	public void setLocal(FiscalLocal local) {
		this.local = local;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ACAO_TICKET_ID", nullable = false)
	public FiscalAcaoTicket getAcaoTicket() {
		return this.acaoTicket;
	}

	public void setAcaoTicket(FiscalAcaoTicket acaoTicket) {
		this.acaoTicket = acaoTicket;
	}

	@Column(name = "SENTIDO", length = 50)
	public String getSentido() {
		return this.sentido;
	}

	public void setSentido(String sentido) {
		this.sentido = sentido;
	}

	@Column(name = "FAIXA", precision = 38, scale = 0)
	public Long getFaixa() {
		return this.faixa;
	}

	public void setFaixa(Long faixa) {
		this.faixa = faixa;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "equipamentoFaixa")
	public List<FiscalTrafego> getTrafegos() {
		return this.trafegos;
	}

	public void setTrafegos(List<FiscalTrafego> trafegos) {
		this.trafegos = trafegos;
	}

	@Transient
	public boolean isEquipamentoDeEntrada() {
		return FiscalAcaoTicketEnum.ABERTURA.compareTo(getAcaoTicket());
	}

	public void setEquipamentoDeEntrada(boolean equipamentoDeEntrada) {
		this.equipamentoDeEntrada = equipamentoDeEntrada;
	}

	// The following is extra code specified in the hbm.xml files
	private static final long serialVersionUID = 1L;
	// end of extra code specified in the hbm.xml files

}
