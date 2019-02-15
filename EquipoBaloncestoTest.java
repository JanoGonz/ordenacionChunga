

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
        equipoBa2.añadirJugador("Pepe", 210, "1991-10-18", true);
        equipoBa2.añadirJugador("Juan", 211, "1993-10-18", true);
        equipoBa2.añadirJugador("Jordan", 212, "1992-10-18", true);
        equipoBa2.añadirJugador("Josue", 213, "1997-10-18", true);
        equipoBa2.añadirJugador("Jack", 214, "1987-10-18", true);
        equipoBa2.añadirJugador("Giannis", 215, "1994-10-18", true);
        equipoBa2.añadirJugador("LeBron", 206, "1989-09-12", true);
        equipoBa2.añadirJugador("Kyrie", 198, "1990-11-26", true);
        assertEquals("Jack 214 1987-10-18 Sí juega en la NBA 0\nLeBron 206 1989-09-12 Sí juega en la NBA 0\nKyrie 198 1990-11-26 Sí juega en la NBA 0\nPepe 210 1991-10-18 Sí juega en la NBA 0\nJordan 212 1992-10-18 Sí juega en la NBA 0\nJuan 211 1993-10-18 Sí juega en la NBA 0\nGiannis 215 1994-10-18 Sí juega en la NBA 0\nJosue 213 1997-10-18 Sí juega en la NBA 0\n", equipoBa2.getListadoJugadoresEnFuncionDeSuNacimiento());
    }
}



