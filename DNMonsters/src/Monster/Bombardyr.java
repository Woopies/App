package Monster;

public class Bombardyr extends de.test.dnmonsters.Monster{
	public Bombardyr(int level){
		this.stats.set_lifemax(100+(int)Math.random()*4-2);
		this.stats.set_physdmg(10+(int)Math.random()*4-2);
		this.stats.set_physdeff(35+(int)Math.random()*4-2);
		this.stats.set_dodge(0);
		this.stats.set_eledmg(50+(int)Math.random()*8-4);
		this.stats.set_eledeff(20+(int)Math.random()*4-2);
		this.stats.set_speed(30+(int)Math.random()*2-1);
		this.stats.set_precision(5+(int)Math.random()*2-1);
		this.klasse[1].set_Klasse("Pyro");
		this.klasse[0].set_Klasse("Arthropode");
		if(level!=1)
		{
			this.stats.level_up_lifetank(level-1);
		}
		int l=this.stats.get_expnext();
		this.stats.set_exp((int)((int)Math.random()*l)/2);
	}

}
