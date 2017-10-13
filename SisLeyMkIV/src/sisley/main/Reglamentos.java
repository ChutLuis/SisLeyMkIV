package sisley.main;

// TODO: Auto-generated Javadoc
/**
 * The Class Reglamentos.
 */
public class Reglamentos extends Leyes {
		
		/** The id reglamentos. */
		private int idReglamentos;
		
		/** The reglamento. */
		private String reglamento;
		
		/** The copias. */
		private int copias;
		
		/**
		 * Instantiates a new reglamentos.
		 *
		 * @param ley the ley
		 * @param idLey the id ley
		 */
		public Reglamentos(String ley, int idLey) {
			super(ley);
			reglamento = ley;
			idReglamentos = idLey;
			copias = 5;
		}
		
		/**
		 * Gets the id reglamentos.
		 *
		 * @return the id reglamentos
		 */
		public int getIdReglamentos() {
			return idReglamentos;
		}
		
		/**
		 * Sets the id reglamentos.
		 *
		 * @param idReglamentos the new id reglamentos
		 */
		public void setIdReglamentos(int idReglamentos) {
			this.idReglamentos = idReglamentos;
		}
		
		/**
		 * Gets the reglamento.
		 *
		 * @return the reglamento
		 */
		public String getReglamento() {
			return reglamento;
		}
		
		/**
		 * Sets the reglamento.
		 *
		 * @param reglamento the new reglamento
		 */
		public void setReglamento(String reglamento) {
			this.reglamento = reglamento;
		}
		
		/* (non-Javadoc)
		 * @see sisley.main.Leyes#getCopias()
		 */
		public int getCopias() {
			return copias;
		}
		
		/* (non-Javadoc)
		 * @see sisley.main.Leyes#setCopias(int)
		 */
		public void setCopias(int copias) {
			this.copias = copias;
		}
		
		/* (non-Javadoc)
		 * @see sisley.main.Leyes#toString()
		 */
		@Override
		public String toString() {
			return "Reglamentos [idReglamentos=" + idReglamentos + ", reglamento=" + reglamento + ", copias=" + copias
					+ "]";
		}
		
}
