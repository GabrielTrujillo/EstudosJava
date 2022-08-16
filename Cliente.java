
public class Cliente {
	
	private String nome;
	private String cpf;
	private String profissao;
	
	//Setters e Getters do nome
	
	public void setNome(String nome) {
		if(nome.length() != 0) {
			this.nome = nome;
		}else {
			System.out.println("Preencha um nome valido");
		}	
	}
	
	public String getNome() {
		return this.nome;
	}

	//Setters e Getters do CPF
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if(cpf.length() != 11) {
			System.out.println("Numero de CPF invalido");
		}else {
			this.cpf = cpf;
		}	
	}

	//Setters e Getters da Profissao
	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		if(profissao.length() != 0) {
			this.profissao = profissao;
		}else {
			System.out.println("Insira uma Profissao Valida");
		}
	}
}
