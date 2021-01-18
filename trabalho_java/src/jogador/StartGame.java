package jogador;

import java.io.Serializable;
import java.util.ArrayList;

import exception.JogadorDuplicadoException;

public class StartGame implements Serializable {

	private ArrayList<Jogador> lista = new ArrayList<Jogador>();

	public void addJogador(Jogador j) throws JogadorDuplicadoException {
		if (lista.contains(j)) {
			throw new JogadorDuplicadoException(j);
		}
		lista.add(j);
	}
}
