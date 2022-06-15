package Classes;

public class Patrocinadores extends Caracteristica {

	private float invstimento;

	public Patrocinadores(int id, String nome, String descricao, float invstimento) {
		super(id, nome, descricao);
		this.invstimento = invstimento;
	}

	public float getInvstimento() {
		return invstimento;
	}

	public void setInvstimento(float invstimento) {
		this.invstimento = invstimento;
	}
	
	
	
}
