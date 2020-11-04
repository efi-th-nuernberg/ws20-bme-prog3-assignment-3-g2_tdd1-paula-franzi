import org.junit.Test;
import static org.junit.Assert.*;

class MainTest {
  public static void main(String[] args) {
    
  }

  @test
  public void testNothing() {}

  @test
  public void testSomeStuff(){
    
    assertTrue(2 + 3 == 5);

    String s = new String;
    assertNotNull(s);

    assertTrue((3*7)>(4*5));
  }
}