import javax.swing.JOptionPane;

public class Ejercicio12App {
	public static void main(String[] args) {
		
		//se solicita el nombre al usuario
		String val = JOptionPane.showInputDialog("Por favor, introduce el tamaño del array: ");
		int lngit = Integer.parseInt(val);
		
		int[] nums = new int[lngit];
		
		String dig = JOptionPane.showInputDialog("Introduce el dígito que localizar del final de cada número: ");
		int last = Integer.parseInt(dig);
		
		nums = fillArray(nums);
		
		showNumArray(nums);
		
		int[] result = checkNumInArray(nums, last);
		
		showNumArray(result);
	}
	
	public static int[] checkNumInArray(int[] vals, int val) {
		
		int longt = 0;
		int[] tmp = new int[vals.length];
		String tmpString = null;
		String comp = Integer.toString(val);

		for(int i = 0; i<vals.length;i++) {
			tmpString = Integer.toString(vals[i]);
			//System.out.println(tmpString);
			if(tmpString.endsWith(comp)) {
				//System.out.println(comp);
				tmp[longt] = vals[i];
				longt++;
			}
		}
		
		if(tmp.length > 0) {
			int[] result = new int[longt];
			for(int i = 0; i<longt;i++) {
				result[i] = tmp[i];
			}
			return result;
		}else {
			return tmp;
		}
	}
	
	public static void showNumArray(int[] vals) {		
		for(int i = 0; i<vals.length;i++) {
			JOptionPane.showMessageDialog(null, "En la posicion "+(i+1)+" del array, el valor es: "+vals[i]);
		}
	}
	
	public static int[] fillArray(int[] vals) {
		
		for(int i = 0; i<vals.length;i++) {
			vals[i] = genNumAleatorio(1,300);
		}
		return vals;	
	}
	
	public static int genNumAleatorio(int minVal, int maxVal) {
		int range = (maxVal-minVal)+1;
		return (int)(Math.random()*range)+minVal;
	}
}
