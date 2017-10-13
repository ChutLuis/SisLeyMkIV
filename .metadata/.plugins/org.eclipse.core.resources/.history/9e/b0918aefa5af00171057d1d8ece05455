package sisley.main;

import javax.swing.JOptionPane;

public class Parlamentarios {
	private String usuario;
	private int idPar;
	ArrayList<Leyes> n2 = new ArrayList<Leyes>();
	ArrayList<Reglamentos> n3 =new ArrayList<Reglamentos>();
	
	
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
	public void setIdPar() {
		idPar++;
	}
	public void copiaLey(int idLey, int copias, Leyes ley)	 
	{
		int copiasL = 0;
		if(copias <= 2){
			n2.add(copiasL,ley);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Copias Maximas por Grupo Alcanzadas");	
		}
		
	}
	public void copiaStack(int idLey, int copias, Leyes ley, Reglamentos reg)
	{
		int copiasL = 0;
		if(copias <= 2){
			n2.add(copiasL,ley);
			n3.add(copiasL, reg);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Copias Maximas por Grupo Alcanzadas");	
		}
		
	}
}
