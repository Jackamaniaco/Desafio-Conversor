package conversorTemperatura;

import javax.swing.JOptionPane;

public class functionTemperatura {
	
	ConvertirTemperatura temperatura = new ConvertirTemperatura();
	
	public void ConvertirTemperatura(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celcius a Farenheit", "Grados Celcius a Kelvin", "Grados Kelvin a Grados Celcius","Grados Kelvin a Farenheit", "Grados Farenheit a Celcius", "Grados Farenheit a Kelvin"}, "Seleccion")).toString();
        switch(opcion) {
        case "Grados Celcius a Farenheit":
        	temperatura.ConvertirCelciusAFarenheit(Minput);
        	break;
        case "Grados Celcius a Kelvin":
            temperatura.ConvertirCelciusAKelvin(Minput);
            break;	
        case "Kelvin a Grados Celcius":
           temperatura.ConvertirKelvinACelcius(Minput);
           break;
        case "Kelvin a Grados Farenheit":
        	temperatura.ConvertirKelvinAFarenheit(Minput);
        	break;
        case "Grados Farenheit a Celcius":
            temperatura.ConvertirFarenheitACelcius(Minput);
            break;	
        case "Grados Farenheit a Kelvin":
            temperatura.ConvertirFarenheitAKelvin(Minput);
            break;
        }
	}
}
    	
     


