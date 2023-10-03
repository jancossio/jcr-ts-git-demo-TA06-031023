import javax.swing.JOptionPane;

public class Ejercicio8App {
	public static void main(String[] args) {
		int nums[] = new int[10];
		
		nums = fillArray(nums);
		
		showNumArray(nums);
	}
	
	public static void showNumArray(int[] vals) {
		
		for(int i = 0; i<vals.length;i++) {
			JOptionPane.showMessageDialog(null, "El valor numerico de la posicion "+(i+1)+" del array es: "+vals[i]);
		}
	}
	
	public static int[] fillArray(int[] vals) {
		
		for(int i = 0; i<vals.length;i++) {
			String valN = JOptionPane.showInputDialog("Introduce un valor numerico para la posicion "+(i+1)+" : ");
			int num = Integer.parseInt(valN);
			
			vals[i]= num;
		}
		return vals;	
	}
}
