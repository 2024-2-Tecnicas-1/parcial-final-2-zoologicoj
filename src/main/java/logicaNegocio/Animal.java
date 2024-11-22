package logicaNegocio;

public abstract class Animal {
    // TODO: Aquí va tu código
    private String nombre;
    private String sonido;
    private String comida;
    private TipoHabitat habitat;

    public Animal(String nombre, String sonido, String comida) {
        this.nombre = nombre;
        this.sonido = sonido;
        this.comida = comida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public TipoHabitat getHabitat() {
        return habitat;
    }

    public void setHabitat(TipoHabitat habitat) {
        this.habitat = habitat;
    }
    
    public abstract String emitirSonido();
    
    public abstract String obtenerDieta();
    
    
    
}