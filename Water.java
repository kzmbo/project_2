public class Water extends Pokemon{
	public Water(String n, int h, int m) {
		super(n,h,m);
	}
	
	 @Override
	 public String getAttackMenu(int atkType) {
		 if(atkType == 1) {
			 super.getAttackMenu();
		 }
		 else if(atkType == 2) {
			 String specialMenu = "1. Watergun\n2. Bubblebeam\n 3. Waterfall";
			 return specialMenu;
		 }
		 return null;
	 }
	 public int getnumAttackMenuItem(int atkType) {
		 return atkType = 3;
	 }
	 
	 public String getAttackString(int atkType, int move) {
	        if(atkType == 1){
	            if(move == 1){
	                return "SLAMMED";
	            }else if (move == 2){
	                return "TACKLED";
	            }else if (move == 3){
	                return "PUNCHED";
	            }else{
	                return "OFFED";
	            }
	        }else if (atkType == 2){
	            if(move == 1){
	                return "WAS SPRAYED BY A TORRENT OF WATER";
	            }else if (move == 2){
	                return "GOT LOST IN THE BUBBLES";
	            }else if (move == 3){
	                return "WAS SQUASHED BY A WATERFALL";
	            }else{
	                return "OFFED";
	            }
	        }
	        return null;
	    }
	 public int getAttackDamage(int atkType, int move){
	        if(atkType == 1){
	            int basicDamage = 0;
	            if(move == 1){
	                basicDamage = (int)(Math.random() * 5);
	                return basicDamage;
	            }else if (move == 2){
	                basicDamage = (int)(Math.random() * 3) + 2;
	                return basicDamage;
	            }else if (move == 3){
	                basicDamage = (int)(Math.random() * 4) + 1;
	                return basicDamage;
	            }else{
	                return basicDamage;
	            }
	        }else if (atkType == 2){
	            int specialDamage = 0;
	            if(move == 1){
	                specialDamage = (int)(Math.random()*5)+0;
	                return specialDamage;
	            }else if (move == 2){
	                specialDamage = (int) (Math.random() * 3) + 1;
	                return specialDamage;
	            }else if (move == 3){
	                specialDamage = (int) (Math.random() * 4) + 1;
	                return specialDamage;
	            }else{
	                return specialDamage;
	            }
	        }
	        return 0;
	    }
}
/**
 *Done by Aidan Tristen Angel
 */


public int getAttackMultiplier(Pokemon p, int atkType){
    int damage = (int) (Math.random() * 3) + 1;
    if(getType() == 0){
        double amplified = Pokemon.battleTable[0][0];
        damage *= amplified;
    }
    else if(getType() == 1){
        double amplified = Pokemon.battleTable[0][1];
        damage *= amplified;
    }
    else{//getType () == 2
        double amplified = Pokemon.battleTable[0][2];
        damage *= amplified;
    }
    return damage;
}
}