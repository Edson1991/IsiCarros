package userinterface;

import java.util.ArrayList;
import java.util.Scanner;

import model.QuestaoComDica;
import model.QuestaoMultiplaEscolha;
import model.QuestaoSimples;

public class Prova {
	public static void main(String[] args) {
		
        Scanner teclado = new Scanner(System.in);
        int qtdacertos = 0;
        String respAluno;
        
        //QuestaoSimples questoes[]; // quest�es[] = variavel declarada como classe Pai "Questao Simples"
		
		//questoes = new QuestaoSimples[5];
		
		//questoes[0] = new QuestaoSimples("1� Quest�o: Quanto � 1 + 1?","2"); // questoes[0] = instaciado como classe Pai "QuestaoSimples"
		//questoes[1] = new QuestaoSimples ("2� Quest�o: Quanto � 2 + 2?","4"); // questoes[1] = instaciado como classe Pai "QuestaoSimples"
		//questoes[2] = new QuestaoComDica ("3� Quest�o: Qual o melhor banco do Brasil?","Itau", "Ele � laranjinha"); //questoes[2] = instaciado como classe filha "QuestaoComDica"
		//questoes[3] = new QuestaoMultiplaEscolha ("4� Quest�o: Qual melhor time?","Palmeiras", "Santos", "Corinthians","S�o Paulo", "Palmeiras");//questoes[3] = instaciado como classe filha "QuestaoMultiplaEscolha"
		//questoes[4] = new QuestaoMultiplaEscolha ("5� Quest�o: Qual � o melhor banco do Brasil?","Itau","Bradesco","Safra","Itau","Santander");////questoes[4] = instaciado como classe filha "QuestaoMultiplaEscolha"

        
        ArrayList<QuestaoSimples> lista; //declarei lista como array list
        
        lista = new ArrayList<QuestaoSimples>(); // instaciei a lista
        
        lista.add(new QuestaoSimples("1� Quest�o: Quanto � 1 + 1?","2"));
        lista.add(new QuestaoSimples ("2� Quest�o: Quanto � 2 + 2?","4"));
        lista.add(new QuestaoComDica ("3� Quest�o: Qual o melhor banco do Brasil?","Itau", "Ele � laranjinha"));
        lista.add(new QuestaoMultiplaEscolha ("4� Quest�o: Qual melhor time?","Palmeiras", "Santos", "Corinthians","S�o Paulo", "Palmeiras"));
        lista.add(new QuestaoMultiplaEscolha ("5� Quest�o: Qual � o melhor banco do Brasil?","Itau","Bradesco","Safra","Itau","Santander"));
        	
        
		for (QuestaoSimples q : lista) {                // "for" especifico para array, n�o precisa de contador. 
														// pq ele conta at� o tamanho do vetor "implicitamente". Chama-se de "forEach" 
			System.out.println(q.aplicarQuestao());     // com isso usamos uma variavel "q" do tipo QuestaoSimples para chamar os metodos.
			System.out.println("Digite sua resposta:");
			respAluno = teclado.nextLine();
			
			if(q.corrigir(respAluno)) {
				System.out.println("Resposta correta!\n");
				qtdacertos++;
			}
			else {
				System.out.println("Resposta incorreta!\n");
			}
					
		}	
		
		System.out.println("Voce acertou:" +qtdacertos+"/"+lista.size());
		teclado.close();
	}

}
