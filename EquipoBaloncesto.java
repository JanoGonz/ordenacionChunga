import java.util.ArrayList;

public class EquipoBaloncesto
{
    private ArrayList<JugadorBaloncesto> jugadores;
    private int idSinAsignar;

    public EquipoBaloncesto(){
        jugadores = new ArrayList<JugadorBaloncesto>();
        idSinAsignar = 0;
    }

    public void añadirJugador(String nombre, int altura, String nacimiento, boolean jugadorNba){ 
        JugadorBaloncesto nuevoJugador = new JugadorBaloncesto (nombre, altura, nacimiento, jugadorNba, idSinAsignar);        
        jugadores.add(nuevoJugador);
        idSinAsignar ++;
    }

    public String getListadoJugadores(){
        String listaADevolver = "";
        if (!jugadores.isEmpty()){
            for (JugadorBaloncesto jugador : jugadores){
                listaADevolver += jugador.getCaracteristicas() + "\n";
            }
        }
        return listaADevolver;
    }

    public String getListadoJugadoresEnFuncionDeSuNacimiento(){
        String listaJugadoresOrdenada = "";
        ArrayList<JugadorBaloncesto> jugadoresOrdenados = new ArrayList<JugadorBaloncesto>();   
        for (JugadorBaloncesto jugador: jugadores) {
            jugadoresOrdenados.add(jugador);
        }
        int contadorLento = 1;
        while(contadorLento < jugadoresOrdenados.size()){
            int contadorRapido = contadorLento -1;
            int posicionMayor = contadorLento;
            while(contadorRapido >= 0 && !jugadoresOrdenados.get(contadorLento).getFechaNacimiento().isAfter(jugadoresOrdenados.get(contadorRapido).getFechaNacimiento())){
                posicionMayor = contadorRapido+1;
                contadorRapido--;
            }
            if(posicionMayor != contadorLento){
                JugadorBaloncesto aux = jugadoresOrdenados.get(contadorLento);
                jugadoresOrdenados.remove(contadorLento);
                jugadoresOrdenados.add(posicionMayor, aux);
                contadorLento++;
            }
        }
        for (JugadorBaloncesto jugador : jugadoresOrdenados) {
            listaJugadoresOrdenada += jugador.getCaracteristicas() + "\n";
        }
        return listaJugadoresOrdenada;
    }

}