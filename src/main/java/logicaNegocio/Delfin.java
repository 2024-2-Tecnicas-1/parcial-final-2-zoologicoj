package logicaNegocio;

public class Delfin extends Animal{
    // TODO: Aquí va tu código
    public Delfin(String nombre, String sonido, String comida, TipoHabitat habitat) {
        super(nombre, sonido, comida);
        habitat = TipoHabitat.ACUATICO;
    }

    @Override
    public String emitirSonido() {
       String sonidoDelfin = "Chirrido";
       return sonidoDelfin;
    }

    @Override
    public String obtenerDieta() {
       String dietaDelfin = "Pescado";
       return dietaDelfin;
    }
    
}
