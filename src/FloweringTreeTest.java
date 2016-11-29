import static org.junit.Assert.*;

import org.junit.Test;

public class FloweringTreeTest {

	@Test
	public void test() {
		FloweringTree tree = new FranklinTree(0,0,1,1);
		assertTrue(tree.toString().equals("Test Tree"));
		tree.setName("Tree Test");
		assertTrue(tree.toString().equals("Tree Test"));
		assertFalse(tree.isFlowering(0, 5));
		assertTrue(tree.getInTotalHours(1, 1) == 25);
		
	}

}
