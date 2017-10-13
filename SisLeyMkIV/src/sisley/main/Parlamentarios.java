package sisley.main;

import javax.swing.JOptionPane;

// TODO: Auto-generated Javadoc
/**
 * The Class Parlamentarios.
 */
public class Parlamentarios {
	
	/** The user. */
	private String usuario;
	
	/** The id par. */
	private int idPar;
	
	/** The asesores. */
	private String[] asesores= new String[8];
	
	/** The n 2. */
	ArrayList<Leyes> n2 = new ArrayList<Leyes>();
	
	/** The n 3. */
	ArrayList<Reglamentos> n3 =new ArrayList<Reglamentos>();
	
	/**
	 * Adds the asesor.
	 *
	 * @param i the i
	 * @param asesor the asesor
	 */
	public void addAsesor(int i, String asesor)
	{
		asesores[i] = asesor;
	}
	
	/**
	 * Asesore to string.
	 */
	public String asesoreToString(int i)
	{
			
			return asesores[i];
		
	}
	
	/**
	 * Instantiates a new parlamentarios.
	 */
	public Parlamentarios() {
		super();
	}
	
	/**
	 * Instantiates a new parlamentarios.
	 *
	 * @param usuario the usuario
	 */
	public Parlamentarios(String usuario) {

		this.usuario = usuario;
		this.idPar = 0;
	}
	
	/**
	 * Gets the usuario.
	 *
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	
	/**
	 * Sets the usuario.
	 *
	 * @param usuario the new usuario
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	/**
	 * Gets the id par.
	 *
	 * @return the id par
	 */
	public int getIdPar() {
		return idPar;
	}
	
	/**
	 * Sets the id par.
	 */
	public void setIdPar() {
		idPar++;
	}
	
	/**
	 * Copia ley.
	 *
	 * @param idLey the id ley
	 * @param copias the copias
	 * @param ley the ley
	 */
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
	
	/**
	 * Copia stack.
	 *
	 * @param idLey the id ley
	 * @param copias the copias
	 * @param ley the ley
	 * @param reg the reg
	 */
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Parlamentarios [usuario=" + usuario + ", idPar=" + idPar + ", n2=" + n2 + ", n3=" + n3 + "]";
	}
	
}
