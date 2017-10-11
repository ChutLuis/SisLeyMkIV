package sisley.main;

public class Asesores extends Parlamentarios {
	
	
	private int idParl;
	private String userAse;
	
	public Asesores() {
		super();
	}
	public Asesores(String usuario, int idPar) {
		super(usuario);
		userAse = usuario;
		idParl = idPar; 
	}
	public int getIdParl() {
		return idParl;
	}
	public void setIdParl(int idParl) {
		this.idParl = idParl;
	}
	public String getUserAse() {
		return userAse;
	}
	public void setUserAse(String userAse) {
		this.userAse = userAse;
	}
	
}
