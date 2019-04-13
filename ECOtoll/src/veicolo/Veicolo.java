package veicolo;

public class Veicolo {
	private String Modello;
	private String Marca;
	private int Anno;
	private String Targa;
	private int Assi;
	private float Peso;
	private float Altezza;
	private String Classe;
	private int EuroMotore;
	
	public Veicolo(String Mo, String Ma, int An, String T, int As, float P, float Al, String C, int EM) 
	{
		
		this.Modello=Mo;
		this.Marca=Ma;
		this.Anno=An;
		this.Targa=T;
		this.Assi=As;
		this.Peso=P;
		this.Altezza=Al;
		this.Classe=C;
		this.EuroMotore=EM;
		
	}
	public Veicolo() {}

	public String GetTarga()
	{
		return this.Targa;
	}
	
	public String GetModello()
	{
		return this.Modello;
	}
	
	public String GetMarca()
	{
		return this.Marca;
	}
	
	public String GetClasse()
	{
		return this.Classe;
	}
	
	public int GetEuro()
	{
		return this.EuroMotore;
	}
	
	public int GetAnno()
	{
		return this.Anno;
	}
	
	public int GetAssi()
	{
		return this.Assi;
	}
	
	public float GetPeso()
	{
		return this.Peso;
	}
	
	public float GetAltezza()
	{
		return this.Altezza;
	}
	
	
}
