package schoolproject;


import junit.framework.*;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        int t1, t2;
        t1=App.max(10, 2);
        t2=App.max(2, 10);
        System.out.println(t1 + t2);
    	assertEquals(App.max(4, 5),App.max(5, 4));
    }
}
