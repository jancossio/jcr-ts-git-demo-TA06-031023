import javax.swing.JOptionPane;

public class Ejercicio3App {
	public static void main(String[] args) {

		String val = JOptionPane.showInputDialog("Por favor, introduce un numero: ");
		int num = Integer.parseInt(val);
		
		if(checkPrimo(num)) {
			JOptionPane.showMessageDialog(null, "El numero introducido es primo.");
		}else {
			JOptionPane.showMessageDialog(null, "El numero introducido no es primo.");
		}
	}
	
	public static boolean checkPrimo(int num) {
		boolean found = true;
		int i = num-1;
		
		while(found &&(i>1)) {
			if((num%i)==0) {
				found = false;
			}
			i--;
		}
		return found;
	}
}
