package exception;

import jogador.StartGame;

public class JogadorDuplicadoException extends Exception {
	private StartGame startGame;

	public JogadorDuplicadoException(StartGame startGame) {
		
		this.startGame = startGame;
		
	}
	public StartGame getJogadorDuplicadoException(){
		return startGame;
	}
 }
