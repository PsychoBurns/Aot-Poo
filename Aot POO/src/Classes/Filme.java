package Classes;

public class Filme extends Caracteristica{

	private String dataLancamento;
	private String duracao;
	FaixaIndicativa faixaIndicativa;
	public Filme(int id, String nome, String descricao, String dataLancamento, String duracao,
			FaixaIndicativa faixaIndicativa) {
		super(id, nome, descricao);
		this.dataLancamento = dataLancamento;
		this.duracao = duracao;
		this.faixaIndicativa = faixaIndicativa;
	}
	public String getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public FaixaIndicativa getFaixaIndicativa() {
		return faixaIndicativa;
	}
	public void setFaixaIndicativa(FaixaIndicativa faixaIndicativa) {
		this.faixaIndicativa = faixaIndicativa;
	}
	
	public void retorna() {
		
		getNome();
		getDescricao();
	
	}
	
	
	
}
