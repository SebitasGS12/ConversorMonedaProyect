package Clases;

public class Moneda {
	
	int valor;

	public Moneda(int valor) {
		this.valor = valor;
	}
	public Moneda() {
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	
	//Metodos de Conversion - MONEDA PERUANA
	
	public String toDolar(int valor) {
		return  "$." +  0.27 * valor + " Dolares"; //valor dolar 06/23
		
	}
		
	public String toEuros(int valor) {
			
			return "E."+  0.25 * valor +" Euros"; //valor euro 06/23
			
	}
	public String toLibras(int valor) {
		
		return "£"+ 0.22 * valor+" Libras esterlinas"; //valor libras esterlinas  06/23		
	}
	
	public String toYen(int valor) {
		
		return "¥"+39.73 * valor + " Yen" ; //valor Yen  06/23		
		
	}
	public String toWon(int valor) {
		
		return "₩"+ 361.69 * valor +" Won"; //valor Won  06/23		
		
	}
	
	
	public String DolartoSoles(int valor) {
		
		return "S/."+ 3.62 * valor+" Soles"; //valor dolar  06/23		
		
	}
	
	public String EurotoSoles(int valor) {
		
		return "S/."+  3.96 * valor + " Soles"; //valor euro  06/23		
		
	}
	
	public String LibratoSoles(int valor) {
		
		return "S/."+ 4.61 * valor + " Soles"; //valor libras  06/23		
		
	}
	public String YentoSoles(int valor) {
		
		return "S/."+  0.025 * valor +" Soles"; //valor yen  06/23		
		
	}
	
	public String WontoSoles(int valor) {
		
		return "S/."+ 0.0028 * valor + " Soles"; //valor won  06/23		
		
	}
	
	
	
	
	
	
	
}
