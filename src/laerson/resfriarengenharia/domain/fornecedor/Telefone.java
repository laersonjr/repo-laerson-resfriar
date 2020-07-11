package laerson.resfriarengenharia.domain.fornecedor;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Telefone implements Serializable {
	
	@Column(name = "DDD_FIXO", nullable = true, length = 2)
	private Integer dddFixo;
	
	@Column(name = "NUMERO_FIXO", nullable = true, length = 9)
	private Integer numeroFixo;
	
	@Column(name = "DDD_CELULAR", nullable = true, length = 2)
	private Integer dddCelular;
	
	@Column(name = "NUMERO_CELULAR", nullable = true, length = 9)
	private Integer numeroCelular;

	public Integer getDddFixo() {
		return dddFixo;
	}

	public void setDddFixo(Integer dddFixo) {
		this.dddFixo = dddFixo;
	}

	public Integer getNumeroFixo() {
		return numeroFixo;
	}

	public void setNumeroFixo(Integer numeroFixo) {
		this.numeroFixo = numeroFixo;
	}

	public Integer getDddCelular() {
		return dddCelular;
	}

	public void setDddCelular(Integer dddCelular) {
		this.dddCelular = dddCelular;
	}

	public Integer getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(Integer numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	@Override
	public String toString() {
		return "Telefone [dddFixo=" + dddFixo + ", numeroFixo=" + numeroFixo + ", dddCelular=" + dddCelular
				+ ", numeroCelular=" + numeroCelular + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dddCelular == null) ? 0 : dddCelular.hashCode());
		result = prime * result + ((dddFixo == null) ? 0 : dddFixo.hashCode());
		result = prime * result + ((numeroCelular == null) ? 0 : numeroCelular.hashCode());
		result = prime * result + ((numeroFixo == null) ? 0 : numeroFixo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		if (dddCelular == null) {
			if (other.dddCelular != null)
				return false;
		} else if (!dddCelular.equals(other.dddCelular))
			return false;
		if (dddFixo == null) {
			if (other.dddFixo != null)
				return false;
		} else if (!dddFixo.equals(other.dddFixo))
			return false;
		if (numeroCelular == null) {
			if (other.numeroCelular != null)
				return false;
		} else if (!numeroCelular.equals(other.numeroCelular))
			return false;
		if (numeroFixo == null) {
			if (other.numeroFixo != null)
				return false;
		} else if (!numeroFixo.equals(other.numeroFixo))
			return false;
		return true;
	}
	
	
}