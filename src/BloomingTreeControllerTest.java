import static org.junit.Assert.*;

import org.junit.Test;

public class BloomingTreeControllerTest {

	@Test
	public void test() {		
		BloomingTreeController c = new BloomingTreeController();
		//
		FloweringTree t = new FloweringTree(0, 7, 0, 23, "Big Old Blooming Tree");
		FloweringTree t2 = new FloweringTree(6, 7, 12, 19, "Neverbloomin Birch");
		FloweringTree t3 = new FloweringTree(0, 3, 0, 10, "Maple Birch Tree");
		FloweringTree t4 = new FloweringTree(2, 4, 12, 21, "Smol Tree");
		FloweringTree t5 = new FloweringTree(3, 7, 1, 16, "Trei Tree");
		//
		c.addFloweringTreeType(0, 7, 0, 23, "Big Old Blooming Tree");
		c.addFloweringTreeType(6, 7, 12, 19, "Neverbloomin Birch");
		c.addFloweringTreeType(0, 3, 0, 10, "Maple Birch Tree");
		c.addFloweringTreeType(2, 4, 12, 21, "Smol Tree");
		c.addFloweringTreeType(3, 7, 1, 16, "Trei Tree");
		//
		String[] test1 = {"Big Old Blooming Tree","Maple Birch Tree"};
		String[] test2 = {"Big Old Blooming Tree","Trei Tree"};
		String[] test3 = {"Big Old Blooming Tree","Smol Tree","Trei Tree"};
		String[] test4 = {"Big Old Blooming Tree"};
		String[] test5 = {"Big Old Blooming Tree","Maple Birch Tree"};
		assertEquals(c.listofIsBlooming(0, 0).toArray(),test1);
		assertEquals(c.listofIsBlooming(5, 14).toArray(),(test2));
		assertEquals(c.listofIsBlooming(3, 17).toArray(),(test3));
		assertEquals(c.listofIsBlooming(7, 23).toArray(),(test4));
		assertEquals(c.listofIsBlooming(1, 3).toArray(),(test5));
	}

}
