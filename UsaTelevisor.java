package br.com.fiap;

public class UsaTelevisor {
	
	public static void main(String[] args) {
		
		Televisor tv = new Televisor();
		
		tv.volume = 10;
		tv.canal = 160;
		tv.mostrar();
		
		tv.trocarCanal(18);
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.diminuirVolume();
		tv.mostrar();
		
	}

}
