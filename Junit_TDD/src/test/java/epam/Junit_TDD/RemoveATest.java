package epam.Junit_TDD;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

class RemoveATest {

	/*Todo list
	 * 1. "ABCD" => "BCD"
	 * 2. "AACD" => "CD"
	 * 3. "BACD" => "BCD"
	 * 4. "BBAA" => "BBAA"
	 * 5. "AABAA" => "BAA"
	 */
	
	RemoveA remove;
	
	@BeforeEach
	void setUp(){
		remove = new RemoveA();
	}
	
	@Test
	void testFirstA() {
		assertEquals("BCD", remove.removeA("ABCD"));
	}
	
	@Test
	void testFirst2As() {
		assertEquals("CD", remove.removeA("AACD"));
	}
	@Test
	void test2ndA() {
		assertEquals("BCD", remove.removeA("BACD"));
	}
	@Test
	void testNoAs() {
		assertEquals("BBAA", remove.removeA("BBAA"));
	}
	@Test
	void test2As() {
		assertEquals("BAA", remove.removeA("AABAA"));
	}

}
