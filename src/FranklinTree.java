
public class FranklinTree extends FloweringTree {
	
//------------------------------------------------------------------------------------------------------	
/**
 * FranklinTree constructor.	
 * @param blossomStartDay
 * @param blossomEndDay
 * @param blossomStartHour
 * @param blossomEndHour
 * @param name
 */
	public FranklinTree(int blossomStartDay, int blossomEndDay, int blossomStartHour, int blossomEndHour) {
		super(blossomStartDay, blossomEndDay, blossomStartHour, blossomEndHour, "Franklin Tree");
	}//FranklinTree constructor
	
//------------------------------------------------------------------------------------------------------	
/**
 * Tree specific flowering method	
 */
	
	public void FranklinFlower(){
		System.out.println("The franklin tree flowers like it's the only  tree of it's genus that can!");
	}//FranklinFlower method
	
//------------------------------------------------------------------------------------------------------	
}//FranklinTree class
