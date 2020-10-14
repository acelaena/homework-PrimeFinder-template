import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

/**
 * Tests for the {@link HomeworkName} class.
 *
 * @author CS 212 Software Development
 * @author University of San Francisco
 * @version Fall 2020
 */
@TestMethodOrder(Alphanumeric.class)
public class HomeworkNameTest {

  /**
   * Placeholder.
   */
  @Nested
	public class A_Tests {
    /**
     * Placeholder.
     */
    @Test
    public void test() {
      Assertions.fail("Placeholder.");
    }
  }

  /**
   * Placeholder.
   */
  @Nested
	public class B_Tests {
    /**
     * Placeholder.
     */
    @Test
    public void test1() {
      Assertions.fail("Placeholder.");
    }

    /**
     * Placeholder.
     */
    @Test
    public void test2() {
      Assertions.assertNull(null, "Placeholder.");
    }
  }

}
