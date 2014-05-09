package de.test.dnmonsters;

public class Fight {
	public Fight(Monster m1, Monster m2){
		int pruefer1=m1.stats.get_life();
		int pruefer2=m2.stats.get_life();
		while((pruefer1>0) && (pruefer2>0)){
		
			int option=1;//1bis 3(1 Angriff, 2Beutel, 3Wechsel)
			//abfrage
			if (option==1){
				int chosen;
				//auswahl über menü/buttons zuweisung chosen
				m1.select_attack(chosen, m1);	
			}
		}	
	}
}