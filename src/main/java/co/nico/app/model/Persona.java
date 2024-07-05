/**
 * @author Nicolas Camacho Lesmes
 * ANALISIS Y DESARROLLO DE SOFTWARE FICHA 2721538
 */

package co.nico.app.model;


public class Persona {

    private int id_persona;
	private String ciudad;
	private String correo_electronico;
	private String direccion;
	private String identificacion;
	private String nombre;
	private String telefono;

    public Persona(int id_persona, String ciudad, String correo_elecronico, String direccion, String identificacion, String nombre, String telefono ){
        this.id_persona = id_persona;
        this.ciudad = ciudad;
        this.correo_electronico = correo_elecronico;
        this.direccion = direccion;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
