package laerson.resfriarengenharia.domain.atividade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Table;


@Table (name = "PROBLEMA")
public class Problema implements Serializable{
	
	@Column (name = "MOTIVO_CHAMADO", nullable = false, length = 128)
	private String motivoChamado;
	
	@Column (name = "LOCAL_SETOR", nullable = false, length = 64)
	private String localSetor;
	
	@Column (name = "PROBLEMA_DETECTADO")
	private String problemaDetectado;

	public String getMotivoChamado() {
		return motivoChamado;
	}

	public void setMotivoChamado(String motivoChamado) {
		this.motivoChamado = motivoChamado;
	}

	public String getLocalSetor() {
		return localSetor;
	}

	public void setLocalSetor(String localSetor) {
		this.localSetor = localSetor;
	}

	public String getProblemaDetectado() {
		return problemaDetectado;
	}

	public void setProblemaDetectado(String problemaDetectado) {
		this.problemaDetectado = problemaDetectado;
	}

	@Override
	public String toString() {
		return "Problema [motivoChamado=" + motivoChamado + ", localSetor=" + localSetor + ", problemaDetectado="
				+ problemaDetectado + "]";
	}
	
	

}
