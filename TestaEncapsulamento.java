
public class TestaEncapsulamento {
	public static void main(String[] args) {
		
		ContaBancaria contaDoGabriel = new ContaBancaria();
		contaDoGabriel.setCliente(new Cliente());
		contaDoGabriel.setAgencia(1100);
		System.out.println(contaDoGabriel.getAgencia());
		
		//Utilizando Setters e Getters de Referencias Compostas
		
		contaDoGabriel.getCliente().setNome("Gabriel Beltrame");
		System.out.println(contaDoGabriel.getCliente().getNome());
		
		contaDoGabriel.getCliente().setCpf("48422122206");
		System.out.println(contaDoGabriel.getCliente().getCpf());
	}
}
