package conversorTemperatura;

import javax.swing.JOptionPane;

public class FunctionTemperatura {
	Temperatura temperatura = new Temperatura();

	public void convertirTemperatura(double tempRecibida) {
		String opciones = (JOptionPane.showInputDialog(null,
				"Seleccione valor a convertir", "Temperatura",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Celsius a Fahrenheit", "Fahrenheit a Celsius" },
				"Selección")).toString();

		switch (opciones) {
		case "Celsius a Fahrenheit":
			temperatura.CelsiusAFahrenheit(tempRecibida);
			break;
		case "Fahrenheit a Celsius":
			temperatura.FahrenheitACelsius(tempRecibida);
			break;
		default:
			break;
		}
	}
}