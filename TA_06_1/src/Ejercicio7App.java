import javax.swing.JOptionPane;

public class Ejercicio7App {
	public static void main(String[] args) {
		
		//Se solicita al usuario que introduzca la figura que quiere calcular
		String valE = JOptionPane.showInputDialog("Introduce el valor en euros que quieras convertir: ");
		double euro = Double.parseDouble(valE);
		
		String mond = JOptionPane.showInputDialog("Introduce la moneda a la que quieras convertir tu cantidad: ");
		
		calcularCambio(euro, mond);
	}
	
	public static void calcularCambio(double euro, String moneda) {
		
		final double LIB = 0.86;
		final double DOL = 1.28611;
		final double YEN = 129.852;
		
		//Mediante la función Switch se determina si el dia introducido es festivo o laboral
		switch(moneda){
		
		case "Libra":
			JOptionPane.showMessageDialog(null, "La cantidad introducida en Libras será: "+(LIB*euro));
			break;
		case "Dolar":
			JOptionPane.showMessageDialog(null, "La cantidad introducida en Dolares será: "+(DOL*euro));
			break;
		case "Yen":
			JOptionPane.showMessageDialog(null, "La cantidad introducida en Yenes será: "+(YEN*euro));
			break;
		default:
			JOptionPane.showMessageDialog(null, "La moneda introducida no se reconoce");
		}
	}
}
