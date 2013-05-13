package bilbi;
import java.util.Arrays;

import docu.Doc;


public class Biblio {

	private Doc[] lesDocuments;
	private int nbDocument;

	public Biblio() {
		
		this.lesDocuments = new Doc[10];
	
	}
	
	
	public void addDocument(Doc Document)
	{
		if(this.nbDocument<10)
		{
			lesDocuments[this.nbDocument]=Document;
			this.nbDocument++;
		}
		else
		{
			System.out.print("biblio complete");
		}
		
	}
	
	@Override
	public String toString() {
		return "Biblio [lesDocuments=" + Arrays.toString(lesDocuments)
				+ ", nbDocument=" + nbDocument + "]";
	}
	
	public void afficheContenu()
	{
		int i=0;
		while( i<this.nbDocument)
		{
			System.out.println( "Document "+ i + ":" + lesDocuments[i] );
			i++;
		}
		
	}


	
	
	
	
	
	
}
