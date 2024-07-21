package fivePOO;

public class Personne {
	private String nom,prenom;
	private String adresse;
	private int age;

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Personne() {
		super();
	}
	public double calculerRevenu(double revenusVar)
	{
		return revenusVar;
	}

	public void saluer()
	{
		System.out.println("Salut");
		
	}
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", age=" + age + "]";
	}
	
	
	

}
