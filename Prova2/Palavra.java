class Palavra extends Elemento implements Rotacionavel, Formatavel {
	private String palavra;
	
	public void setPalavra(String s) {
		this.palavra = s;
	}
	public String getPalavra() {
		return this.palavra;
	}
	public void rotaciona(double ang) {
		setAngulacao(ang);
	}
	public void italico() {
		System.out.println("Texto Itálico!");
	}
	public void negrito() {
		System.out.println("Texto Negrito!");
	}
	public void sublinhado() {
		System.out.println("Texto Sublinhado!");
	}
}
