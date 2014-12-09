class Figura extends Elemento implements Rotacionavel, Modificavel {
	private String enderecoFigura;
	
	public void setEndereco(String s) {
		this.enderecoFigura = s;
	}
	public String getEndereco() {
		return this.enderecoFigura;
	}
	public void rotaciona(double ang) {
		setAngulacao(ang);
	}
	public void mudaTamanho(int a, int l) {
		setAltura(a);
		setLargura(l);
	}
}
