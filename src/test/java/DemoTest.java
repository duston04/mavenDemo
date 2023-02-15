import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DemoTest {

    @Test
    public void test1(){
        System.out.println("This is test1");
    }

    @Before
    public void bef(){
        System.out.println("Before");
    }

    @After
    public void af(){
        System.out.println("After");
    }

    @Test
    public void test2(){
        System.out.println("This is test2");
    }
}
