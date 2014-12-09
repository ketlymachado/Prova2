class Video extends Elemento implements Modificavel {
	private String enderecoVideo;
	
	public void setEndereco(String s) {
		this.enderecoVideo = s;
	}
	public String getEndereco() {
		return this.enderecoVideo;
	}
	public void mudaTamanho(int a, int l) {
		setAltura(a);
		setLargura(l);
	}
}

