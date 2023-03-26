import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {
	
	private BinarySearchTree<String, String, String> tree = new BinarySearchTree<String, String, String>();

	@Test
	void testInsert() {
		
		tree.insert("house", "casa", "loger");
        tree.insert("dog", "perro", "chien");
        tree.insert("homework", "tarea", "devoirs");

        assertEquals("casa", tree.search("house").getValue1());
        assertEquals("loger", tree.search("house").getValue2());

        assertEquals("perro", tree.search("dog").getValue1());
        assertEquals("chien", tree.search("dog").getValue2());

        assertEquals("tarea", tree.search("homework").getValue1());
        assertEquals("devoirs", tree.search("homework").getValue2());
        
        assertNull(tree.search("food"));
		
	}

	@Test
	void testSearch() {
		
		tree.insert("house", "casa", "loger");
        tree.insert("dog", "perro", "chien");
        tree.insert("homework", "tarea", "devoirs");

        assertEquals("casa", tree.search("house").getValue1());
        assertEquals("loger", tree.search("house").getValue2());

        assertEquals("perro", tree.search("dog").getValue1());
        assertEquals("chien", tree.search("dog").getValue2());

        assertEquals("tarea", tree.search("homework").getValue1());
        assertEquals("devoirs", tree.search("homework").getValue2());

        assertNull(tree.search("woman"));
		
	}

}
