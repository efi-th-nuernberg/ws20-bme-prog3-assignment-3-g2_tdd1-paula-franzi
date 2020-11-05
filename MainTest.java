import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void testNothing() {
  }

  @Test
  public void testSomeStuff() {

    assertTrue("FIRST ASSERTION FAILED", 2 + 3 == 5);

    String s = new String();

    assertNotNull("SECOND ASSERTION FAILED", s);

    assertTrue("THIRD ASSERTION FAILED", (3 * 7) > (4 * 5));

  }

}