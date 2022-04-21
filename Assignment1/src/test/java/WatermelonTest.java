import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class WatermelonTest {
    @Test
    void input_8_Output_Yes()
    {
        var watermelon1 = new Watermelon();
        assertEquals( "Yes", watermelon1.Func(8));
    }
    @Test
    void input_1_Output_No()
    {
        var watermelon1 = new Watermelon();
        assertEquals( "No", watermelon1.Func(1));
    }
    @Test
    void input_100_Output_No()
    {
        var watermelon1 = new Watermelon();
        assertEquals( "Yes", watermelon1.Func(100));
    }
    @Test
    void input_negative1_Output_No()
    {
        var watermelon1 = new Watermelon();
        assertEquals( "Input is out of the Boundary", watermelon1.Func(-1));
    }
    @Test
    void input_101_Output_No()
    {
        var watermelon1 = new Watermelon();
        assertEquals( "Input is out of the Boundary", watermelon1.Func(101));
    }
}