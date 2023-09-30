import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	private GradeBook obj1;
	private GradeBook obj2;
	
	@BeforeEach
	void setUp() throws Exception {
		obj1 = new GradeBook(5);
		obj2 = new GradeBook(5);
		
		obj1.addScore(3.47);
		obj1.addScore(9.62);
		
		obj2.addScore(11.77);
		obj2.addScore(4.02);
	}

	@AfterEach
	void tearDown() throws Exception {
		obj1 = null;
		obj2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(obj1.toString().contains("3.47"));
        assertTrue(obj1.toString().contains("9.62"));
        assertEquals(2, obj1.getScoreSize());
        
        assertTrue(obj2.toString().contains("11.77"));
        assertTrue(obj2.toString().contains("4.02"));
        assertEquals(2, obj2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(13.09, obj1.sum(), 0.01);
        assertEquals(15.79, obj2.sum(), 0.01);
	}

	@Test
	void testMinimum() {
		assertEquals(3.47, obj1.minimum(), 0.01);
        assertEquals(4.02, obj2.minimum(), 0.01);
	}

	@Test
	void testFinalScore() {
		assertEquals(9.62, obj1.finalScore(), 0.01);
        assertEquals(11.75, obj2.finalScore(), 0.01);
	}

	@Test
	void testGetScoreSize() {
		assertEquals(2, obj1.getScoreSize());
        assertEquals(2, obj2.getScoreSize());
	}

	@Test
	void testToString() {
		assertEquals("3.47 9.62 ", obj1.toString());
        assertEquals("11.77 4.02 ", obj2.toString());
	}

}
