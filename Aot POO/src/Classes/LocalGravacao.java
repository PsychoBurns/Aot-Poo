package Classes;

public class LocalGravacao extends Caracteristica {

	private String dataInicio;
	private String dataFim;
	public LocalGravacao(int id, String nome, String descricao, String dataInicio, String dataFim) {
		super(id, nome, descricao);
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	
	
	
	
}
