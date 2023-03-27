package conversorTemperatura;

import javax.swing.JOptionPane;

public class Temperatura {

	public void FahrenheitACelsius(double valorRecibido) {
		double celsius = (valorRecibido - 32) * 5 / 9;
		celsius = (double) Math.round(celsius * 100) / 100;
		JOptionPane.showMessageDialog(null, valorRecibido + " °F == " + celsius + " °C");
	}

	public void CelsiusAFahrenheit(double valorRecibido) {
		double fahrenheit = valorRecibido * 9 / 5 + 32;
		fahrenheit = (double) Math.round(fahrenheit * 100) / 100;
		JOptionPane.showMessageDialog(null,
				valorRecibido + " °C == " + fahrenheit + " °F");
	}
}