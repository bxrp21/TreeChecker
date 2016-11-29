/**
 * The following is an abstract class specifying the elements common to all flowering trees in the program.
 * @author jgbeninger
 *
 */

public class FloweringTree {

//------------------------------------------------------------------------------------------------------
/**
 * Instance variables	
 */
	
	private int floweringStartDay;
	private int floweringEndDay;
	private int floweringStartHour;
	private int floweringEndHour;
	private int floweringStartTimeHours;
	private int floweringEndTimeHours;
	private String treeName;
	
//------------------------------------------------------------------------------------------------------	
/**
 * 
 * Flowering Tree constructor.	
 * @param blossomStartDay
 * @param blossomEndDay
 * @param blossomStartHour
 * @param blossomEndHour
 * @param name
 */
	
	public FloweringTree(int blossomStartDay, int blossomEndDay, int blossomStartHour, int blossomEndHour, String name){
		treeName = name;
		floweringStartTimeHours = getInTotalHours(blossomStartDay, blossomStartHour);
		floweringEndTimeHours = getInTotalHours(blossomEndDay, blossomEndHour);
	}
	
//-----------------------------------------------------------------------------------------------------	
/**
 * This method sets the name of a tree to newName.
 * @param newName
 */
	public void setName(String newName){
		treeName = newName;
	}//setName() method
	
//-----------------------------------------------------------------------------------------------------		
/**
 *
 * @return The name of the tree.
 */
	
	public String getName(){
		return treeName;
	}//getName() method
	
//-----------------------------------------------------------------------------------------------------	
/**
 * @return a String which is the name of the tree.
 */

	public String toString(){
		return getName();
	}
	
//-----------------------------------------------------------------------------------------------------	
/**
 * 	
 * @param day
 * @param hour
 * @return total time represented in hours.
 */
	
	public int getInTotalHours(int day, int hour){
		int total = 0;
		total = (day*24)+ hour;
		return total;
	}
	
//-----------------------------------------------------------------------------------------------------	
/**
 * 	
 * @param day
 * @param hour
 * @return True if the flower is blooming at the specified time, false otherwise.
 */
	
	public boolean isFlowering(int day, int hour){
		int currAbsoluteTime = getInTotalHours(day, hour); 
		if(floweringStartTimeHours <= currAbsoluteTime && currAbsoluteTime <= floweringEndTimeHours){
			return true;
		}//if
		return false;
	}//isFlowering
	
//------------------------------------------------------------------------------------------------------		
	
}//FloweringTree class
