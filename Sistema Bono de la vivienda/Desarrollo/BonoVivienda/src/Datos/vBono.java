package Datos;

public class vBono {
    private int idBono;
    private int idUsuario;
    private int edad;
    private String estLaboral;
    private String tieneVivienda;
    private Double ingresos;
    private Double egresos;
    private String estado;        

    public vBono(int idBono, int idUsuario, int edad, String estLaboral, String tieneVivienda, Double ingresos, Double egresos, String estado) {
        this.idBono = idBono;
        this.idUsuario = idUsuario;
        this.edad = edad;
        this.estLaboral = estLaboral;
        this.tieneVivienda = tieneVivienda;
        this.ingresos = ingresos;
        this.egresos = egresos;
        this.estado = estado;
    }

    public vBono() {
    }

    public int getIdBono() {
        return idBono;
    }

    public void setIdBono(int idBono) {
        this.idBono = idBono;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstLaboral() {
        return estLaboral;
    }

    public void setEstLaboral(String estLaboral) {
        this.estLaboral = estLaboral;
    }

    public String getTieneVivienda() {
        return tieneVivienda;
    }

    public void setTieneVivienda(String tieneVivienda) {
        this.tieneVivienda = tieneVivienda;
    }

    public Double getIngresos() {
        return ingresos;
    }

    public void setIngresos(Double ingresos) {
        this.ingresos = ingresos;
    }

    public Double getEgresos() {
        return egresos;
    }

    public void setEgresos(Double egresos) {
        this.egresos = egresos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }    

    private String Fecha;
    
    public String getFecha() {
        return Fecha;
    }    
}
