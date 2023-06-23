import javax.swing.*;
import java.io.*;

public class Promocoes {
	public String checaCidade(String cidadeArquivo, String mesInput) {
		String restanteDaLinha = "";
		if (cidadeArquivo.equals(mesInput)) {
			restanteDaLinha = cidadeArquivo.substring(cidadeArquivo.indexOf(" ") + 1);
			return restanteDaLinha;
		} else
			return restanteDaLinha;
	}

	//cria leitor de arquivos de texto para ler o arquivo de entrada
	public String leitorDeViagens(String pesquisarCidade) throws IOException {
		String nomeArquivo = "viagens.txt";
		BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
		String linha = "";


		//checa nome de cidade no arquivo em todas as linhas e retorna o dia
		try {
			while (true) {
				linha = leitor.readLine();
				if (linha != null) {
					JOptionPane.showMessageDialog(null,checaCidade(linha, pesquisarCidade));
					System.out.println(checaCidade(linha, pesquisarCidade));
				} else
					break;
			}
		} catch (IOException e) {
			System.out.println("Erro na leitura do arquivo");
		}
		leitor.close();
	return checaCidade(linha, pesquisarCidade);

	}
	public static void main(String[] args) throws IOException {
		Promocoes promocao = new Promocoes();
		String nomeCidade = JOptionPane.showInputDialog("Digite o mes: ");
		String encontrado = promocao.leitorDeViagens(nomeCidade);


	}


}


