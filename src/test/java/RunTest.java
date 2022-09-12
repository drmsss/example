import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RunTest {

    @Before
    public void beforeClass() {
        System.out.println("Before class");
    }

    @After
    public void afterClass() {
        System.out.println("After class");
    }

    @Test
    public void Test1() {
        System.out.println("1");
        assertEquals("AW", "AW");
    }

    @Test
    public void Test2() {
        System.out.println("2");
        assertEquals("AW", "A@W");
    }

    @Test
    public void Test3() {
        System.out.println("3");
        assertTrue("Ошибка, condition не true", 1>2);
    }
}
