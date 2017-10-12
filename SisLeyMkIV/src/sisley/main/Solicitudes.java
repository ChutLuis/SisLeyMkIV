package sisley.main;

public class Solicitudes {
	private String ley;
	private int idLey;
	private int idReg;
	private String reglamento;
	private Parlamentarios p1;
	private int indexCola=0;
	ArrayList<Parlamentarios> colaReglamentos= new ArrayList<Parlamentarios>();
	ArrayList<Parlamentarios> colaLeyes= new ArrayList<Parlamentarios>();
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
	public void infoLey(int idLey, Leyes e, Reglamentos b)
	{
		
	}
	
	

 
}
