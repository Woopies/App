package de.test.dnmonsters;

public class Stats {
	private int level=1;
	private int life;
	private int energy;
	private int physdmg=0;
	private int physdeff=0;
	private int eledmg=0;
	private int eledeff=0;
	private int speed=0;
	private int exp=0;
	private int expnext=100;

	public int get_level(){
		return level;
	}
	public void level_up(int l){
		if(level==50){
			return;
		}
		level=level+1;
		physdmg=physdmg+(int)(Math.random()*(5-2)+2);
		physdeff=physdeff+(int)(Math.random()*(5-2)+2);
		eledmg=eledmg+(int)(Math.random()*(5-2)+2);
		eledeff=eledeff+(int)(Math.random()*(5-2)+2);
		speed=speed+(int)(Math.random()*(10-5)+5);
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
	public int get_energy(){
		return energy;
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
	
}
