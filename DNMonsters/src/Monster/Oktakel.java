package Monster;

public class Oktakel extends de.test.dnmonsters.Monster{
	public Oktakel(int level){
		this.stats.set_lifemax(100+(int)Math.random()*4-2);
		this.stats.set_physdmg(60+(int)Math.random()*8-4);
		this.stats.set_physdeff(10+(int)Math.random()*2-1);
		this.stats.set_dodge(6);
		this.stats.set_eledmg(10+(int)Math.random()*4-2);
		this.stats.set_eledeff(20+(int)Math.random()*4-2);
		this.stats.set_speed(50+(int)Math.random()*4-2);
		this.stats.set_precision(5+(int)Math.random()*2-1);
		this.klasse[1].set_Klasse("Aqua");
		this.klasse[0].set_Klasse("Mutant");
		if(level!=1)
		{
			this.stats.level_up_lifetank(level-1);
		}
		int l=this.stats.get_expnext();
		this.stats.set_exp((int)((int)Math.random()*l)/2);
	}

}
