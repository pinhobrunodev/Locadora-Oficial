package beans;

public class UsuarioBeans {

	private Integer id;
	private String nome;
	private String usuario;
	private String senha;
	private String email;
	
	public  UsuarioBeans() {
		
	}

	public UsuarioBeans(Integer id, String nome, String usuario, String senha, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
		this.email = email;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public void setUsuario(Object attribute) {
		
		this.usuario = (String) attribute;
		
	}
	
	


	
	
	
	
}
