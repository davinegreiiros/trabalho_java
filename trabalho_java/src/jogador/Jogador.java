package jogador;

import java.io.Serializable;

public class Jogador extends StartGame implements Serializable {
private String nome;

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}
}
