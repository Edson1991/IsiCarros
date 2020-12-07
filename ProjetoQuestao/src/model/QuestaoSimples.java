package model;

public class QuestaoSimples {
	protected String enunciado;
	protected String resposta;
	
		
	public QuestaoSimples(String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.resposta = resposta;
	}

	public String aplicarQuestao () {
		return enunciado;
	}
	
	public boolean corrigir(String res) {
		if(res.equals(resposta)) {
			return true	;		
		} else
			return false;
	}
	
	public String getEnunciado() {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

}
