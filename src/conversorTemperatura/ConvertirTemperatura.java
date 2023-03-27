package conversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	
	//celsius a Farenheit 1c = 33.8
	public double ConvertirCelciusAFarenheit(double valor) {
		double farenheit = valor * 33.8;
    	farenheit = (double) Math.round(farenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " +farenheit+ " Grados Farenheit ");
		return farenheit;
	}
	
	//Celsius a Kelvin 1c = 273.15
	public void ConvertirCelciusAKelvin(double valor){
		double kelvin = valor + 273.15;
        kelvin = (double) Math.round(kelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " +kelvin+ " Kelvin");
	}
	
	//Kelvin a Celsius 1k = -273.15
	public double ConvertirKelvinACelcius(double valor) {
		 double kelvinCelcius = valor - 273.15;
        kelvinCelcius = (double) Math.round(kelvinCelcius *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinCelcius+ " Celcius");
        return kelvinCelcius;
	}
	
	//kelvin a Farenheit k = (valor * 9/5)-459.67
	public void ConvertirKelvinAFarenheit(double valor) {
		double kelvinFarenheit = (valor * 9/5)-459.67;
		kelvinFarenheit	= (double) Math.round(kelvinFarenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinFarenheit+ " Celcius");
	}
	
	//Farenheit a Celsius
	public void ConvertirFarenheitACelcius(double valor) {
		double celcius = (valor - 32) / 1.8;
        celcius = (double) Math.round(celcius *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Farenheit son " +celcius+ " Celcius");
	}
	
	
	//Farenheit a Kelvin 1k = (valor + 459.67)* 5/9
	public void ConvertirFarenheitAKelvin(double valor) {
		double FarenheitKelvin = (valor + 459.67)*5/9;
		FarenheitKelvin	= (double) Math.round(FarenheitKelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +FarenheitKelvin+ " Celcius");
	}

}
