package docu;
import java.util.Date;






public class Doc {
	private String Titre;
	private int Numbre;
	private int PageNumber;
	private Date DateCreation;
	
	
	
	
	public Doc() {
	
	}
	
	
	public Doc(String titre, int numbre, int pageNumber) {
		super();
		Titre = titre;
		Numbre = numbre;
		PageNumber = pageNumber;
		DateCreation= new Date();
	}


	public String getTitre() {
		return Titre;
	}
	public void setTitre(String titre) {
		Titre = titre;
	}
	
	public int getNumbre() {
		return Numbre;
	}
	public void setNumbre(int numbre) {
		Numbre = numbre;
	}
	
	public int getPageNumber() {
		return PageNumber;
	}
	public void setPageNumber(int pageNumber) {
		PageNumber = pageNumber;
	}
	



	
	
	
	
		
	

		@Override
	public String toString() {
		return "Doc Titre=" + Titre + ", Numbre=" + Numbre + ", PageNumber="
				+ PageNumber + ", DateCreation=" + DateCreation ;
	}


		public void Affiche() 
		{
			
			System.out.println("le titre est: "+ Titre );
			
		}
	
		public void AfficheString() 
		{
			
			System.out.println(this.toString());
			
		}
	
	

}
