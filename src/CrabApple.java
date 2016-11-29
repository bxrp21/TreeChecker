
public class CrabApple extends FloweringTree {

//------------------------------------------------------------------------------------------------------	
/**
 * BlueMistShrub constructor.	
 * @param blossomStartDay
 * @param blossomEndDay
 * @param blossomStartHour
 * @param blossomEndHour
 * @param name
 */
	public CrabApple(int blossomStartDay, int blossomEndDay, int blossomStartHour, int blossomEndHour) {
		super(blossomStartDay, blossomEndDay, blossomStartHour, blossomEndHour, "CrabApple");
	}//FranklinTree constructor
			
//------------------------------------------------------------------------------------------------------	
/**
 * Tree specific flowering method	
 */
			
	public void BlueMistFlower(){
		System.out.println("The blue mist shrub flowers and a blue pollen mist fills the air.");
	}//FranklinFlower method
			
//------------------------------------------------------------------------------------------------------
}
