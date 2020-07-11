package laerson.resfriarengenharia.domain.atividade;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Table;

@Table (name = "ACOES")
public class Acoes implements Serializable {
	
	// TODO Verificar mapeamento para o objeto problema e para as Classes Acoes e Problema
	private Problema problema;
	
	@Column (name = "PROCEDIMENTO_REALIZADO", nullable = false, length = 64)
	private String prodecimentoRealizado;
	
	@Column (name = "DATA", nullable = false)
	private LocalDate data;
	
	@Column (name = "VALOR", nullable = false) 
	private Double valor;
	
	public void pegarLocalSetor() {
		problema.getLocalSetor();
	}
}
