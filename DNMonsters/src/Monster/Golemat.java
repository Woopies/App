package Monster;

public class Golemat extends de.test.dnmonsters.Monster{
	public Golemat(int level){
		this.stats.set_lifemax(110+(int)Math.random()*4-2);
		this.stats.set_physdmg(20+(int)Math.random()*2-1);
		this.stats.set_physdeff(50+(int)Math.random()*8-4);
		this.stats.set_dodge(0);
		this.stats.set_eledmg(20+(int)Math.random()*4-2);
		this.stats.set_eledeff(25+(int)Math.random()*4-2);
		this.stats.set_speed(25+(int)Math.random()*4-2);
		this.stats.set_precision(3+(int)Math.random()*2-1);
		this.klasse[1].set_Klasse("Terra");
		this.klasse[0].set_Klasse("Mutant");
		if(level!=1)
		{
			this.stats.level_up_lifetank(level-1);
		}
		int l=this.stats.get_expnext();
		this.stats.set_exp((int)((int)Math.random()*l)/2);
	}

}
