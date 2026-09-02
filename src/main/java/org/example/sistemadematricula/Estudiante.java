package org.example.sistemadematricula;

import java.time.LocalDate;

public class Estudiante {

    private String nombreCompleto;
    private String departamento;
    private String curso;
    private String modalidad;
    private String horario;
    private LocalDate fechaNacimiento;

    public Estudiante(
            String nombreCompleto,
            String departamento,
            String curso,
            String modalidad,
            String horario,
            LocalDate fechaNacimiento
    ) {

        this.nombreCompleto = nombreCompleto;
        this.departamento = departamento;
        this.curso = curso;
        this.modalidad = modalidad;
        this.horario = horario;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getCurso() {
        return curso;
    }

    public String getModalidad() {
        return modalidad;
    }

    public String getHorario() {
        return horario;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}