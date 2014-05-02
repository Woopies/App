package Monster;

public class Vulkanura extends de.test.dnmonsters.Monster {
	public Vulkanura(int level){
		this.stats.set_lifemax(90+(int)Math.random()*8-4);
		this.stats.set_physdmg(25+(int)Math.random()*4-2);
		this.stats.set_physdeff(20+(int)Math.random()*4-2);
		this.stats.set_dodge(4);
		this.stats.set_eledmg(35+(int)Math.random()*4-2);
		this.stats.set_eledeff(20+(int)Math.random()*4-2);
		this.stats.set_speed(100+(int)Math.random()*2-1);
		this.stats.set_precision(10+(int)Math.random()*2-1);
		this.klasse[1].set_Klasse("Pyro");
		this.klasse[0].set_Klasse("Amphibia");
		if(level!=1)
		{
			this.stats.level_up_lifetank(level-1);
		}
		int l=this.stats.get_expnext();
		this.stats.set_exp((int)((int)Math.random()*l)/2);
	}
}
