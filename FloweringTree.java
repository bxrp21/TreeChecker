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
	
	public FloweringTree(int blossomStartDay, int blossomEndDay, int blossomStartHour, int blossomEndHour, String name){
		treeName = name;
		floweringStartTimeHours = getInTotalHours(blossomStartDay, blossomStartHour);
		floweringEndTimeHours = getInTotalHours(blossomEndDay, blossomEndHour);
	}
	
//-----------------------------------------------------------------------------------------------------	

	public void setName(String newName){
		treeName = newName;
	}//setName() method
	
//-----------------------------------------------------------------------------------------------------		

	public String getName(){
		return treeName;
	}//getName() method
	
//-----------------------------------------------------------------------------------------------------	
	
	public int getInTotalHours(int day, int hour){
		int total = 0;
		total = (day*24)+ hour;
		return total;
	}
	
//-----------------------------------------------------------------------------------------------------	
	
	public boolean isFlowering(int day, int hour){
		int currAbsoluteTime = getInTotalHours(day, hour); 
		if(floweringStartTimeHours <= currAbsoluteTime && currAbsoluteTime >= floweringEndTimeHours){
			return true;
		}//if
		return false;
	}//isFlowering
	
//------------------------------------------------------------------------------------------------------		
	
}//FloweringTree class
