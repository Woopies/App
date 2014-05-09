package Monster;

import Skills.Skills;
import de.test.dnmonsters.Monster;

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
			{	
				for(int i=1;i<level;i++){
				level_up();}
			}
			int l=this.stats.get_expnext();
			this.stats.set_exp((int)((int)Math.random()*l)/2);
		}
	}
		@Override public void select_attack(int chosen, Monster target){
			if (chosen==0){
				Skills.use_skill(skills[0],this,target);
			}
		}
	public void level_up(){
		int i=this.stats.get_exp();
		this.stats.set_lifemax((int)0.1*this.stats.get_lifemax()+(int)(Math.random()*(10-7)+7));
		this.stats.set_physdmg((int)(Math.random()*(3-1)+1));
		this.stats.set_physdeff((int)(Math.random()*(4-2)+2));
		this.stats.set_eledmg((int)(Math.random()*(3-1)+1));
		this.stats.set_eledeff((int)(Math.random()*(4-2)+2));
		this.stats.set_speed((int)(Math.random()*(4-2)+2));
		this.stats.reset_exp();
		this.stats.set_exp(i-this.stats.get_expnext());
		this.stats.set_expnext((int)(this.stats.get_expnext()*(Math.random()+1)));
		
	}
}
