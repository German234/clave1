package com.parcialfinal.tareasimple;

import java.time.LocalDate;

public class TareaSimple {

    private int tareaID;
    private String titulo;
    private String descripcion;
    private LocalDate fechaTarea;
    private String estado;
    private String nivelPrioridad;

    public TareaSimple() {}

    public TareaSimple(int tareaID, String titulo, String descripcion,
                       LocalDate fechaTarea, String estado, String nivelPrioridad) {
        this.tareaID = tareaID;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaTarea = fechaTarea;
        this.estado = estado;
        this.nivelPrioridad = nivelPrioridad;
    }

    public int getTareaID() {
        return tareaID;
    }

    public void setTareaID(int tareaID) {
        this.tareaID = tareaID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaTarea() {
        return fechaTarea;
    }

    public void setFechaTarea(LocalDate fechaTarea) {
        this.fechaTarea = fechaTarea;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNivelPrioridad() {
        return nivelPrioridad;
    }

    public void setNivelPrioridad(String nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }
}