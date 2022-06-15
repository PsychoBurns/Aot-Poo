package Classes;

public class Atores extends Caracteristica{

	private String dataNascimento;
	private String dataFalecimento;
	public Atores(int id, String nome, String descricao, String dataNascimento, String dataFalecimento) {
		super(id, nome, descricao);
		this.dataNascimento = dataNascimento;
		this.dataFalecimento = dataFalecimento;
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
	
	
	
}
