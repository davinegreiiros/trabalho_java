package thread;

import desenho.DesenhoMover;
import principal.Principal;

public class PersonagemMoverTrasThread extends DesenhoMover implements Runnable {

	private static int codigoDaTeclaTras = 37;

	private Principal principal;
	private DesenhoMover desenhoMover;

	public PersonagemMoverTrasThread(Principal principal) {

		this.principal = principal;

	}

	// public void setCodigoDaTecla(int codigoDaTecla) {
	//
	// this.codigoDaTecla = codigoDaTecla;
	//
	// }

	public int getCodigoDaTecla() {

		return codigoDaTeclaTras;

	}

	@Override
	public void run() {

		this.principal.personagem2.moverEsquerda();;;

	}
}
