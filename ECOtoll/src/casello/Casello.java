package casello;

public class Casello {

	private String Nome;
	private float Km;
	private String Tipologia;
	private float Maggiorazione;
	
	public Casello(String N, float km,String tipo)
	{
		this.Nome=N;
		this.Km=km;
		this.Tipologia=tipo;
		switch(tipo)
		{
		case "Salita" : this.Maggiorazione= (float) 1.03; break;
		case "Discesa" : this.Maggiorazione= (float)1.02; break;
		case "Pianura" : this.Maggiorazione=(float) 1; break;
		case "Montagna" : this.Maggiorazione= (float) 1.04; break;
		case "Mare" : this.Maggiorazione= (float) 1.06; break;
		}
	}
	public Casello()
	{}
	public String Verso(Casello a)
	{
		float c = a.Getkm() - this.Getkm();
		if(c<0) {return "Contrario";}
		else if (c>0){return "Dritto";}
		else {return "Coincidono";}
	}
	
	public float GetDistanza (Casello b) {
		
		return java.lang.Math.abs(this.Km-b.Km);
		
	}
	public String GetNome()
	{
		return this.Nome;
	}
	
	public float GetMaggiorazione() {return this.Maggiorazione;}
	
	public String GetTipologia()
	{
		return this.Tipologia;
	}
	
	public float Getkm()
	{
		return this.Km;
	}
}