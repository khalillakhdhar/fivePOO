package fivePOO;

public abstract class Animal {
	private String nom;
	private String origine;
	private int age;
	private String catégorie;
	
	
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(String nom, String origine, int age, String catégorie) {
		super();
		this.nom = nom;
		this.origine = origine;
		this.age = age;
		this.catégorie = catégorie;
	}
	public void deplacer(int x1,int x2,int y1, int y2)
	{
		System.out.println("déplacement de "+x1+" à "+x2+ "et de "+y1+" vers "+y2);
		
	}
	public abstract void faireBruit();
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getOrigine() {
		return origine;
	}
	public void setOrigine(String origine) {
		this.origine = origine;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCatégorie() {
		return catégorie;
	}
	public void setCatégorie(String catégorie) {
		this.catégorie = catégorie;
	}
	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", origine=" + origine + ", age=" + age + ", catégorie=" + catégorie + "]";
	}

}
