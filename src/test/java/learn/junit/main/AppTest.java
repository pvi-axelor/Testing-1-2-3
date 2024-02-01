/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package learn.junit.main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

class AppTest {
	
	@BeforeAll
	static void yeeHaww() {
		System.err.println("YeeHaww! BeforeAll!\n");
	}
	
	@AfterAll
	static void soLong() {
		System.err.println("\nSo long! AfterAll!");
	}
	
	@AfterEach
	void nayy() {
		System.err.println("Nayyy!!, AfterEach!\n");
	}
	
	@BeforeEach
	void ayeee() {
		System.err.println("\nAyeee!!, BeforeEach!");
	}
	
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    
    @DisplayName("Test with spaces in it's name!")
    @Test
    public void testWithoutSpacesInItsName() {
        System.out.println("This is a test with custom name!");
    }
}
