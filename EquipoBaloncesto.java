import java.util.ArrayList;

public class EquipoBaloncesto
{
    private ArrayList<JugadorBaloncesto> jugadores;
    
    public EquipoBaloncesto(){
        jugadores = new ArrayList<JugadorBaloncesto>();
    }
    
    public void añadirJugador(String nombre, int altura, String nacimiento, boolean jugadorNba, int id){ 
        JugadorBaloncesto nuevoJugador = new JugadorBaloncesto (nombre, altura, nacimiento, jugadorNba, id);        
        jugadores.add(nuevoJugador);
    }
    
    public String getListadoJugadores(){
        String listaADevolver = "";
        for (JugadorBaloncesto jugador : jugadores){
            listaADevolver += jugador.getCaracteristicas() + "\n";
        }
        return listaADevolver;
    }
}