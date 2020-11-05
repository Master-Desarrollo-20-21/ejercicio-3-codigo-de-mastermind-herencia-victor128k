
public class Player {

	public void proposeCombination(Board board) {
		// TODO Auto-generated method stub
		
	}

	public boolean wantsToContinue() {
		GestorIO gestorIO = new GestorIO();
		String answer;
		
		do {
			gestorIO.out("¿Quieres continuar? (s/n): ");
			answer = gestorIO.inString();
		} while (!answer.equals("s") && !answer.equals("n"));
		
		return answer.equals("s");
	}

}
