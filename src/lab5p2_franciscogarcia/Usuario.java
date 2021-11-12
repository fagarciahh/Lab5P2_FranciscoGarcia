package lab5p2_franciscogarcia;

public class Usuario {
    
    protected String nombre;
    protected String usuario;
    protected String contraseña;
    protected int edad;

    public Usuario() {
    }

    public Usuario(String nombre, String usuario, String contraseña, int edad) throws Exception{
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception{
        if(edad < 1){
            throw new Exception("Edad no valida");
        }
        this.edad = edad;
    }
    
    
}
