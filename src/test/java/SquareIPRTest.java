import org.junit.Assert;
import org.junit.Test;

public class SquareIPRTest {

    @Test
    public void TestisPowerOfTwho16() {
        boolean result = SquareIPR.isPowerOfTwo(16);
        org.testng.Assert.assertEquals(result, true);
        System.out.println(" 16: " + "является степенью двойки");
    }

    @Test
    public void TestisPowerOfTwho17() {
        boolean result = SquareIPR.isPowerOfTwo(17);
        org.testng.Assert.assertEquals(result, false);
        System.out.println(" 17: " + "не является степенью двойки");
    }

    @Test
    public void TestisPowerOfTwho18() {
        boolean result = SquareIPR.isPowerOfTwo(18);
        org.testng.Assert.assertEquals(result, true);
        System.out.println(" 18: " + "не является степенью двойки");
    }
    @Test
    public void TestisPowerOfTwhoOne() {
        boolean result = SquareIPR.isPowerOfTwo(1);
        org.testng.Assert.assertEquals(result, true);
        System.out.println(" 1: " + "не является степенью двойки");

    }
    @Test
    public void TestisPowerOfTwhominus4() {
        boolean result = SquareIPR.isPowerOfTwo(-4);
        org.testng.Assert.assertEquals(result, false);
        System.out.println(" -4: " + "не является степенью двойки");

    }
    @Test
    public void TestisPowerOfTwhoZero() {
        boolean result = SquareIPR.isPowerOfTwo(0);
        org.testng.Assert.assertEquals(result, true );
        System.out.println(" 0: " + "не является степенью двойки");
    }
}
