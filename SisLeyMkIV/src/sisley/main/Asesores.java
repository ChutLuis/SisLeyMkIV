package sisley.main;

public class Asesores extends Parlamentarios {
	
	private int idParl;
	private String userAse;
	private Parlamentarios a;
	public Asesores(String usuario) {
		this.userAse = usuario;
		this.idParl = a.getIdPar();
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
