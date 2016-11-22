import java.util.ArrayList;

public class BloomingTreeController {

//-----------------------------------------------------------------------------------
/**
 * Instance Variables	
 */
	ArrayList<FloweringTree> listOfTrees;
	should this be in the model in a more explicit way??
	
	
	
//-----------------------------------------------------------------------------------	
/**
 * Blooming tree controller constructor	
 */
	
	public BloomingTreeController(){
		ArrayList<FloweringTree> listOfTrees = new ArrayList<FloweringTree>(); 
	}//BloomingTreeController constructor
	
	
//-----------------------------------------------------------------------------------	
	
/**
 * returns a list of Strings consisting of the names of all the trees blooming at the stated day and hour
 * combination. 	
 */
	
	public ArrayList<String> listofIsBlooming(int day, int hour){
		ArrayList<String> bloomingList = new ArrayList<String>();
		for (int i=0; i<listOfTrees.size(); i++){
			FloweringTree currTree = listOfTrees.get(i);
			if(currTree.isFlowering(day,  hour)){
				bloomingList.add(currTree.getName());
			}//if
		}//for
		return bloomingList;
	}//listofIsBlooming method
	
//-----------------------------------------------------------------------------------	
	
	public void displayCurrFloweringTrees(int day, int hour){
		ArrayList<String> bloomingList = listofIsBlooming(day, hour);
		
	}//displayCurrFloweringTrees() method
	
//-----------------------------------------------------------------------------------	
	
}//Controller
