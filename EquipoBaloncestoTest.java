import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class EquipoBaloncestoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EquipoBaloncestoTest
{
    /**
     * Default constructor for test class EquipoBaloncestoTest
     */
    public EquipoBaloncestoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void caracteristicas()
    {
        EquipoBaloncesto equipoBa2 = new EquipoBaloncesto();
        equipoBa2.añadirJugador("LeBron", 206, "1987-09-12", true, 1);
        EquipoBaloncesto equipoBa3 = new EquipoBaloncesto();
        equipoBa3.añadirJugador("Kyrie", 193, "1990-04-21", true, 2);
        EquipoBaloncesto equipoBa4 = new EquipoBaloncesto();
        equipoBa4.añadirJugador("Llul", 190, "1988-02-03", false, 3);
    }

    @Test
    public void ListadoJugadores()
    {
        EquipoBaloncesto equipoBa2 = new EquipoBaloncesto();
        equipoBa2.añadirJugador("LeBron", 206, "1988-04-24", true, 4);
        equipoBa2.añadirJugador("Giannis", 213, "1990-12-08", true, 5);
        assertEquals("LeBron 206 1988-04-24 Sí juega en la NBA 4\nGiannis 213 1990-12-08 Sí juega en la NBA 5\n", equipoBa2.getListadoJugadores());
    }
}

