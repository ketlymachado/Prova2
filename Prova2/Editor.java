class Editor {
	public Elemento elementos[];
	public int contaElementos;
	
	public Editor() {
		elementos = new Elemento[123456];
		contaElementos = 0;
	}
	
	public void adicionaElemento(Elemento e) {
		elementos[contaElementos] = e;
		contaElementos++;
	}
	
	public void removeElemento(Elemento e) {
		int i;
		for (i=0;i<contaElementos;i++) {
			if (elementos[i]==e) {
				while (i<contaElementos-1) {
					elementos[i] = elementos[i+1];
					i++;
				}
				i = contaElementos;
				contaElementos--;
			}
		}
	}
}
