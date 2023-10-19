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
     * Constante: sueldo minimo.
     */
    private static final int SUELDO_MINIMO = 420 * 1000;

    /**
     * Constante: numero maximo de proyectos.
     */
    private static final int NUMERO_MAXIMO_PROYECTOS = 5;

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
        // creacion de la lista de proyectos
        this.proyectos = new ArrayList<>();

        // TODO: add validations
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;

        // validacion de sueldo
        if (sueldoBase < SUELDO_MINIMO) {
            throw new IllegalArgumentException("El sueldo base no puede ser menor al sueldo minimo por ley");
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

        // validate the five rule
        if (this.proyectos.size() == NUMERO_MAXIMO_PROYECTOS) {
            throw new IllegalArgumentException("No se permite trabajar en mas de cinco proyectos");
        }

        // add the proyecto
        this.proyectos.add(proyecto);
    }

    /**
     * @return the list of Proyecto.
     */
    public List<Proyecto> getProyectos() {
        return this.proyectos;
    }
}
