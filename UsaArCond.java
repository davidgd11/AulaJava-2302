package br.com.fiap;

public class UsaArCond {
	
	public static void main(String[] args) {
		
		ArCond ar = new ArCond();
		
		ar.temp = 18;
		ar.modo = "Noturno";
		ar.mostrar();
		
		ar.aumentarTemperatura();
		ar.aumentarTemperatura();
		ar.trocarModo("Verão");
		ar.mostrar();
	}

}
