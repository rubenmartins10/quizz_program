package main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import classes.Question;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Question[] perguntas = new Question[4];//dizemos que o nosso quizz tem espaço para 4 perguntas
		
		perguntas[0] = new Question();
		perguntas[0].frase = "Diz-me qual é a capital de Portugal?";
		perguntas[0].opcoes = new String [] {"Porto", "Lisboa", "Berlim", "Aveiro"};
		perguntas[0].correctResponse = 1; //lisboa
		
		perguntas[1] = new Question();
		perguntas[1].frase = "Diz-me qual é a capital da França?";
		perguntas[1].opcoes = new String [] {"Paris", "Lisboa", "Berlim", "Amsterdão"};
		perguntas[1].correctResponse = 0; //Paris
		
		perguntas[2] = new Question();
		perguntas[2].frase = "Diz-me qual é a capital de Espanha?";
		perguntas[2].opcoes = new String [] {"Porto", "Lisboa", "Berlim", "Madrid"};
		perguntas[2].correctResponse = 3; //Madrid
		
		perguntas[3] = new Question();
		perguntas[3].frase = "Diz-me qual é a capital de Holanda?";
		perguntas[3].opcoes = new String [] {"Porto", "Berlim", "Amsterdão", "Madrid"};
		perguntas[3].correctResponse = 2; //Amsterdão
		
		int score = 0;
		
		for (int i = 0; i < perguntas.length; i++) {
			
			Question q = perguntas[i]; //pergunta atual, vê-se no índice i
		
			int respostaDoUser = JOptionPane.showOptionDialog(
	                null, 
	                q.frase,//usa a frase guardada no objeto
	                "Quiz Java", 
	                JOptionPane.DEFAULT_OPTION, 
	                JOptionPane.QUESTION_MESSAGE, 
	                null, 
	                q.opcoes,//usa as opções guardadas no objeto
	                q.opcoes[0]);
			
			
			if (q.isCorrect(respostaDoUser) == true) {
	            JOptionPane.showMessageDialog(null, "MUITO BEM! Acertaste.");
	            score ++;
	        } else {
	            JOptionPane.showMessageDialog(null, "Errado... Tenta novamente!");
	        }
		}
		JOptionPane.showMessageDialog(null, "O jogo acabou e tiveste pontuação de " + score + " em " + perguntas.length);
		
		
		sc.close();
		
	}

}
