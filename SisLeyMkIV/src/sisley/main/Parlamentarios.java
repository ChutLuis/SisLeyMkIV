package sisley.main;

public class Parlamentarios {
	private String usuario;
	private int idPar;
	
	
	
	public Parlamentarios() {
		super();
	}
	public Parlamentarios(String usuario) {

		this.usuario = usuario;
		this.idPar = 0;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public int getIdPar() {
		return idPar;
	}
	public void setIdPar(int idPar) {
		this.idPar = idPar;
	}
	public void copiaLey()
	{
		
	}
	
}
