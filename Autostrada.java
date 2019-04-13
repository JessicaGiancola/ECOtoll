import veicolo.Veicolo;

import java.util.*;

import casello.Casello;
import percorso.Percorso;
import pedaggio.Pedaggio;

public class Autostrada{

	public static void main(String[] args) {
		
		ArrayList<Pedaggio> P = new ArrayList<Pedaggio>();
		
		
		Pedaggio a1= new Pedaggio((float)0.23,"A",(float) 1.22);
		Pedaggio b1= new Pedaggio((float)0.21,"B",(float) 1.22);
		Pedaggio p3= new Pedaggio((float)0.27,"3",(float) 1.22);
		Pedaggio p4= new Pedaggio((float)0.40,"4",(float) 1.22);
		Pedaggio p5= new Pedaggio((float)0.35,"5",(float) 1.22);
		
		P.add(a1);
		P.add(b1);
		P.add(p3);
		P.add(p4);
		P.add(p5);
		
		
		ArrayList<Casello> Caselli= new ArrayList<Casello>();
		
		Casello a = new Casello("a", 0, "Salita");
		Casello b = new Casello("b", (float)25, "Discesa");
		Casello c = new Casello("c", (float)50, "Pianura");
		Casello d = new Casello("d", (float)75, "Galleria");
		Casello e = new Casello("e", (float)100, "Pianura");
		
		Caselli.add(a);
		Caselli.add(b);
		Caselli.add(c);
		Caselli.add(d);
		Caselli.add(e);
		
		ArrayList<Veicolo> Veicoli= new ArrayList<Veicolo>();
		
		Veicolo v1 = new Veicolo ("Punto","Fiat",2016,"1",2,(float)100,(float)100,"B",3);
		Veicolo v2 = new Veicolo ("Doblò","Fiat",2004,"2",2,(float)100,(float)100,"B",2);
		Veicolo v3 = new Veicolo ("Autobus","ARPA",2010,"3",3,(float)100,(float)100,"3",4);
		Veicolo v4 = new Veicolo ("Giulietta","Alfa Romeo",2008,"4",2,(float)100,(float)100,"B",5);
		Veicolo v5 = new Veicolo ("Autotreno","Autotreno",1998,"5",5,(float)100,(float)100,"5",1);
		Veicolo v6 = new Veicolo ("Autocarro","Autocarro",2014,"6",4,(float)100,(float)100,"4",2);
		Veicolo v7 = new Veicolo ("Autocarro2","Autoc",2019,"7",4,(float)100,(float)100,"4",5);
		Veicolo v8 = new Veicolo ("Caravan","Carav",0,"8",3,(float)100,(float)100,"3",5);
		
		Veicoli.add(v1);
		Veicoli.add(v2);
		Veicoli.add(v3);
		Veicoli.add(v4);
		Veicoli.add(v5);
		Veicoli.add(v6);
		Veicoli.add(v7);
		Veicoli.add(v8);
		
			
		System.out.println("Inserisci il casello di entrata (a,b,c,d,e)");
		Scanner input = new Scanner(System.in);
		String entrata = input.nextLine();
		System.out.println("Casello di entrata:"+entrata+"\n Inserisci il casello di uscita (a,b,c,d,e)");
		String uscita= input.nextLine();
		System.out.println("Casello di entrata:"+entrata+"\n Casello di Uscita:"+uscita+"\n Inserisci la targa del veicolo (1,2,3,4,5,6,7,8)");
		String targa= input.nextLine();
		
		Veicolo Auto = new Veicolo();
		for(int i=0; i<Veicoli.size();i++)
		{
			if (Veicoli.get(i).GetTarga().equals(targa))
			{
				Auto=Veicoli.get(i);
			}
		}	

			Casello ee= new Casello();
			Casello uu= new Casello();
			int j=0;
			int k=0;
			for (int i=0; i<Caselli.size(); i++)
			{
				if (Caselli.get(i).GetNome().equals(entrata))
				{
					ee= Caselli.get(i);
					j=i;
				}
				if (Caselli.get(i).GetNome().equals(uscita))
				{
					uu= Caselli.get(i);
					k=i;
				}
			}
			Percorso Perc = new Percorso(ee, uu, Auto);
			
			
			String w = Perc.GetEntrata().Verso(Perc.GetUscita());

			
			Pedaggio p= new Pedaggio();
			
			for (int i=0; i<P.size();i++)
			{
				if (P.get(i).GetClassev().equals(Perc.GetVeicolo().GetClasse()))
				{
						p= P.get(i);}		
			}
			float importo=0;
			switch (w) {
			case "Dritto":
				for (int i=j+1; i<=k; i++)
				{				
						Casello f = Caselli.get(i);
						Casello m = Caselli.get(i-1);
						importo = importo + p.CalcolaImporto(f, m);
					
					
				} break;
			
			case "Contrario": for (int i=j; i>k; i--)
			{				

					Casello f = Caselli.get(i);
					Casello m = Caselli.get(i-1);
					importo= importo + p.CalcolaImporto(f, m);
			} break;
			
			case "Coincidono": System.out.println("I caselli di entrata ed uscita coincidono o non esistono"); break;
			
			}
			
			importo=importo*10;
			importo= java.lang.Math.round(importo);
			importo=importo/10;
			System.out.println("L'importo da pagare è: €"+importo);
		
		
			}}



