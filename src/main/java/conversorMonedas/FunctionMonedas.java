package conversorMonedas;

import javax.swing.JOptionPane;

public class FunctionMonedas {

	Monedas monedas = new Monedas();

	public void ConvertirMoneda(double ValorRecibido) {

		String opciones = (JOptionPane.showInputDialog(null,
				"Seleccione la moneda a convertir", "monedas ", JOptionPane.PLAIN_MESSAGE,
				null,
				new Object[] { "Peso a Dolar", "Dolar a Peso", "Peso a Euro",
						"Euro a Peso", "Peso a Yen", "Yen a Peso", "Peso a Libra", "Libra a Peso", "Peso a Won", "Won a Peso"},
				"Selección")).toString();
		
		switch (opciones) {
		case "Peso a Dolar":
			monedas.ConvertirPesoADolar(ValorRecibido);
			break;
		case "Dolar a Peso":
			monedas.ConvertirDolarAPeso(ValorRecibido);
			break;
		case "Peso a Euro":
			monedas.ConvertirPesoAEuro(ValorRecibido);
			break;
		case "Euro a Peso":
			monedas.ConvertirEuroAPeso(ValorRecibido);
			break;
		case "Peso a Yen":
			monedas.ConvertirPesoAYen(ValorRecibido);
			break;
		case "Yen a Peso":
			monedas.ConvertirYenAPeso(ValorRecibido);
			break;
		case "Peso a Libra":
			monedas.ConvertirPesoALibra(ValorRecibido);
			break;
		case "Libra a Peso":
			monedas.ConvertirLibraAPeso(ValorRecibido);
			break;
		case "Peso a Won":
			monedas.ConvertirPesoAWon(ValorRecibido);
			break;
		case "Won a Peso":
			monedas.ConvertirWonAPeso(ValorRecibido);
			break;
		default:
			break;
		}
	}
}