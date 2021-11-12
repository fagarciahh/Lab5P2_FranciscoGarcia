package lab5p2_franciscogarcia;

public class Juego {
    private String nombre;
    private int año;
    private int cantidad;
    private int precio;

    public Juego() {
    }

    public Juego(String nombre, int año, int cantidad, int precio) {
        this.nombre = nombre;
        this.año = año;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
