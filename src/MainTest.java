import org.junit.Test;

public class MainTest extends CoreTestCase
{
    @Test
    public void myFirstTest() {
        System.out.println("First test Before change static " + MathHelper.static_int);
        MathHelper.static_int = 3;

        MathHelper mathObject = new MathHelper();
        System.out.println("First test before change simple " + mathObject.simple_int);
        mathObject.simple_int = 4;
    }

    @Test
    public void mySecondTest() {
        System.out.println("Second test Before change static " + MathHelper.static_int);
        MathHelper.static_int = 5;

        MathHelper mathObject = new MathHelper();
        System.out.println("Second test before change simple " + mathObject.simple_int);
        mathObject.simple_int = 6;
    }

}
