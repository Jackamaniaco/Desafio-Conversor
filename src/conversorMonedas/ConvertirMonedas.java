package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	//Datos Actualizados al Día 25/03/2023
	//1 Peso = 0.054 Dolar
	public void ConvertirPesosADolares(double valor) {
		double monedaDolar = valor * 0.054;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
	}
	//1 Peso = 0.050 Euros
	public void ConvertirPesosAEuros(double valor) {
		double monedaEuro = valor * 0.050;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
	}
	//1 Peso = 0.044 Libras Esterlinas
	public void ConvertirPesosALibras(double valor) {
		double monedaLibra = valor * 0.044;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Libras Esterlinas");
	}
	//1 Peso = 7.00 Yen Japones
	public void ConvertirPesosAYen(double valor) {
		double monedaYen = valor * 7.00;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Yuanes");
	}
	//1 Peso = 0.014 Won sul-coreano
	public void ConvertirPesosAWon(double valor) {
		double monedaWon = valor * 0.014;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Wons");
	}
}
