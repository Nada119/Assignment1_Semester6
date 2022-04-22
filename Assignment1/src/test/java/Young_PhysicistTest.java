import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Young_PhysicistTest {
    @Test
    void Test1()
    {
        int [] x = {4,-2,1};
        int [] y = {1,4,-5};
        int [] z = {7,-1,-3};
        var Young_Physicist1 = new Young_Physicist();
        assertEquals( "No", Young_Physicist1.Func(3,x,y,z));
    }
    @Test
    void Test2()
    {
        int [] x = {3,-5,2};
        int [] y = {-1,2,-1};
        int [] z = {7,-4,-3};
        var Young_Physicist1 = new Young_Physicist();
        assertEquals( "Yes", Young_Physicist1.Func(3,x,y,z));
    }
    @Test
    void Test3()
    {
        int [] x = {-100,100};
        int [] y = {100,-100};
        int [] z = {1,-1};
        var Young_Physicist1 = new Young_Physicist();
        assertEquals( "Yes", Young_Physicist1.Func(2,x,y,z));
    }
    @Test
    void Test4()
    {
        int [] x = {0};
        int [] y = {0};
        int [] z = {0};
        var Young_Physicist1 = new Young_Physicist();
        assertEquals( "Yes", Young_Physicist1.Func(1,x,y,z));
    }
    @Test
    void Test5()
    {
        int [] x = {3,-5,2};
        int [] y = {-1,2,-1};
        int [] z = {7,-4,-3};
        var Young_Physicist1 = new Young_Physicist();
        assertEquals( "N is out of the boundary", Young_Physicist1.Func(0,x,y,z));
    }
    @Test
    void Test6()
    {
        int [] x = {105,-200,2};
        int [] y = {-300,300,0};
        int [] z = {7,-4,-3};
        var Young_Physicist1 = new Young_Physicist();
        assertEquals( "The Coordinates are out of the boundary", Young_Physicist1.Func(3,x,y,z));
    }
}
