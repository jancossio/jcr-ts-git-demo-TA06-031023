import javax.swing.JOptionPane;

public class Ejercicio1App {
	//final double PI = 3.14;
	
	public static void main(String[] args) {
		
		//Se solicita al usuario que introduzca la figura que quiere calcular
		String figura = JOptionPane.showInputDialog("Introduce la figura de la que quieras calcular su área: ");
		
		//Mediante la función Switch se determina si el dia introducido es festivo o laboral
		switch(figura){
		
		case "Circulo":
			calcularCirculo();
			break;
		case "Triangulo":
			calcularTriangulo();
			break;
		case "Cuadrado":
			calcularCuadrado();
			break;
		default:
			JOptionPane.showMessageDialog(null, "La figura introducida no se reconoce");
		}
	}
	
	public static void calcularCirculo() {
		final double PI = 3.14;
		String valR = JOptionPane.showInputDialog("Introduce el valor del radio del círculo: ");
		double radio = Double.parseDouble(valR);
		JOptionPane.showMessageDialog(null, "El área total del círculo será: "+(Math.pow(radio, 2)*PI));
	}
	
	public static void calcularTriangulo() {
		String valB = JOptionPane.showInputDialog("Introduce el valor de la base del triangulo: ");
		double base = Double.parseDouble(valB);
		String valA = JOptionPane.showInputDialog("Introduce el valor de la base del triangulo: ");
		double altu = Double.parseDouble(valA);
		JOptionPane.showMessageDialog(null, "El área total del triangulo será: "+((base*altu)/2));
	}
	
	public static void calcularCuadrado() {
		String valL = JOptionPane.showInputDialog("Introduce el valor del lado del cuadrado: ");
		double lado = Double.parseDouble(valL);
		JOptionPane.showMessageDialog(null, "El área total del círculo será: "+(lado*lado));
	}
}
