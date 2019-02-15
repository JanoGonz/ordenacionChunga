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
            int posicionMayor = 0;
            boolean ordenar = false;
            while(!ordenar && contadorRapido >= 0){
               posicionMayor = 0;
               if(!jugadoresOrdenados.get(contadorLento).getFechaNacimiento().isBefore(jugadoresOrdenados.get(contadorRapido).getFechaNacimiento())){
                    ordenar = true;
                    posicionMayor = contadorRapido+1;
               }
               contadorRapido--;
            }
            JugadorBaloncesto aux = jugadoresOrdenados.get(contadorLento);
            jugadoresOrdenados.remove(contadorLento);
            jugadoresOrdenados.add(posicionMayor, aux);
            contadorLento++;
        }

        for (JugadorBaloncesto jugador : jugadoresOrdenados) {
            listaJugadoresOrdenada += jugador.getCaracteristicas() + "\n";
        }

        return listaJugadoresOrdenada;
    }

}