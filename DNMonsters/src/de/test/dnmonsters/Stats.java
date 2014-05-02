package de.test.dnmonsters;

public class Stats {
	private int level=1;
	private int lifemax=0;
	private int life=0;
	private int energy=100;
	private int energymax=100;
	private int physdmg=0;
	private int physdeff=0;
	private int eledmg=0;
	private int eledeff=0;
	private int speed=0;
	private int exp=0;
	private int expnext=100;
	private int precision=0;
	private int dodge=0;
	private int reg=0;
	
	public int get_reg(){ //If Monster in Fight True or not?, abfrage ob reg ja oder nein//
		return reg;
	}
	
	public void set_reg(int s){
		reg+=s;
	}

	public int get_dodge(){
		return dodge;
	}
	public int get_precision(){
		return precision;
	}
	
	public int get_level(){
		return level;
	}
	public void level_up_lifetank(int l){
		if(level==50){
			return;
		}
		level=level+l;
		lifemax=lifemax+(int)0.1*lifemax+(int)(Math.random()*(10-7)+7);
		physdmg=physdmg+(int)(Math.random()*(3-1)+1);
		physdeff=physdeff+(int)(Math.random()*(4-2)+2);
		eledmg=eledmg+(int)(Math.random()*(3-1)+1);
		eledeff=eledeff+(int)(Math.random()*(4-2)+2);
		speed=speed+(int)(Math.random()*(4-2)+2);
		exp=0;
		expnext=(int)(expnext*(Math.random()+1));
		
	}
	public int get_physdmg(){
		return physdmg;
	}
	public int get_physdeff(){
		return physdeff;
	}
	public int get_eledmg(){
		return eledmg;
	}
	public int get_eledeff(){
		return eledeff;
	}
	public int get_speed(){
		return speed;
	}
	public int get_exp(){
		return exp;
	}
	public int get_expnext(){
		return expnext;
	}
	public int get_life(){
		return life;
	}
	public int get_lifemax(){
		return lifemax;
	}
	public int get_energy(){
		return energy;
	}
	public int get_energymax(){
		return energymax;
	}
	public void set_physdmg(int pd){
		physdmg+=pd;
	}
	public void set_physdeff(int pd){
		physdeff+=pd;
	}
	public void set_eledmg(int ed){
		eledmg+=ed;
	}
	public void set_eledeff(int ed){
		eledeff+=ed;
	}
	public void set_speed(int s){
		speed+=s;
	}
	public void set_exp(int e){
		exp+=e;
	}
	public  void set_lifemax(int l){
		lifemax=lifemax+l;
		life=lifemax;
	}
	public  void set_life(int l){
		life=life+l;
		if (life>=lifemax)
		{
			life=lifemax;
		}
	}
	public void set_precision(int p){
		precision=precision+p;
	}
	public void set_dodge(int d){
		dodge+=d;
	}
	public void set_energy(int e){
		energy+=e;
		if (energy>=energymax)
		{
			energy=energymax;
		}
	}
}
