package classes;

public class Question {
	
	
	public String frase;
	public String[] opcoes; //int para um array de opções 
	public int correctResponse;
	
	
	public boolean isCorrect (int responseUser){
		if (responseUser == this.correctResponse) {
			return true;
		}
		else {
			return false;
		}
	}
	
}


