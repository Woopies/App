package Monster;

public class Yggdrasil extends de.test.dnmonsters.Monster{
	public Yggdrasil(int level){
		this.stats.set_lifemax(150+(int)Math.random()*8-4);
		this.stats.set_physdmg(20+(int)Math.random()*4-2);
		this.stats.set_physdeff(30+(int)Math.random()*4-2);
		this.stats.set_dodge(0);
		this.stats.set_eledmg(22+(int)Math.random()*4-2);
		this.stats.set_eledeff(28+(int)Math.random()*4-2);
		this.stats.set_speed(20+(int)Math.random()*2-1);
		this.stats.set_precision(5+(int)Math.random()*2-1);
		this.klasse[1].set_Klasse("Lux");
		this.klasse[0].set_Klasse("Flora");
		if(level!=1)
		{
			this.stats.level_up_lifetank(level-1);
		}
		int l=this.stats.get_expnext();
		this.stats.set_exp((int)((int)Math.random()*l)/2);
	}

}
