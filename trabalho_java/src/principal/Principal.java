package principal;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JFrame;

import cenario.Cenario;
import exception.JogadorDuplicadoException;
import jogador.Jogador;
import jogador.StartGame;
import personagem.Personagem;
import personagem.Personagem2;
import thread.PersonagemMoverFrenteThread;
import thread.PersonagemMoverTrasThread;

public class Principal extends JFrame implements KeyListener {

	File file = new File("C:\\eclipse\\V2Trabalho\\arquivojogo.txt");

	Jogador jogador1 = new Jogador();
	Jogador jogador2 = new Jogador();
	StartGame startGame = new StartGame();

	private final PersonagemMoverFrenteThread personagemMoverFrenteThread;
	private final PersonagemMoverTrasThread personagemMoverTrasThread;

	private Personagem personagem;
	private Cenario cenario;
	public Personagem2 personagem2;

	public Principal() { // CONSTRUTOR
		try {
			jogador1.setNome("Davi");
			jogador2.setNome("Joao");

			startGame.addJogador(jogador1);
			startGame.addJogador(jogador2);

		} catch (JogadorDuplicadoException jogadorException) {

			System.out.println("IMPOSSIVEL ADICIONAR JOGADORES IGUAIS");

		}

		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(jogador1);
			oos.writeObject(jogador2);
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {

			System.out.println("Arquivo Não Encontrado");

		} catch (IOException e) {

			System.out.println("ERRO De E/S");

		}

		this.setSize(624, 396);
		this.setVisible(true);
		this.addKeyListener(this);
		cenario = new Cenario(0, 0, "cenario1.gif");
		personagem = new Personagem(80, 250, "goku.gif");
		personagem2 = new Personagem2(80, 200, "naruto.gif");

		personagemMoverFrenteThread = new PersonagemMoverFrenteThread(this);
		personagemMoverTrasThread = new PersonagemMoverTrasThread(this);
	}

	public static void main(String[] args) {
		Principal app = new Principal();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == personagemMoverFrenteThread.getCodigoDaTecla()) {

			personagemMoverFrenteThread.run();
			repaint();
		}
		if (e.getKeyCode() == personagemMoverTrasThread.getCodigoDaTecla()) {

			personagemMoverTrasThread.run();
			repaint();
		}

		if (e.getKeyCode() == 65) {
			personagem.moverEsquerda();
			repaint();
		}
		if (e.getKeyCode() == 68) {
			personagem.moverDireita();
			repaint();
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	public void paint(Graphics g) {
		g.drawImage(cenario.getImg(), cenario.getX(), cenario.getY(), this);
		g.drawImage(personagem.getImg(), personagem.getX(), personagem.getY(), this);
		g.drawImage(personagem2.getImg(), personagem2.getX(), personagem2.getY(), this);
	}

}
