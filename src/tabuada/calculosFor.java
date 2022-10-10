package tabuada;

import javax.swing.JOptionPane;

public class calculosFor {
	
	public static void calculoTabuada(int x) {

		int calculo = 1;
		int resultado [] = new int[11];
		
		for(int i = 1; i <= 10; i++) {
			calculo = x * i;
			resultado[i] = calculo;
		}
		
				
		JOptionPane.showMessageDialog(null, 
		x + " x " + 1 + " = " + resultado[1] + "\n"	+	
		x + " x " + 2 + " = " + resultado[2] + "\n"	+			
		x + " x " + 3 + " = " + resultado[3] + "\n"	+	
		x + " x " + 4 + " = " + resultado[4] + "\n"	+		
		x + " x " + 5 + " = " + resultado[5] + "\n"	+		
		x + " x " + 6 + " = " + resultado[6] + "\n"	+		
		x + " x " + 7 + " = " + resultado[7] + "\n"	+		
		x + " x " + 8 + " = " + resultado[8] + "\n"	+		
		x + " x " + 9 + " = " + resultado[9] + "\n"	+		
		x + " x " + 10 + " = " + resultado[10]);		
		
	}

}
