import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class Test {
    private Figures figure;

    @Before
    public void setUp(){
        figure=new Figures();
    }

    @After
    public void tearDown(){
        figure = null;
    }

    @org.junit.Test
    public void testRectang(){
        double result = figure.rectangleArea(2,5);
        assertEquals(10,result,0);
    }
    @org.junit.Test
    public void testSquare(){
        double result = figure.squareArea(2);
        assertEquals(4,result,0);
    }
    @org.junit.Test
    public void testTriangle(){
        double result = figure.triangleArea(5,20);
        assertEquals(50,result,0);
    }
    @org.junit.Test
    public void testDiamond(){
        double result = figure.diamondArea(10,10);
        assertEquals(50,result,0);
    }
}
