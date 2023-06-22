import javax.swing.*;
import java.util.*;

public class Estimativa {
	public static void main(String[] args) {
		Consulta c = new Consulta();
		List<Consulta> consultas = new ArrayList<Consulta>();
		//insere os dias da semana na lista
		String segunda= "segunda-feira";
		String terca= "terca-feira";
		String quarta= "quarta-feira";
		String quinta= "quinta-feira";
		String sexta= "sexta-feira";
		String sabado= "sabado";
		for (int i = 0; i < 6; i++) {
			Consulta diaDaSemana = new Consulta();
			if(i==0) {
				diaDaSemana.setDia(segunda);
				consultas.add(diaDaSemana);
			}
			if (i==1) {
				diaDaSemana.setDia(terca);
				consultas.add(diaDaSemana);
			}
			if (i==2) {
				diaDaSemana.setDia(quarta);
				consultas.add(diaDaSemana);
			}
			if (i==3) {
				diaDaSemana.setDia(quinta);
				consultas.add(diaDaSemana);
			}
			if (i==4) {
				diaDaSemana.setDia(sexta);
				consultas.add(diaDaSemana);
			}
			if (i==5) {
				diaDaSemana.setDia(sabado);
				consultas.add(diaDaSemana);
			}

		}
		String qualDia = JOptionPane.showInputDialog("Digite o dia da semana");
		//verifica se o dia digitado é igual a algum dia da lista
		for (int i = 0; i < consultas.size(); i++) {
			if(qualDia.equalsIgnoreCase(consultas.get(i).getDia())) {
				int horariosDisponiveisNoDia = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horarios disponiveis no dia"));
				consultas.get(i).setPossiveisHorarios(horariosDisponiveisNoDia);
				int horariosMarcadosNoDia = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horarios marcados no dia"));
				//quantos horarios restam
				int horariosRestantes = horariosDisponiveisNoDia - horariosMarcadosNoDia;
				JOptionPane.showMessageDialog(null, "Na "+consultas.get(i).getDia()+" tem "+horariosRestantes+" horarios restantes");

			}
			
		}





	}
}
