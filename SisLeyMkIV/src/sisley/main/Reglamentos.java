package sisley.main;

public class Reglamentos extends Leyes {
		
		private int idReglamentos;
		private String reglamento;
		private int copias;
		
		public Reglamentos(String ley, int idLey) {
			super(ley);
			reglamento = ley;
			idReglamentos = idLey;
			copias = 5;
		}
		public int getIdReglamentos() {
			return idReglamentos;
		}
		public void setIdReglamentos(int idReglamentos) {
			this.idReglamentos = idReglamentos;
		}
		public String getReglamento() {
			return reglamento;
		}
		public void setReglamento(String reglamento) {
			this.reglamento = reglamento;
		}
		public int getCopias() {
			return copias;
		}
		public void setCopias(int copias) {
			this.copias = copias;
		}
}
