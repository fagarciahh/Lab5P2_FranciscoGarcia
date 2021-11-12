package lab5p2_franciscogarcia;

import java.util.ArrayList;

public class Comprador extends Usuario{
    
    private ArrayList <Juego> juegos = new ArrayList();
    private int dinero;
    private CuentaBancaria cuentaBancaria;
    private String pFavorito;

    public Comprador() {
        super();
    }

    public Comprador(int dinero, CuentaBancaria cuentaBancaria, String pFavorito, String nombre, String usuario, String contraseña, int edad) throws Exception {
        super(nombre, usuario, contraseña, edad);
        this.dinero = dinero;
        this.cuentaBancaria = cuentaBancaria;
        this.pFavorito = pFavorito;
    }

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList<Juego> juegos) {
        this.juegos = juegos;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getpFavorito() {
        return pFavorito;
    }

    public void setpFavorito(String pFavorito) {
        this.pFavorito = pFavorito;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getUsuario() {
        return usuario;
    }

    @Override
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String getContraseña() {
        return contraseña;
    }

    @Override
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
