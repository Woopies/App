package Skills;

public class Verwurzeln extends de.test.dnmonsters.Skills {
	@Override public void attack(de.test.dnmonsters.Monster Angreifer, de.test.dnmonsters.Monster Verteidiger){
		float ausweich=(int)(Verteidiger.stats.get_dodge()/Angreifer.stats.get_speed()+Math.random());
		Angreifer.stats.set_energy(-12);
		if (ausweich<1){
				int absorb=10+(int)((Math.random()+0.2)/2*Angreifer.stats.get_eledmg());
				Verteidiger.stats.set_reg(-absorb);
				Angreifer.stats.set_reg(absorb);
			}
		else{
			//Output ausgewichen!!!!
		}
	}
	public Verwurzeln(de.test.dnmonsters.Monster Angreifer, de.test.dnmonsters.Monster Verteidiger){
		attack(Angreifer,Verteidiger);		
	}
}
