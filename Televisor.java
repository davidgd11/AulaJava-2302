package br.com.fiap;

public class Televisor {
	
	public int volume;
	public int canal;
	
	public void aumentarVolume() {
		volume++;
	}
	
	public void diminuirVolume() {
		volume--;
	}
	
	public void trocarCanal(int c) {
		canal = c;
	}
	
	
	public void mostrar() {
		System.out.println("Volume atual: " + volume);
		System.out.println("Canal atual: " + canal);
	}

}
