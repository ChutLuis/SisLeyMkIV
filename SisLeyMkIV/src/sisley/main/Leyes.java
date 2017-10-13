package sisley.main;

// TODO: Auto-generated Javadoc
/**
 * The Class Leyes.
 */
public class Leyes {
	
	/** The Ley. */
	private String Ley;
	
	/** The id ley. */
	private int idLey;
	
	/** The copias. */
	private int copias;
 
	/**
	 * Instantiates a new leyes.
	 *
	 * @param ley the ley
	 */
	public Leyes(String ley) {
	Ley = ley;
	idLey = 0;
	copias = 5;
	}
	
	/**
	 * Gets the copias.
	 *
	 * @return the copias
	 */
	public int getCopias() {
		return copias;
	}
	
	/**
	 * Sets the copias.
	 *
	 * @param copias the new copias
	 */
	public void setCopias(int copias) {
		this.copias = copias;
	}
	
	/**
	 * Gets the ley.
	 *
	 * @return the ley
	 */
	public String getLey() {
		return Ley;
	}
	
	/**
	 * Sets the ley.
	 *
	 * @param ley the new ley
	 */
	public void setLey(String ley) {
		Ley = ley;
	}
	
	/**
	 * Gets the id ley.
	 *
	 * @return the id ley
	 */
	public int getIdLey() {
		return idLey;
	}
	
	/**
	 * Sets the id ley.
	 *
	 * @param idLey the new id ley
	 */
	public void setIdLey(int idLey) {
		this.idLey = idLey;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Leyes [Ley=" + Ley + ", idLey=" + idLey + ", copias=" + copias + "]";
	}

}
