package biblioteca;

import javax.swing.JOptionPane;

public class Biblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null, "inicio de todo");
		
		
		Autor cortazar = new Autor ("julio","cortazar","1955","masculino","dhjhsjhs@gmail.com");
		JOptionPane.showMessageDialog(null, cortazar);
		
		Editorial azul = new Editorial ("azul","2225455655","juncal 800","recoleta","jgagsag@yahoo.com.ar","20-555565432132-3");
		JOptionPane.showMessageDialog(null, azul);
		
	
		//public libro(String nomb, String añopb, int cant, int costo, Autor autor, Editorial nombre)
		Libro rayuela = new Libro ("rayuela","1970",18,2500,cortazar,azul);
		JOptionPane.showMessageDialog(null, rayuela);
	}

}
