package conversorMonedas;

import javax.swing.JOptionPane;


//Actualizado al dia 25/03/2023

public class ConvertirMonedasAPesos { 
	//1 Dolar = 18.44 Pesos
	public void ConvertirDolaresAPesos(double valor) {
		double monedaDolar = valor * 18.44;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Mexicanos");
	}
	//1 Euro = 19.88 Pesos
	public void ConvertirEurosAPesos(double valor) {
		double monedaEuro = valor * 19.88;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Mexicanos");
	}
	//1 Libra = 22.53 Pesos
	public void ConvertirLibrasAPesos(double valor) {
		double monedaLibra = valor * 22.53;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Mexicanos");
	}
	//1 Yen Japones = 0.141 Pesos 
	public void ConvertirYenAPesos(double valor) {
		double monedaYen = valor * 0.141;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Mexicanos");
	}
	//1 Won = 70 Pesos
	public void ConvertirWonAPesos(double valor) {
		double monedaWon = valor * 70;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Mexicanos");
	}
}
