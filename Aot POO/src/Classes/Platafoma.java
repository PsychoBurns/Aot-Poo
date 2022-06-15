package Classes;

public class Platafoma extends Caracteristica {

	private String tipo;

	public Platafoma(int id, String nome, String descricao, String tipo) {
		super(id, nome, descricao);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
