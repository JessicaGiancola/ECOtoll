package percorso;

import casello.Casello;
import veicolo.Veicolo;

public class Percorso {
	
	private Casello Ingresso;
	private Casello Uscita;
	private Veicolo V;

	public Percorso (Casello I, Casello U, Veicolo V)
	{
		this.Ingresso=I;
		this.Uscita=U;
		this.V=V;
	}
	
	public Casello GetEntrata() {return this.Ingresso;}
	public Casello GetUscita() {return this.Uscita;}
	public Veicolo GetVeicolo() {return this.V;}
}
