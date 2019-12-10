package v2;


import java.math.BigDecimal;
import java.util.Date;


public class Registro {

	private String nroEstabelecimento;
	private String identificador;
	private Date dataTransacao;
	private String modalidade;
	private String bandeira;
	private Integer nroParcelas;
	private String aquivo; //está escrito assim na planilha
	private Integer nroLinha;
	private String inconsistenciaEncontrada;
	private BigDecimal valorBruto;
	private BigDecimal valorLiquido;
	private BigDecimal taxaPraticada;
	private BigDecimal taxaContratada;
	private BigDecimal valorLiquidoCorrigido;
	private BigDecimal valorARessarcir;
	
	public Registro() {
		
	}
	
	public Registro(String nroEstabelecimento, String identificador, Date dataTransacao, String modalidade, String bandeira, Integer nroParcelas, String aquivo, Integer nroLinha, String inconsistenciaEncontrada, BigDecimal valorBruto, BigDecimal valorLiquido, BigDecimal taxaPraticada, BigDecimal taxaContratada, BigDecimal valorLiquidoCorrigido, BigDecimal valorARessarcir) {
		super();
		this.nroEstabelecimento=nroEstabelecimento;//get set
		this.identificador=identificador;//get set
		this.dataTransacao=dataTransacao;// get set
		this.modalidade=modalidade;
		this.bandeira=bandeira;
		this.nroParcelas=nroParcelas;
		this.aquivo=aquivo;
		this.nroLinha=nroLinha;
		this.inconsistenciaEncontrada=inconsistenciaEncontrada;
		this.valorBruto=valorBruto;
		this.valorLiquido=valorLiquido;
		this.taxaPraticada=taxaPraticada;
		this.taxaContratada=taxaContratada;
		this.valorLiquidoCorrigido=valorLiquidoCorrigido;
		this.valorARessarcir=valorARessarcir;
		
	}
	
	public String getNroEstabelecimento() {
		return nroEstabelecimento;
	}

	public void setNroEstabelecimento(String nroEstabelecimento) {
		this.nroEstabelecimento = nroEstabelecimento;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public Date getDataTransacao() {
		return dataTransacao;
	}

	public void setDataTransacao(Date dataTransacao) {
		this.dataTransacao = dataTransacao;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getFunc() {
		return func;
	}

	public void setFunc(String func) {
		this.func = func;
	}
}
