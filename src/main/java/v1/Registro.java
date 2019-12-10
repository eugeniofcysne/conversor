package v1;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
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
}
