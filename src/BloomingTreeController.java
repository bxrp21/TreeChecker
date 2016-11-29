import java.util.ArrayList;
import java.util.Scanner;

public class BloomingTreeController {

//-----------------------------------------------------------------------------------
/**
 * Instance Variables	
 */
	ArrayList<FloweringTree> listOfTrees;
	View floweringTreeView;
	TreeFactory factory;

//-----------------------------------------------------------------------------------	
/**
 * Blooming tree controller constructor	
 */
	
	public BloomingTreeController(){
		listOfTrees = new ArrayList<FloweringTree>(); 
		floweringTreeView = new View();
		factory = new TreeFactory();
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
/**
 * This method displays the list of trees currently flowering at a given day and hour.
 * @param day
 * @param hour
 */
		
	public void displayCurrFloweringTrees(int day, int hour){
		ArrayList<String> bloomingList = listofIsBlooming(day, hour);
		floweringTreeView.display("The flowering trees at the day and time are...\n");
		for(int i=0; i<bloomingList.size(); i++){
			floweringTreeView.display(bloomingList.get(i));
			if(i+2 == bloomingList.size())
				floweringTreeView.display(", and ");
			else if(i+1 != bloomingList.size())
				floweringTreeView.display(", ");	
			else
				floweringTreeView.display(".");
		}//for
		if(bloomingList.size() == 0)
			floweringTreeView.display("None.");
		floweringTreeView.display("\n");
	}//displayCurrFloweringTrees() method
	
//-----------------------------------------------------------------------------------	
/**
 * This method adds a type of flowering tree to the model constructed based on the
 * parameters given.
 * @param blossomStartDay
 * @param blossomEndDay
 * @param blossomStartHour
 * @param blossomEndHour
 * @param name
 */
	
	public void addFloweringTreeType(int blossomStartDay, int blossomEndDay, int blossomStartHour, int blossomEndHour, String name){
		listOfTrees.add(factory.buildTree(blossomStartDay, blossomEndDay, blossomStartHour, blossomEndHour, name));
	}//addBloomingTree() method
	
//-----------------------------------------------------------------------------------
	
}//Controller
