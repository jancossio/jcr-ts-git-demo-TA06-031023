import javax.swing.JOptionPane;

public class Ejercicio5App {
	public static void main(String[] args) {
		
		//se solicita el nombre al usuario
		String val = JOptionPane.showInputDialog("Por favor, introduce un numero: ");
		int num = Integer.parseInt(val);		
		
		int result = convertBinary(num);
		
		//muestra el mensaje con el resultado en binario del numero introducido
		JOptionPane.showMessageDialog(null, "El valor binario del numero introducido es "+result);
	}
	
	public static int convertBinary(int num) {
		int[] binResult = new int[8];
		int ind = 0;
		int mod = 0;
		
		while(num > 0) {
			mod = num;
			num = num/2;
			mod = mod%2;

			System.out.println(mod);
			
			binResult[ind] =  mod;
			ind++;
		}

		int result = 0;
		
		for(int j = (ind-1); j>=0; j--) {
			result += (binResult[j]*Math.pow(10, j));
			System.out.println(result);
		}
		
		return result;
	}
}
