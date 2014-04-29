package Skills;

public class Verwurzeln extends de.test.dnmonsters.Skills {
	@Override public void attack(de.test.dnmonsters.Monster Angreifer, de.test.dnmonsters.Monster Verteidiger){
		int quantity=(int)Math.random()*3+2;
		float ausweich=(int)(Verteidiger.stats.get_dodge()/Angreifer.stats.get_speed()+Math.random());
		Angreifer.stats.set_energy(-12);
		if (ausweich<1)
			{for(int i=1; i<=quantity;i++){
				int absorb=10+(int)((Math.random()+0.2)/2*Angreifer.stats.get_eledmg());
				if (Verteidiger)
				Verteidiger.stats.set_life(-absorb);
				Angreifer.stats.set_life((int)0.8*absorb);
			}
			}
		else{
			//Output ausgewichen!!!!
		}
	}
}
