package lab5p2_franciscogarcia;

import java.util.ArrayList;

public class Vendedor extends Usuario{
    
    private float estrellas;
    private String pFavorito;
    private int dineroRecibido;
    private ArrayList <Juego> venta = new ArrayList();
    private ArrayList <Juego> vendidos = new ArrayList();
    private CuentaBancaria cuentaBancaria;

    public Vendedor() {
        super();
    }


    public Vendedor(float estrellas, String pFavorito, int dineroRecibido, CuentaBancaria cuentaBancaria, String nombre, String usuario, String contraseña, int edad) throws Exception {
        super(nombre, usuario, contraseña, edad);
        this.estrellas = estrellas;
        this.pFavorito = pFavorito;
        this.dineroRecibido = dineroRecibido;
        this.cuentaBancaria = cuentaBancaria;
    }
    

    public float getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(float estrellas) {
        this.estrellas = estrellas;
    }

    public String getpFavorito() {
        return pFavorito;
    }

    public void setpFavorito(String pFavorito) {
        this.pFavorito = pFavorito;
    }

    public float getDineroRecibido() {
        return dineroRecibido;
    }

    public void setDineroRecibido(int dineroRecibido) {
        this.dineroRecibido = dineroRecibido;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public ArrayList<Juego> getVenta() {
        return venta;
    }

    public void setVenta(ArrayList<Juego> venta) {
        this.venta = venta;
    }

    public ArrayList<Juego> getVendidos() {
        return vendidos;
    }

    public void setVendidos(ArrayList<Juego> vendidos) {
        this.vendidos = vendidos;
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
