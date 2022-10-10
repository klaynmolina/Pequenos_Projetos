package tabuada;

import javax.swing.JOptionPane;

public class tabuada {

	public static void main(String[] args) {

		String x = "";

		x = JOptionPane.showInputDialog("Calcular Tabuada de: ");
		
		if (x.equals("sair")) {
			JOptionPane.showMessageDialog(null, "\nPrograma finalizado.");
		}

		while (!x.equals("sair")) {
			if (/*MetodoTesteInputPane.testeInput(x)*/!IsNumeric.isNumeric(x)) {
				x = JOptionPane.showInputDialog
						("Índice fora da tabuada. \nPor favor, digite um número inteiro. \nou \nDigite sair para finalizar.").toLowerCase();
			} else {
				//calculos.calculoTabuada(Integer.parseInt(x));
				calculosFor.calculoTabuada(Integer.parseInt(x));
				
				x = JOptionPane.showInputDialog("Digite um número inteiro. \nou \nDigite sair para finalizar.").toLowerCase();

				if (x.equals("sim")) {
					x = JOptionPane.showInputDialog("Por favor, digite um número inteiro.").toLowerCase();
				} else if (x.equals("sair")) {
					JOptionPane.showMessageDialog(null, "\nPrograma finalizado.");
				}
				
			}
		}
	}
}
