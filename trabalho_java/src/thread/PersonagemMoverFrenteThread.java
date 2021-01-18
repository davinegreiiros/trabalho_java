package thread;

import desenho.DesenhoMover;
import principal.Principal;

public class PersonagemMoverFrenteThread extends DesenhoMover implements Runnable {

	private static int codigoDaTeclaFrente = 39;

	private Principal principal;
	private DesenhoMover desenhoMover;

	public PersonagemMoverFrenteThread(Principal principal) {

		this.principal = principal;

	}

	// public void setCodigoDaTecla(int codigoDaTecla) {
	//
	// this.codigoDaTecla = codigoDaTecla;
	//
	// }

	public int getCodigoDaTecla() {

		return codigoDaTeclaFrente;

	}

	@Override
	public void run() {

		this.principal.personagem2.moverDireita();;

	}

}
