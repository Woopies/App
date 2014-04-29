package de.test.dnmonsters;

public class Klasse {
	private int klasse;
	public void set_Klasse(String s){
			if( s.equals("Lux")){
			 klasse=1;}
			else if (s.equals("Nox")){
				klasse=2;
			}
			else if(s.equals("Luxdubia")){
				klasse=3;
			}
			else if(s.equals("Pyro")){
				klasse=4;
			}
			else if(s.equals("Aqua")){
				klasse=5;
			}
			else if(s.equals("Aero")){
				klasse=6;
			}
			else if(s.equals("Terra")){
				klasse=7;
			}
			else if(s.equals("Toxi")){
				klasse=8;
			}
			else if(s.equals("Elektro")){
				klasse=9;
			}
			else if(s.equals("Kryo")){
				klasse=10;
			}
			if(s.equals("Mammalia")){
				klasse=11;
			}
			else if (s.equals("Reptilia")){
				klasse=12;
			}
			else if (s.equals("Aves")){
				klasse=13;
			}
			else if (s.equals("Arthropoda")){
				klasse=14;
			}
			else if (s.equals("Amphibia")){
				klasse=15;
			}
			else if(s.equals("Pisces")){
				klasse=16;
			}
			else if(s.equals("Flora")){
				klasse=17;
			}
			else if(s.equals("Mutant")){
				klasse=18;
			}
 }
	
	public int get_eleclass(){
		return klasse;
	}
}
