package lab5p2_franciscogarcia;

public class CuentaBancaria {
    
    private int codigo;
    private int dinero;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int codigo, int dinero) {
        this.codigo = codigo;
        this.dinero = dinero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
    
}
