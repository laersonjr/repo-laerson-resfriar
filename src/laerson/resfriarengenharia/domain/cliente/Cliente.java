package laerson.resfriarengenharia.domain.cliente;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import laerson.resfriarengenharia.domain.fornecedor.Endereco;
import laerson.resfriarengenharia.domain.fornecedor.Telefone;


@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable {
	
	@Id
	@Column(name = "MATRICULA", nullable = false, length = 8)
	private Integer matricula;
	
	@Column(name = "NOME", nullable = false, length = 64)
	private String nome;
	
	@Column(name = "REGIONAL", nullable = true, length = 32)
	private String regional;
	
	@Embedded
	private Endereco endereco = new Endereco();
	
	@Embedded
	private Telefone telefone = new Telefone();

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegional() {
		return regional;
	}

	public void setRegional(String regional) {
		this.regional = regional;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Cliente [matricula=" + matricula + ", nome=" + nome + ", regional=" + regional + ", endereco="
				+ endereco + ", telefone=" + telefone + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((regional == null) ? 0 : regional.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
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
		Cliente other = (Cliente) obj;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (regional == null) {
			if (other.regional != null)
				return false;
		} else if (!regional.equals(other.regional))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}

		
	
}