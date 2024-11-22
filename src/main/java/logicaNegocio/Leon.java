package logicaNegocio;

public class Leon extends Animal{
    // TODO: Aquí va tu código
    public Leon(String nombre, String sonido, String comida, TipoHabitat habitat) {
        super(nombre, sonido, comida);
        habitat = TipoHabitat.TERRESTRE; 
    }

    @Override
    public String emitirSonido() {
        String sonido = "Rugido";
       return sonido;
    }
    @Override
    public String obtenerDieta() {
       String dieta = "Carnívoro";
       return dieta;
    }
    
}
