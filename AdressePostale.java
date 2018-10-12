package entity;

public class AdressePostale {
	
	int numRue;
	String rue ;
    int codePostal;
	String ville;
	
	
	public AdressePostale(int numRue,String rue,  int codePostal, String ville) {
		super();
		this.rue = rue;
		this.numRue = numRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}


	@Override
	public String toString() {
		return "mon adresse est"+" " +numRue + rue + ","  + codePostal + "," + ville;
				
	}
	
	
	

	
	
}
