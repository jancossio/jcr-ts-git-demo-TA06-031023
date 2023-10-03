import javax.swing.JOptionPane;

public class Ejercicio10App {
	public static void main(String[] args) {
		//se solicita el nombre al usuario
		String val = JOptionPane.showInputDialog("Por favor, introduce el tamaño del array que desees crear: ");
		int lngit = Integer.parseInt(val);
		
		int[] nums = new int[lngit];
		
		String maxNum = JOptionPane.showInputDialog("Por favor, introduce el valor máximo de aleatoriedad: ");
		int maxVal = Integer.parseInt(maxNum);
		
		String minNum = JOptionPane.showInputDialog("Por favor, introduce el valor mínimo de aleatoriedad: ");
		int minVal = Integer.parseInt(minNum);
		
		nums = fillArray(nums, minVal, maxVal);
		
		selecMayor(nums);
	}
	
	public static void selecMayor(int[] vals) {
		
		int mayor = 0;
		
		for(int i = 0; i<vals.length;i++) {
			if(mayor<vals[i]) {
				mayor=vals[i];
			}
			System.out.println("La posicion del array "+(i+1)+" tiene el valor: "+vals[i]);
		}
		JOptionPane.showMessageDialog(null, "El numero con mayor valor del array es el: "+mayor);
	}
	
	public static int[] fillArray(int[] vals, int min, int max) {
		
		int i = 0;
		
		while(i<vals.length) {
			int tmp = genNumAleatorio(min,max);
			if(checkPrimo(tmp)) {
				vals[i] = tmp;
				i++;
			}
		}
		
		return vals;
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
	
	public static int genNumAleatorio(int minVal, int maxVal) {
		int range = (maxVal-minVal)+1;
		return (int)(Math.random()*range)+minVal;
	}
}
