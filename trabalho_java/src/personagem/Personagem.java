package personagem;

import desenho.DesenhoMover;

public class Personagem extends DesenhoMover{

	public Personagem(){
		
		super();
	}

	public Personagem(int x, int y,String path) {
		super.setX(x);
		super.setY(y);
		super.setImg(path);
		}
}
