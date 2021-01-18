package desenho;

public class DesenhoMover extends Desenho {
	public void moverDireita() {
		this.setX(this.getX() + 20);	

}
public void moverEsquerda() {
	this.setX(this.getX() -20);
}



}
