/*
 * Copyright (c) 2023. Programacion Orientada al Objeto, DISC, UCN.
 */

package cl.ucn.disc.poo.mandiosoft.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The Funcionario class.
 *
 * @author Programacion Orientada al Objeto
 */
public abstract class Funcionario {

    /**
     * RUT.
     */
    private final String rut;

    /**
     * Nombre.
     */
    private final String nombre;

    /**
     * Direccion.
     */
    private final String direccion;

    /**
     * Sueldo base.
     */
    private final double sueldoBase;

    /**
     * Proyectos.
     */
    private final List<Proyecto> proyectos;

    /**
     * The Constructor.
     *
     * @param rut
     * @param nombre
     * @param direccion
     * @param sueldoBase
     */
    public Funcionario(String rut, String nombre, String direccion, double sueldoBase) {
        this.proyectos = new ArrayList<>();

        // TODO: add validations
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;

        // validacion de sueldo
        if (sueldoBase <= 0) {
            throw new IllegalArgumentException("El Sueldo debe ser positivo");
        }
        this.sueldoBase = sueldoBase;
    }

    /**
     * @return the rut.
     */
    public String getRut() {
        return this.rut;
    }

    /**
     * @return the nombre.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @return the direccion.
     */
    public String getDireccion() {
        return this.direccion;
    }

    /**
     * @return the sueldo base.
     */
    public double getSueldoBase() {
        return this.sueldoBase;
    }

    /**
     * @return the sueldo liquido.
     */
    public abstract double getSueldo();

    /**
     * Get Proyecto.
     *
     * @return the Proyecto.
     */
    public Proyecto getProyecto(final String codigo) {
        // can't add repeteated proyecto
        for (Proyecto p : this.proyectos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        // not found
        return null;
    }

    /**
     * Add the Proyecto.
     *
     * @param proyecto to add.
     */
    public void addProyecto(final Proyecto proyecto) {
        // not null!
        if (proyecto == null) {
            throw new IllegalArgumentException("Proyecto no puede ser null");
        }

        // can't add repeteated proyecto
        if (this.getProyecto(proyecto.getCodigo()) != null) {
            throw new IllegalArgumentException("Funcionario ya se encuentra en Proyecto");
        }

        // validation of number of Proyectos
        if (this.getNumeroDeProyectos() == 5) {
            throw new IllegalArgumentException("Funcionario ya tiene 5 proyectos");
        }

        // add the proyecto
        this.proyectos.add(proyecto);
    }

    /**
     * @return el numero de proyectos en que trabaja el Funcionario.
     */
    public int getNumeroDeProyectos() {
        return this.proyectos.size();
    }

}
