class Main {
	public static void main(String args[]) {
		Editor e = new Editor();
		Palavra p = new Palavra();
		Figura f = new Figura();
		Video v = new Video();
		int i;
		
		p.setPalavra("teste");
		f.setEndereco("aqui");
		v.setEndereco("ali");
		
		p.italico();
		p.negrito();
		p.sublinhado();
		
		e.adicionaElemento(p);
		e.adicionaElemento(f);
		e.adicionaElemento(v);
		
		for (i=0;i<e.contaElementos;i++) {
			if (e.elementos[i] instanceof Rotacionavel) {
				if (e.elementos[i] instanceof Palavra) {
					Palavra b = (Palavra)e.elementos[i];
					System.out.println(b.getPalavra());
				} else {
					System.out.println("É Figura ou Vídeo!");
				}
			} else {
				System.out.println("Não é rotacionável!");
			}
		}
		e.removeElemento(p);
		
		if (e.elementos[0] instanceof Figura) {
			Rotacionavel r = (Rotacionavel)e.elementos[0];
			r.rotaciona(10.3);
			Figura fig = (Figura)r;
			System.out.println(fig.getAngulacao());
		}
		
		e.removeElemento(f);
		e.removeElemento(v);
		if (e.contaElementos == 0) {
			System.out.println("Editor vazio!");
		}
	}
}
