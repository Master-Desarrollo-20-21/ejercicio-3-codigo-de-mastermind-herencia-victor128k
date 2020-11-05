
public class Game {
	
	private Board board;
	
	private Player player;
	
	public Game() {
		this.board = new Board();
		this.player = new Player();
	}
	
	public void play() {
		GestorIO gestorIO = new GestorIO();
		gestorIO.out("----- MASTERMIND -----\n");
		
		do {
			this.board.show();
			this.board.putProposedCombination(this.player.proposeCombination());
		} while (!this.board.isWinner() || !this.board.isLooser());
		
		if (this.board.isWinner()) {
			gestorIO.out("You've won!!! ;-)\n");
		}
		else {
			gestorIO.out("You've lost!!! :-(\n");
		}
	}
	
	public boolean isResumed() {
		return this.player.wantsToContinue();
	}
	
}
