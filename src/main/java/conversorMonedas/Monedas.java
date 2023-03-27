package conversorMonedas;

import javax.swing.JOptionPane;

public class Monedas {

	// Peso - Dolar
	public void ConvertirPesoADolar(double valorRecibido) {
		double moneda = (double) (valorRecibido * 0.0049 *100) /100;
		moneda = (double) Math.round(moneda * 100) / 100;
		JOptionPane.showMessageDialog(null,
				(double)Math.round(valorRecibido * 100d) / 100d + " Pesos " + " = " + moneda + " Dolares");
	}
	
	// Dolar - Peso
	public void ConvertirDolarAPeso(double valorRecibido) {
		double moneda = (double) (valorRecibido / 0.0049 *100) /100;
		moneda = (double) Math.round(moneda * 100) / 100;
		JOptionPane.showMessageDialog(null,
				(double)Math.round(valorRecibido * 100d) / 100d + " Dolares " + " = " + moneda + " Pesos");
	}

	// Peso - Euro
	public void ConvertirPesoAEuro(double valorRecibido) {
		double moneda = valorRecibido * 0.0045;
		moneda = (double) Math.round(moneda * 100) / 100;
		JOptionPane.showMessageDialog(null,
				(double)Math.round(valorRecibido * 100d) / 100d + " Pesos " + " = " + moneda + " Euros");
	}

	// Euro - Peso
	public void ConvertirEuroAPeso(double valorRecibido) {
		double moneda = valorRecibido / 0.0045;
		moneda = (double) Math.round(moneda * 100) / 100;
		JOptionPane.showMessageDialog(null,
				(double)Math.round(valorRecibido * 100d) / 100d + " Euros " + " = " + moneda + " Pesos");
	}

	// Peso - Yen
	public void ConvertirPesoAYen(double valorRecibido) {
		double moneda = valorRecibido * 0.64;
		moneda = (double) Math.round(moneda * 100) / 100;
		JOptionPane.showMessageDialog(null,
				(double)Math.round(valorRecibido * 100d) / 100d + " Pesos " + " = " + moneda + " Yenes");
	}

	// Yen - Peso
	public void ConvertirYenAPeso(double valorRecibido) {
		double moneda = valorRecibido / 0.64;
		moneda = (double) Math.round(moneda * 100) / 100;
		JOptionPane.showMessageDialog(null,
				(double)Math.round(valorRecibido * 100d) / 100d + " Yenes " + " = " + moneda + " Pesos");
	}

	// Peso - Libra
	public void ConvertirPesoALibra(double valorRecibido) {
		double moneda = valorRecibido * 0.0040;
		moneda = (double) Math.round(moneda * 100) / 100;
		JOptionPane.showMessageDialog(null,
				(double)Math.round(valorRecibido * 100d) / 100d + " Pesos " + " = " + moneda + " Libras");
	}

	// Libra - Peso
	public void ConvertirLibraAPeso(double valorRecibido) {
		double moneda = valorRecibido / 0.0040;
		moneda = (double) Math.round(moneda * 100) / 100;
		JOptionPane.showMessageDialog(null,
				(double)Math.round(valorRecibido * 100d) / 100d + " Libras " + " = " + moneda + " Pesos");
	}

	// Peso - Won
	public void ConvertirPesoAWon(double valorRecibido) {
		double moneda = valorRecibido * 6.32;
		moneda = (double) Math.round(moneda * 100) / 100;
		JOptionPane.showMessageDialog(null,
				(double)Math.round(valorRecibido * 100d) / 100d + " Pesos " + " = " + moneda + " Won");
	}

	// Won - Peso
	public void ConvertirWonAPeso(double valorRecibido) {
		double moneda = valorRecibido / 6.32;
		moneda = (double) Math.round(moneda * 100) / 100;
		JOptionPane.showMessageDialog(null,
				(double)Math.round(valorRecibido * 100d) / 100d + " Won " + " = " + moneda + " Pesos");
	}
}