package fivePOO;

public class Employee extends Personne{
	private double salaire;
	private String poste;
	@Override
	public double calculerRevenu(double revenusVar)
	{
		return salaire+revenusVar;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public Employee(double salaire, String poste) {
		super();
		this.salaire = salaire;
		this.poste = poste;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
