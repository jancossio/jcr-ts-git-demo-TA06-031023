import javax.swing.JOptionPane;

public class Ejercicio9App {
	public static void main(String[] args) {
		//se solicita el nombre al usuario
		String val = JOptionPane.showInputDialog("Por favor, introduce el tamaño del array que desees crear: ");
		int lngit = Integer.parseInt(val);
		
		int[] nums = new int[lngit];
		
		nums = fillRandomArray(nums);
		
		showNumArray(nums);
	}
	
	public static void showNumArray(int[] vals) {
		
		int totalCant = 0;
		
		for(int i = 0; i<vals.length;i++) {
			JOptionPane.showMessageDialog(null, "En la posicion "+(i+1)+" del array, el valor es: "+vals[i]);
			totalCant += vals[i];
		}
		JOptionPane.showMessageDialog(null, "El valor numerico total que contiene el array es: "+totalCant);
	}
	
	public static int[] fillRandomArray(int[] vals) {
		
		for(int i = 0; i<vals.length;i++) {
			vals[i] = genNumAleatorio(0,9);
		}
		return vals;	
	}
	
	public static int genNumAleatorio(int minVal, int maxVal) {
		int range = (maxVal-minVal)+1;
		return (int)(Math.random()*range)+minVal;
	}
}