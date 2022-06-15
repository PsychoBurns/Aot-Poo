package Classes;

public class Direcao extends Caracteristica {

	private String tipoDirecao;
	private String dataNascimento;
	private String dataFalecimento;
	
	TipoDeDirecao tipoDeDirecao;
	

	public Direcao(int id, String nome, String descricao, String tipoDirecao, String dataNascimento,
			String dataFalecimento, TipoDeDirecao tipoDeDirecao) {
		super(id, nome, descricao);
		this.tipoDirecao = tipoDirecao;
		this.dataNascimento = dataNascimento;
		this.dataFalecimento = dataFalecimento;
		this.tipoDeDirecao = tipoDeDirecao;
	}


	public String getTipoDirecao() {
		return tipoDirecao;
	}


	public void setTipoDirecao(String tipoDirecao) {
		this.tipoDirecao = tipoDirecao;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getDataFalecimento() {
		return dataFalecimento;
	}


	public void setDataFalecimento(String dataFalecimento) {
		this.dataFalecimento = dataFalecimento;
	}


	public TipoDeDirecao getTipoDeDirecao() {
		return tipoDeDirecao;
	}


	public void setTipoDeDirecao(TipoDeDirecao tipoDeDirecao) {
		this.tipoDeDirecao = tipoDeDirecao;
	}


}
