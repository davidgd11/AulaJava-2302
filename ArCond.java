package br.com.fiap;

public class ArCond {
	
	public int temp;
	public String modo;
	
	public void aumentarTemperatura() {
		temp++;
	}
	
	public void diminuirTemperatura() {
		temp--;
	}
	
	public void trocarModo(String m) {
		modo = m;
	}
	
	public void mostrar() {
		System.out.println("Temperatura atual: " + temp);
		System.out.println("Modo atual: " + modo);
	}

}
