
public class Board {

	private ProposedCombination[] proposedCombinations;
	
	private SecretCombination secretCombination;
	
	private int attempt;

	public Board() {
		this.proposedCombinations = new ProposedCombination[10];
		this.secretCombination = new SecretCombination();
		this.attempt = 0;
	}

	public void show() {
		GestorIO gestorIO = new GestorIO();
		gestorIO.out("\nxxxx\n");
		gestorIO.out(this.attempt + " attempt(s)\n");
		int i;
		for (i = 0; i < this.attempt; i++)
		{
			this.proposedCombinations[i].show();
			gestorIO.out(" --> ");
			this.secretCombination.showMatches(this.proposedCombinations[i]);
		}
	}

	public boolean isLooser() {
		return this.attempt > 9;
	}

	public boolean isWinner() {
		return this.secretCombination.isFullMatch(this.proposedCombinations[this.attempt - 1]);
	}
	
	public void putProposedCombination(ProposedCombination proposedCombination)
	{
		this.proposedCombinations[this.attempt] = proposedCombination;
		this.attempt ++;
	}

}
