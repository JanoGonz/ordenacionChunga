

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
    public void añadirJugadores()
    {
        EquipoBaloncesto equipoBa1 = new EquipoBaloncesto();
        equipoBa1.añadirJugador("LeBron", 206, "1989-09-12", true);
        equipoBa1.añadirJugador("Kyrie", 198, "1990-01-26", true);
    }

    @Test
    public void getListadoJugadores()
    {
        EquipoBaloncesto equipoBa1 = new EquipoBaloncesto();
        equipoBa1.añadirJugador("LeBron", 206, "1989-09-12", true);
        equipoBa1.añadirJugador("Kyrie", 198, "1990-01-26", true);
        assertEquals("LeBron 206 1989-09-12 Sí juega en la NBA 0\nKyrie 198 1990-01-26 Sí juega en la NBA 0\n", equipoBa1.getListadoJugadores());
    }

    @Test
    public void getListadoJugadoresEnFuncionDeSuNacimiento()
    {
        EquipoBaloncesto equipoBa2 = new EquipoBaloncesto();
        equipoBa2.añadirJugador("LeBron", 206, "1989-09-12", true);
        equipoBa2.añadirJugador("Giannis", 213, "1994-10-18", true);
        equipoBa2.añadirJugador("Kyrie", 198, "1990-01-26", true);
        assertEquals("LeBron 206 1989-09-12 Sí juega en la NBA 0\nKyrie 198 1990-01-26 Sí juega en la NBA 0\nGiannis 213 1994-10-18 Sí juega en la NBA 0\n", equipoBa2.getListadoJugadoresEnFuncionDeSuNacimiento());
    }
}



