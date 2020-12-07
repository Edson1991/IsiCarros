package userinterface;

import model.QuestaoComDica;
import model.QuestaoMultiplaEscolha;
import model.QuestaoSimples;
import java.util.Scanner;

public class Prova {
	public static void main(String[] args) {
		
        Scanner teclado = new Scanner(System.in);
        int qtdacertos = 0;
        String respAluno;

		QuestaoSimples questoes[];
		questoes = new QuestaoSimples[5];
		
		questoes[0] = new QuestaoSimples("1º Questão: Quanto é 1 + 1?","2");
		questoes[1] = new QuestaoSimples ("2º Questão: Quanto é 2 + 2?","4");
		questoes[2] = new QuestaoComDica ("3º Questão: Qual o melhor banco do Brasil?","Itau", "Ele é laranjinha");
		questoes[3] = new QuestaoMultiplaEscolha ("4º Questão: Qual melhor time?","Palmeiras", "Santos", "Corinthians","São Paulo", "Palmeiras");
		questoes[4] = new QuestaoMultiplaEscolha ("5º Questão: Qual é o melhor banco do Brasil?","Itau","Bradesco","Safra","Itau","Santander");

	
		for (int pos=0; pos<questoes.length;pos++) {
			System.out.println(questoes[pos].aplicarQuestao());
			System.out.println("Digite sua resposta:");
			respAluno = teclado.nextLine();
			
			if(questoes[pos].corrigir(respAluno)) {
				System.out.println("Resposta correta!\n");
				qtdacertos++;
			}
			else {
				System.out.println("Resposta incorreta!\n");
			}
					
		}	
		
		System.out.println("Voce acertou:" +qtdacertos+"/"+questoes.length);
		teclado.close();
	}

}
