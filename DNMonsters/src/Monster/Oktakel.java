package Monster;

import Skills.Skills;
import de.test.dnmonsters.Monster;

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
