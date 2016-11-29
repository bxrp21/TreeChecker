
public class TreeFactory {

//------------------------------------------------------------------------------------------------------	

	public FloweringTree buildTree(int blossomStartDay, int blossomEndDay, int blossomStartHour, int blossomEndHour, String name){
		if(name.equals("Franklin Tree")){
			return new FranklinTree(blossomStartDay, blossomEndDay, blossomStartHour, blossomEndHour);
		}
		if(name.equals("Blue Mist Shrub")){
			return new BlueMistShrub(blossomStartDay, blossomEndDay, blossomStartHour, blossomEndHour);
		}
		if(name.equals("CrabApple")){
			return new CrabApple(blossomStartDay, blossomEndDay, blossomStartHour, blossomEndHour);
		}
		return null;
	}//buildTree method
	
//------------------------------------------------------------------------------------------------------
	
}//tree factory class
