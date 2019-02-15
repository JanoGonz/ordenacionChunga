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
        ArrayList<JugadorBaloncesto> jugadoresOrdenados = new ArrayList<JugadorBaloncesto>(jugadores);	
        int contadorLento = 0;
        while(contadorLento < jugadoresOrdenados.size()){
            JugadorBaloncesto jugadorMenor = jugadoresOrdenados.get(contadorLento);
            int posicionMenor = contadorLento;
            int contadorRapido = contadorLento + 1;
            while(contadorRapido < jugadoresOrdenados.size()){
                if(jugadoresOrdenados.get(contadorRapido).getFechaNacimiento().isBefore(jugadorMenor.getFechaNacimiento())){
                    jugadorMenor = jugadoresOrdenados.get(contadorRapido);
                    posicionMenor = contadorRapido;
                }
                contadorRapido++;
            }
            JugadorBaloncesto jugadorIntermedio = jugadoresOrdenados.get(contadorLento);
            jugadoresOrdenados.set(contadorLento, jugadorMenor);
            jugadoresOrdenados.set(posicionMenor, jugadorIntermedio);
            contadorLento++;
        }

        for (JugadorBaloncesto jugador : jugadoresOrdenados) {
            listaJugadoresOrdenada += jugador.getCaracteristicas() + "\n";
        }

        return listaJugadoresOrdenada;
    }
    
    
}