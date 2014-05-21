package Skills;

import de.test.dnmonsters.Monster;

public class Skills {
	public String name;
	public String get_name(){
		return name;
	}
	
	public static void use_skill(int i,Monster m1,Monster m2){
	 switch (i){
	 case 1:{Verwurzeln.attack(m1,m2);break;}
	 }
	}
}
