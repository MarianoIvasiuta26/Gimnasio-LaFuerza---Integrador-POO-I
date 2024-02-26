package edu.unam.lafuerzagymapp.modelo;

import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idCliente;
    @Basic
    private String nombre;
    @Basic
    private String apellido;
    
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Basic
    private String sexo;
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    
    @OneToMany(mappedBy = "cliente")
    private Set<EntrenamientoCliente> entrenamientosClientes;
    
    public Cliente() {
    }

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Cliente(int idCliente, String nombre, String apellido, Date fechaNacimiento, String sexo, Date fechaIngreso) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.fechaIngreso = fechaIngreso;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
