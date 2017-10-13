package sisley.main;

// TODO: Auto-generated Javadoc
/**
 * The Class Solicitudes.
 */
public class Solicitudes {
	
	/** The ley. */
	private String ley;
	
	/** The id ley. */
	private int idLey;
	
	/** The id reg. */
	private int idReg;
	
	/** The reglamento. */
	private String reglamento;
	
	/** The p 1. */
	private Parlamentarios p1;
	
	/** The index cola. */
	private int indexCola=0;
	
	/** The cola reglamentos. */
	ArrayList<Parlamentarios> colaReglamentos= new ArrayList<Parlamentarios>();
	
	/** The cola leyes. */
	ArrayList<Parlamentarios> colaLeyes= new ArrayList<Parlamentarios>();
	
	/**
	 * Presta reglamento.
	 *
	 * @param idReg the id reg
	 * @param copias the copias
	 * @param e the e
	 * @param a the a
	 */
	public void prestaReglamento(int idReg, int copias, Parlamentarios e, Reglamentos a) {
		
		if(copias <=2)
		{			e.copiaLey(idReg, copias, a);
		    	
		}
		else
		{
			colaReglamentos.add(indexCola, e);
	    	indexCola++;
		}
	}
	
	/**
	 * Presta ley.
	 *
	 * @param idLey the id ley
	 * @param copias the copias
	 * @param e the e
	 * @param a the a
	 */
	public void prestaLey(int idLey, int copias, Parlamentarios e, Leyes a) {
		
		if(copias <=2)
		{			e.copiaLey(idReg, copias, a);
		    	
		}
		else
		{
			colaLeyes.add(indexCola, e);
	    	indexCola++;
		}
	}
	
	/**
	 * Presta stack.
	 *
	 * @param idLey the id ley
	 * @param copias the copias
	 * @param e the e
	 * @param a the a
	 * @param b the b
	 */
	private void prestaStack(int idLey, int copias, Parlamentarios e , Leyes a, Reglamentos b)
	{
		
		if(copias <=2)
		{			e.copiaStack(idLey, copias, a, b);
		    	
		}
		else
		{
			colaLeyes.add(indexCola, e);
			indexCola++;
		}
	    	
	}
	
	/**
	 * Info ley.
	 *
	 * @param idLey the id ley
	 * @param e the e
	 * @param b the b
	 */
	public void infoLey(int idLey, Leyes e, Reglamentos b)
	{
		
	}
	
	

 
}
