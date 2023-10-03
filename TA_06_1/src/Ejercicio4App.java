import javax.swing.JOptionPane;

public class Ejercicio4App {
	public static void main(String[] args) {
		
		//se solicita el nombre al usuario
		String val = JOptionPane.showInputDialog("Por favor, introduce un numero: ");
		int num = Integer.parseInt(val);
		
		int totalVal = calcFactorial(num);
		
		//muestra el mensaje de bienvenida del nombre
		JOptionPane.showMessageDialog(null, "El valor factorial del numero introducido es "+totalVal);
	}
	
	public static int calcFactorial(int nVal) {
		int result = 1;
		for(int i = nVal;i>0;i--) {
			result *= i;
		}
		return result;
	}
}
