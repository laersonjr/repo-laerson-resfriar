package laerson.resfriarengenharia.domain.os;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import laerson.resfriarengenharia.domain.atividade.Acoes;
import laerson.resfriarengenharia.domain.atividade.Problema;
import laerson.resfriarengenharia.domain.cliente.Cliente;
import laerson.resfriarengenharia.domain.fornecedor.Fornecedor;

@Entity
@Table(name = "ORDEM_DE_SERVICO")
public class OrdemServico implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OS", nullable = false)
	private Integer os;

	@ManyToOne
	@JoinColumn(name = "FORNECEDOR", nullable = false)
	private Fornecedor fornecedor;

	@ManyToOne
	@JoinColumn(name = "CLIENTE", nullable = false)
	private Cliente cliente;
	
	// TODO Verificar mapeamentos das listas
	private List<Problema> listaDeProblema;

	private List<Acoes> listaDeAcoes;
	
}
