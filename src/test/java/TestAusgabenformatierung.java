import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class TestAusgabenformatierung {

    private PrintStream originalOut;
    private ByteArrayOutputStream bos;

    @Before
    public void InitPrintStream(){
        //bind the system
        originalOut = System.out;
        bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
    }

    @After
    public void EndPrintStream(){
        // undo the binding in System
        System.setOut(originalOut);
    }

    /**
     * Helpermethod to check outputs
     * @param check, string to check
     */
    private void CheckTestData(String check) {
        try {
            assertTrue(bos.toString().contains(check));
        } catch (Throwable t) {
            //print exact program
            assertEquals(check,bos.toString());
        }
    }

    @Test
    public void testAufgabe1()
    {

        // action
        Ausgabenformatierung.aufgabe1();

        // assertion
        assertTrue(bos.toString().startsWith("   **   "));
        CheckTestData("*      *");

    }

    @Test
    public void testAufgabe2()
    {

        // action
        Ausgabenformatierung.aufgabe2();

        // assertion
        CheckTestData("0!   =                   =   1");
        CheckTestData("1!   = 1                 =   1");
        CheckTestData("2!   = 1 * 2             =   2");
        CheckTestData("3!   = 1 * 2 * 3         =   6");
        CheckTestData("4!   = 1 * 2 * 3 * 4     =  24");
        CheckTestData("5!   = 1 * 2 * 3 * 4 * 5 = 120");

    }

    @Test
    public void testAufgabe3Head()
    {

        // action
        Ausgabenformatierung.aufgabe3();

        // assertion
        CheckTestData("Fahrenheit  |   Celsius");
        CheckTestData("-----------------");

    }

    @Test
    public void testAufgabe3Neg()
    {

        // action
        Ausgabenformatierung.aufgabe3();

        // assertion
        //CheckTestData("-----------------------");
        CheckTestData("-20         |    -28.89");
        CheckTestData("-10         |    -23.33");

    }

    @Test
    public void testAufgabe3Pos()
    {

        // action
        Ausgabenformatierung.aufgabe3();

        // assertion
        CheckTestData("+0          |    -17.78");
        CheckTestData("+20         |     -6.67");
        CheckTestData("+30         |     -1.11");

    }
}
