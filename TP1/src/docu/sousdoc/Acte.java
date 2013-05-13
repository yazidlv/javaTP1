package docu.sousdoc;
import java.util.Date;

import docu.Doc;


public class Acte extends Doc {

	private Date DateEvenement;

	public Acte() {
		super();
	}



	public Acte(String titre, int numbre, int pageNumber, Date dateEvenement) {
		super(titre, numbre, pageNumber);
		DateEvenement = dateEvenement;
	}



	public Date getDateEvenement() {
		return DateEvenement;
	}

	public void setDateEvenement(Date dateEvenement) {
		DateEvenement = dateEvenement;
	}

	
	@Override
	public String toString() {
		
		return super.toString() + "DateEvenement=" + DateEvenement;
	}



	public void AfficheString() 
	{
		
		System.out.println(this.toString());
		
	}

	
	
}
