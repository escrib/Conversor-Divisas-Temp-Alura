package principal;

import javax.swing.JOptionPane;
import conversorMonedas.FunctionMonedas;
import conversorTemperatura.FunctionTemperatura;

public class Gui {

	public static void Menu() {

		FunctionMonedas monedas = new FunctionMonedas();
		FunctionTemperatura temperatura = new FunctionTemperatura();

		try {
			String opciones;
			int yesOption = JOptionPane.YES_OPTION;

			do {
				opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion",
						"Menú ", JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "Monedas", "Temperatura" }, "Selección"))
						.toString();
				
				switch (opciones) {
				case "Monedas": {

					String input = JOptionPane
							.showInputDialog("Ingrese el dinero a convertir");

					while (!esNumero(input)) {
						JOptionPane.showMessageDialog(null, "Valor no válido", "Error",
								JOptionPane.ERROR_MESSAGE);
						input = JOptionPane.showInputDialog(null,
								"Por favor ingrese un monto");
					}

					double valorRecibido = Double.parseDouble(input);
					monedas.ConvertirMoneda(valorRecibido);

					int seleccion = JOptionPane.showConfirmDialog(null,
							"¿Volver a convertir?");
					System.out.println(seleccion);
				}
					break;

				case "Temperatura": {
					String input = JOptionPane
							.showInputDialog("Ingrese Temperatura a convertir");
					while (!esNumero(input)) {
						JOptionPane.showMessageDialog(null,
								"Valor no válido", "Error",
								JOptionPane.ERROR_MESSAGE);
						input = JOptionPane.showInputDialog(null,
								"Por favor ingrese un valor");
					}

					double temperaturaRecibida = Double.parseDouble(input);
					temperatura.convertirTemperatura(temperaturaRecibida);

					int seleccion = JOptionPane.showConfirmDialog(null,
							"¿Volver a convertir?");
					System.out.println(seleccion);
				}
					break;

				default:
					break;
				}
			} while (JOptionPane.YES_OPTION == yesOption);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Conversor finalizado");
		}
	}

	private static boolean esNumero(String num) {
		try {
			Double.parseDouble(num);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
}