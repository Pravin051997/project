package factorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class factorialTest {

	@Test
	void test() {
		factorial fact =new factorial();
		int out = fact.CalculateFactorial(5);
		assertEquals(120,out);
	}
	}


