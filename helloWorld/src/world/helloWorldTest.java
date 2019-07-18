package world;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class helloWorldTest {

	@Test
	void test() {
		helloWorld out = new helloWorld();
		String output =out.getMessage();
		assertEquals("helloWorld",output);
	}

}
