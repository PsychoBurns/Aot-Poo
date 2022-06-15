package Classes;

public class FilmeOscar extends Caracteristica {
	
	private String dataPremiacao;
	Filme filme;
	Oscar oscar;
	public FilmeOscar(int id, String nome, String descricao, String dataPremiacao, Filme filme, Oscar oscar) {
		super(id, nome, descricao);
		this.dataPremiacao = dataPremiacao;
		this.filme = filme;
		this.oscar = oscar;
	}
	public String getDataPremiacao() {
		return dataPremiacao;
	}
	public void setDataPremiacao(String dataPremiacao) {
		this.dataPremiacao = dataPremiacao;
	}
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	public Oscar getOscar() {
		return oscar;
	}
	public void setOscar(Oscar oscar) {
		this.oscar = oscar;
	}
	
	
	

}
