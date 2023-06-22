import java.util.*;

public class Fazenda {
	//insere animal pra testar a função
	public void  inserirAnimal(List<Animal> listaAnimaisFazenda){
		System.out.println("Digite a quantidade de animais");
		Scanner sc = new Scanner(System.in);
		int quantidade = sc.nextInt();
		sc.nextLine();
		for(int controleBichos=0; controleBichos < quantidade; controleBichos++)  {
			Animal bicho = new Animal();
			System.out.println("Digite o nome do "+quantidade+ " animal");
			bicho.setNome(sc.nextLine());
			bicho.setQuantidade(quantidade);
			listaAnimaisFazenda.add(bicho);
		}
		sc.close();
	}

	public static void main(String[] args) {

		List<Animal> listaAnimais = new ArrayList<Animal>();
		Fazenda fazenda = new Fazenda();
		fazenda.inserirAnimal( listaAnimais);
		for(int i=0; i< listaAnimais.size(); i++) {
			String nomeMaiusculo = listaAnimais.get(i).nome;

			System.out.println(nomeMaiusculo.toUpperCase());
			System.out.println("listsize" + listaAnimais.size());
			System.out.println(i);
			//remove se for cavalo na lista
			if(nomeMaiusculo.equalsIgnoreCase("CAVALO")) {
				listaAnimais.remove(i);
				System.out.println("removeu cavalo");
				System.out.println("listsize" + listaAnimais.size());
				System.out.println(i);

			}
		}
		//printa se o resultado final da lista
		for (Animal animal : listaAnimais) {
			System.out.println("Nome do animal: " + animal.nome + " Quantidade: " + animal.quantidade);
		}

	}
}