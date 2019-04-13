package pedaggio;

import percorso.Percorso;
import casello.Casello;
import veicolo.Veicolo;
import java.lang.Math;
import java.util.*;

public class Pedaggio {

	private float TariffaU;
	private String ClasseV;
	private float IVA;
	
	
	public Pedaggio (float T, String C, float I)
	{
		this.TariffaU=T;
		this.ClasseV=C;
		this.IVA=I;
	}
	public Pedaggio ()
	{}
	
	public String GetClassev() {return this.ClasseV;}
	public float GetTariffa() {return this.TariffaU;}
	
	public float CalcolaImporto(Casello a, Casello b)
	{		
			float d= (a.Getkm()-b.Getkm())*this.IVA*this.TariffaU*a.GetMaggiorazione();
			float importo= java.lang.Math.abs(d);
		
		return importo;
	}
	
}

