package beans;

public class Usuario_VeiculoBeans {

	private UsuarioBeans usuarioBeans;
	private VeiculoBeans veiculoBens;

	public Usuario_VeiculoBeans() {
		
	}

	public Usuario_VeiculoBeans(UsuarioBeans usuarioBeans, VeiculoBeans veiculoBens) {
		super();
		this.usuarioBeans = usuarioBeans;
		this.veiculoBens = veiculoBens;
	}

	public UsuarioBeans getUsuarioBeans() {
		return usuarioBeans;
	}

	public void setUsuarioBeans(UsuarioBeans usuarioBeans) {
		this.usuarioBeans = usuarioBeans;
	}

	public VeiculoBeans getVeiculoBens() {
		return veiculoBens;
	}

	public void setVeiculoBens(VeiculoBeans veiculoBens) {
		this.veiculoBens = veiculoBens;
	}

}
