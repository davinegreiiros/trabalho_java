package personagem;

import desenho.DesenhoMover;

public class Personagem2 extends DesenhoMover{
private Personagem2 personagem2;
	
	public  Personagem2() {
		super();
	}
	public  Personagem2(int x, int y,String path) {
		super.setX(x);
		super.setY(y);
		super.setImg(path);
		}
	

}
