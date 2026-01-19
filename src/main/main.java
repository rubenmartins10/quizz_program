package main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import classes.Question;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Question q1 = new Question();
		q1.frase = "Qual é a capital da França"; //cria-se o Q1 e preenchemos os dados dele
		q1.opcoes = new String[] {"Lisboa", "Porto", "Paris"}; //criar o array 
		q1.correctResponse = 2;
		
		int respostaDoUser = JOptionPane.showOptionDialog(
                null, 
                q1.frase,//usa a frase guardada no objeto
                "Quiz Java", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                q1.opcoes,//usa as opções guardadas no objeto
                q1.opcoes[0]);
		
		
		if (q1.isCorrect(respostaDoUser) == true) {
            JOptionPane.showMessageDialog(null, "MUITO BEM! Acertaste.");
        } else {
            JOptionPane.showMessageDialog(null, "Errado... Tenta novamente!");
        }
		
		
		
		sc.close();
		
	}

}
