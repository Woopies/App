package Monster;

public class Lektropard extends de.test.dnmonsters.Monster{
	public Lektropard(int level){
		this.stats.set_lifemax(90+(int)Math.random()*8-4);
		this.stats.set_physdmg(35+(int)Math.random()*4-2);
		this.stats.set_physdeff(8+(int)Math.random()*2-1);
		this.stats.set_dodge(7);
		this.stats.set_eledmg(35+(int)Math.random()*4-2);
		this.stats.set_eledeff(8+(int)Math.random()*2-1);
		this.stats.set_speed(100+(int)Math.random()*8-4);
		this.stats.set_precision(15+(int)Math.random()*4-2);
		this.klasse[1].set_Klasse("Elektro");
		this.klasse[0].set_Klasse("Mammalia");
		if(level!=1)
		{
			this.stats.level_up_lifetank(level-1);
		}
		int l=this.stats.get_expnext();
		this.stats.set_exp((int)((int)Math.random()*l)/2);
	}

}
