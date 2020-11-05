
public class Mastermind {

	private Game game;
	
	public Mastermind() {
		this.game = new Game();
	}
	
	private void play() {
		do {
			this.game.play();
		} while(this.game.isResumed());
	}
	
	public static void main(String[] args) {
		new Mastermind().play();
	}

}
