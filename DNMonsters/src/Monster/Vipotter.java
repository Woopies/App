package Monster;

public class Vipotter extends de.test.dnmonsters.Monster {
	public Vipotter(int level){
		this.stats.set_lifemax(95+(int)Math.random()*8-4);
		this.stats.set_physdmg(30+(int)Math.random()*4-2);
		this.stats.set_physdeff(15+(int)Math.random()*4-2);
		this.stats.set_dodge(4);
		this.stats.set_eledmg(35+(int)Math.random()*4-2);
		this.stats.set_eledeff(15+(int)Math.random()*4-2);
		this.stats.set_speed(120+(int)Math.random()*2-1);
		this.stats.set_precision(8+(int)Math.random()*2-1);
		this.klasse[1].set_Klasse("Toxi");
		this.klasse[0].set_Klasse("Reptilia");
		if(level!=1)
		{
			this.stats.level_up_lifetank(level-1);
		}
		int l=this.stats.get_expnext();
		this.stats.set_exp((int)((int)Math.random()*l)/2);
	}

}
