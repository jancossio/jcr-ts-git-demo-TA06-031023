import javax.swing.JOptionPane;

public class Ejercicio2App {
	public static void main(String[] args) {

		String cant = JOptionPane.showInputDialog("Introduce la cantidad de numeros aleatorios que desees generar: ");
		int nums = Integer.parseInt(cant);
		
		String maxV = JOptionPane.showInputDialog("Introduce el valor maxima que los numeros puedan alcanzar: ");
		int maxCant = Integer.parseInt(maxV);
		
		String minV = JOptionPane.showInputDialog("Introduce el valor minimo que los numeros puedan alcanzar: ");
		int minCant = Integer.parseInt(minV);
		
		for(int i = 0;i<nums;i++) {
			int tempV = genNumAleatorio(minCant, maxCant);
			System.out.println("El numero generado en la posicion "+(i+1)+" es: "+tempV);
		}
	}

	public static int genNumAleatorio(int minVal, int maxVal) {
		int range = (maxVal-minVal)+1;
		return (int)(Math.random()*range)+minVal;
	}
}
