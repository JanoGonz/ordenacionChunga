import java.time.LocalDate;

public class JugadorBaloncesto
{
    private String nombreJugador;
    private int alturaJugador;
    private LocalDate fechaNacimiento;
    private boolean juegaNba;
    private int idJugador;

    public JugadorBaloncesto(String nombre, int altura, String nacimiento, boolean jugadorNba, int idJugador){
        nombreJugador = nombre;
        alturaJugador = altura;
        fechaNacimiento = LocalDate.parse(nacimiento);
        juegaNba = jugadorNba;
    }

    public String getNombreJugador(){
        return nombreJugador;
    }

    public int getAlturaJugador(){
        return alturaJugador;
    }

    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }

    public String getJuegaNba(){
        String cadenaADevolver = "";
        if (juegaNba){
            cadenaADevolver = "Sí juega en la NBA";
        }
        else{
            cadenaADevolver = "No juega en la NBA";
        }
        return cadenaADevolver;
    }

    public void setNombre(String nombre){
        nombreJugador = nombre;
    }

    public void setAlturaJugador(int altura){
        alturaJugador = altura;
    }

    public void setFechaNacimiento(String nacimiento){
        fechaNacimiento = LocalDate.parse(nacimiento);
    }

    public void setJuegaNba(boolean jugadorNba){
        juegaNba = jugadorNba;
    }

    public String getCaracteristicas(){
        String caracteristicasADevolver = getNombreJugador() + " " +
            getAlturaJugador() + " " +
            getFechaNacimiento() + " " +
            getJuegaNba() + " " + idJugador;
        return caracteristicasADevolver;
    }
}
