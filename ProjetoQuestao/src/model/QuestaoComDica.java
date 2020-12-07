package model;

public class QuestaoComDica extends QuestaoSimples {
	
	private String dica;

	//Contrutor da classe filha	
	public QuestaoComDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		this.dica = dica;
	}
	
	public String aplicarQuestao () {
		return  enunciado+"\n"+
				"Dica: "+dica;
	}

	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}
	
}
