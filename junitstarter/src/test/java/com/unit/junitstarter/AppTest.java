package com.unit.junitstarter;

/**
 * Unit test for simple App.
 */



import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(Lifecycle.PER_CLASS)
class AppTest{
	
	
	@BeforeAll
	static void callAtBeginning() {
		System.out.println("callAtBeginning called...");
	}
	
	
	@AfterAll
	static void callAtEnd() {
		System.out.println("callAtEnd called...");
	}
	
	@BeforeEach
	void callBeforeEachTest() {
		System.out.println("beforeEach called...");
	}
	
	@AfterEach
	void callAfterEachTest() {
		System.out.println("afterEach called...");
	}
	
	
	
	@DisplayName("Test division")
	@Test
	@Disabled
	void testDivideNumbers() {
//		fail("The test just failed...");
		
		int expected = 20;
		
		
		App app = new App();
//		int actual = app.divideNumbers(100, 0);
		
//		assertNotEquals(expected, actual, "Must have been equal");
		
//		assertNotNull(app.getObjectValue());
		
		assertAll(
//				() -> assertEquals(expected, actual),
//				() -> assertEquals(20, actual),
//				() -> assertEquals(30, actual, "Values not equal"),
() -> assertThrows(ArithmeticException.class, () -> assertEquals(2, app.divideNumbers(100, 0)))
				);
	
	}
	
	
	@EnabledOnJre(value = JRE.JAVA_17)
	@DisplayName("Palindrome Test")
	@EnabledOnOs(value = OS.WINDOWS)
	@ParameterizedTest
	@ValueSource(strings = {"madam", "madam", "madam"})
	void testCheckForPalindrome(String value) {
		assertEquals(true, new App().checkForPalindrome(value));
	}
	
	
	
	/* Mocking is a process of developing the objects
	 * that act as the mock or clone of the real objects.
	 * In other words, mocking is a testing technique where
	 * mock objects are used instead of real objects for testing purposes.
	 * Mock objects provide a specific (dummy) output for a particular (dummy)
	 *  input passed to it. 
	 * 1. Stub 2. Fake 3. Mock
	 */
	
	
	@Test
	void testMockGreeting() {
		Greeting ref = mock(Greeting.class);
		
		when(ref.displayGreeting()).thenReturn(Greeting.message);
		
		assertNotEquals("Hey there", ref.displayGreeting());
		
		assertEquals("Hello how are you?", ref.displayGreeting());
		
		verify(ref, times(2)).displayGreeting();
		
		verify(ref, atLeast(1)).displayGreeting();
		
	}
	
}