package logicaNegocio;

public class Perro extends Animal implements Domestico{
   // TODO: Aquí va tu código
    public Perro(String nombre, String sonido, String comida, TipoHabitat habitat) {
        super(nombre, sonido, comida);
        habitat = TipoHabitat.TERRESTRE;
    }
    
    @Override
    public String emitirSonido() {
        String sonido = "Ladrido";
        return sonido;
    }

    @Override
    public String obtenerDieta() {
        String dieta = "Omnívoro";
        return dieta;
    }

    @Override
    public String interactuarConHumano() {
        String interaccion = "El perro mueve la cola y  ladra de felicidad";
        return interaccion;
    }

    
    
    
}
