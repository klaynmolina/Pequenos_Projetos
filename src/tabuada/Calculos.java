package tabuada;

import javax.swing.JOptionPane;

public class Calculos {

	static Integer x, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10;
	
	public static void calculoTabuada(int x) {
		x1 	= x * 1;
		x2 	= x * 2;
		x3 	= x * 3;
		x4 	= x * 4;
		x5 	= x * 5;
		x6 	= x * 6;
		x7 	= x * 7;
		x8 	= x * 8;
		x9 	= x * 9;
		x10 = x * 10;
		
		JOptionPane.showMessageDialog
		(null, 
					x+" x 1 = "+x1+"\n"+
					x+" x 2 = "+x2+"\n"+
					x+" x 3 = "+x3+"\n"+
					x+" x 4 = "+x4+"\n"+
					x+" x 5 = "+x5+"\n"+
					x+" x 6 = "+x6+"\n"+
					x+" x 7 = "+x7+"\n"+
					x+" x 8 = "+x8+"\n"+
					x+" x 9 = "+x9+"\n"+
					x+" x 10 = "+x10+"\n"
		);	
	}
}