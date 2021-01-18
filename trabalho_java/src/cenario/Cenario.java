package cenario;

import desenho.Desenho;

public class Cenario extends Desenho {
		public Cenario() {
			super();
		}
		public Cenario(int x, int y,String path) {
			super.setX(x);
			super.setY(y);
			super.setImg(path);
			}

}
