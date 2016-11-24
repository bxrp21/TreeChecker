import java.util.ArrayList;
import java.util.Scanner;

public class BloomingTreeController {

//-----------------------------------------------------------------------------------
/**
 * Instance Variables	
 */
	ArrayList<FloweringTree> listOfTrees;
	View floweringTreeView;

//-----------------------------------------------------------------------------------	
/**
 * Blooming tree controller constructor	
 */
	
	public BloomingTreeController(){
		listOfTrees = new ArrayList<FloweringTree>(); 
		floweringTreeView = new View();
	}//BloomingTreeController constructor
	
//-----------------------------------------------------------------------------------
/**
 * The following method will run the controller leaving it open to accept and respond to
 * queries about which trees are flowering. 
 * 
 */
	
	public void Run(){
		while(true){
			floweringTreeView.displayPrompt();
			String line = floweringTreeView.readLine();
			Scanner sc = new Scanner(line);
			int day = sc.nextInt();
			int hour = sc.nextInt();
			displayCurrFloweringTrees(day, hour);
		}//while
	}//run() method
	
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
	
//display is the method to use	
	
	public void displayCurrFloweringTrees(int day, int hour){
		ArrayList<String> bloomingList = listofIsBlooming(day, hour);
		for(int i=0; i<bloomingList.size(); i++){
			floweringTreeView.display(bloomingList.get(i));
		}//for
	}//displayCurrFloweringTrees() method
	
//-----------------------------------------------------------------------------------	
	
}//Controller
