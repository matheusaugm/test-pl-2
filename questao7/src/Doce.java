import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Doce {
	String nome;
	int quantidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public static void main(String[] args) throws IOException {
		String path = "doces.txt";
		List<Doce> listaDoces = new ArrayList<Doce>();
		//insere doce até o usuario dizer não via JOptionpane
		String desejaContinuar = "S";
		String linha = "";
		while (desejaContinuar.equalsIgnoreCase("S")) {
			Doce doce = new Doce();
			doce.setNome(JOptionPane.showInputDialog("Digite o nome do doce"));
			doce.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do doce")));
			listaDoces.add(doce);
			desejaContinuar = JOptionPane.showInputDialog("Deseja continuar? S/N");

		}
		for (int i = 0; i < listaDoces.size(); i++) {
			JOptionPane.showMessageDialog(null, "O doce " + listaDoces.get(i).getNome() + " tem " + listaDoces.get(i).getQuantidade() + " unidades");
			//escreve doce no arquivo path
			BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
			buffWrite.append(listaDoces.get(i).getNome() + " " + listaDoces.get(i).getQuantidade());
			buffWrite.close();

		}


	}
}
