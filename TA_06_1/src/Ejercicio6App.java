import javax.swing.JOptionPane;

public class Ejercicio6App {
	public static void main(String[] args) {
		
		//se solicita el nombre al usuario
		String val = JOptionPane.showInputDialog("Por favor, introduce un numero: ");
		int num = Integer.parseInt(val);
		
		int totalRes = calcNumCifras(num);
		
		//muestra el mensaje de bienvenida del nombre
		JOptionPane.showMessageDialog(null, "La cantidad de cifras del numero introducido es "+totalRes);
	}
	
	public static int calcNumCifras(int numVal) {
		int result = 0;
		do {
			numVal = numVal / 10;
			result++;
		}while(numVal > 0);
		
		return result;
	}
}
