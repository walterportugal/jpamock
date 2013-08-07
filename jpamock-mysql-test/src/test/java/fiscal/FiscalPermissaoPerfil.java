package fiscal;

// Generated 14/08/2007 14:24:52 by Hibernate Tools 3.2.0.b9

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PermissaoPerfil generated by hbm2java
 */
@Entity
@Table(name = "TBPERMISSAO_PERFIL")
public class FiscalPermissaoPerfil implements java.io.Serializable {

	private Long id;
	private FiscalPerfil perfil;
	private FiscalFuncionalidade funcionalidade;
	private boolean ler;
	private boolean gravar;
	private boolean excluir;

	public FiscalPermissaoPerfil() {
	}

	public FiscalPermissaoPerfil(Long id, FiscalPerfil perfil, FiscalFuncionalidade funcionalidade) {
		this.id = id;
		this.perfil = perfil;
		this.funcionalidade = funcionalidade;
	}

	public FiscalPermissaoPerfil(Long id, FiscalPerfil perfil, FiscalFuncionalidade funcionalidade, boolean ler, boolean gravar,
			boolean excluir) {
		this.id = id;
		this.perfil = perfil;
		this.funcionalidade = funcionalidade;
		this.ler = ler;
		this.gravar = gravar;
		this.excluir = excluir;
	}

	@Id
	@GeneratedValue
	@Column(name = "PERMISSAO_PERFIL_ID", unique = true, nullable = false, precision = 18, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PERFIL_ID", nullable = false)
	public FiscalPerfil getPerfil() {
		return this.perfil;
	}

	public void setPerfil(FiscalPerfil perfil) {
		this.perfil = perfil;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FUNCIONALIDADE_ID", nullable = false)
	public FiscalFuncionalidade getFuncionalidade() {
		return this.funcionalidade;
	}

	public void setFuncionalidade(FiscalFuncionalidade funcionalidade) {
		this.funcionalidade = funcionalidade;
	}

	@Column(name = "LER", precision = 1, scale = 0)
	public boolean isLer() {
		return this.ler;
	}

	public void setLer(boolean ler) {
		this.ler = ler;
	}

	@Column(name = "GRAVAR", precision = 1, scale = 0)
	public boolean isGravar() {
		return this.gravar;
	}

	public void setGravar(boolean gravar) {
		this.gravar = gravar;
	}

	@Column(name = "EXCLUIR", precision = 1, scale = 0)
	public boolean isExcluir() {
		return this.excluir;
	}

	public void setExcluir(boolean excluir) {
		this.excluir = excluir;
	}

	// The following is extra code specified in the hbm.xml files
	private static final long serialVersionUID = 1L;
	// end of extra code specified in the hbm.xml files

}
