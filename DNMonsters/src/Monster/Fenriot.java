package Monster;

public class Fenriot extends de.test.dnmonsters.Monster {
	public Fenriot(int level){
		this.stats.set_lifemax(120+(int)Math.random()*8-4);
		this.stats.set_physdmg(35+(int)Math.random()*4-2);
		this.stats.set_physdeff(30+(int)Math.random()*4-2);
		this.stats.set_dodge(3);
		this.stats.set_eledmg(25+(int)Math.random()*4-2);
		this.stats.set_eledeff(25+(int)Math.random()*4-2);
		this.stats.set_speed(110+(int)Math.random()*2-1);
		this.stats.set_precision(12+(int)Math.random()*2-1);
		this.klasse[1].set_Klasse("Nox");
		this.klasse[0].set_Klasse("Mammalia");
		if(level!=1)
		{
			this.stats.level_up_lifetank(level-1);
		}
		int l=this.stats.get_expnext();
		this.stats.set_exp((int)((int)Math.random()*l)/2);
	}
}
