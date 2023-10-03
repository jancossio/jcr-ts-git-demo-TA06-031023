import javax.swing.JOptionPane;

public class Ejercicio11App {
	public static void main(String[] args) {
		
		//se solicita el nombre al usuario
		String val = JOptionPane.showInputDialog("Por favor, introduce el tamaño de ambos arrays: ");
		int lngit = Integer.parseInt(val);
		
		int[] nums1 = new int[lngit];
		
		nums1 = fillArray(nums1);
		
		int[] nums2 = nums1;
		
		nums2 = fillArray(nums2);
		
		int[] nums3 = multiplyArrays(nums1, nums2);
		
		showNumArray(nums3);
		
		showNumArray(nums1);

		showNumArray(nums2);
	}
	
	public static int[] multiplyArrays(int[] vals1, int[] vals2) {
		
		int[] ret = new int[vals1.length];
		
		for(int i = 0; i<vals1.length;i++) {
			ret[i] = vals1[i]*vals2[i];
		}
		return ret;
	}
	
	public static void showNumArray(int[] vals) {		
		for(int i = 0; i<vals.length;i++) {
			JOptionPane.showMessageDialog(null, "En la posicion "+(i+1)+" del array, el valor es: "+vals[i]);
		}
	}
	
	public static int[] fillArray(int[] vals) {
		
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
