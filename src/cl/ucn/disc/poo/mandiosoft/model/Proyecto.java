/*
 * Copyright (c) 2023. Programacion Orientada al Objeto, DISC, UCN.
 */

package cl.ucn.disc.poo.mandiosoft.model;

/**
 * Clase proyecto.
 *
 * @author Programacion Orientada al Objeto.
 */
public final class Proyecto {

    /**
     * Codigo.
     */
    private final String codigo;

    /**
     * Nombre.
     */
    private final String nombre;

    /**
     * Duracion (en meses).
     */
    private final int duracionMeses;

    /**
     * Costo total del Proyecto.
     */
    private final double costoTotal;

    /**
     * El Ingeniero del Proyecto.
     */
    private Ingeniero ingeniero;

    /**
     * The Constructor.
     *
     * @param codigo
     * @param nombre
     * @param duracionMeses
     * @param costoTotal
     */
    public Proyecto(String codigo, String nombre, int duracionMeses, double costoTotal) {
        // TODO: add validations
        this.codigo = codigo;
        this.nombre = nombre;
        // validacion de numero de meses minimo
        if (duracionMeses < 1) {
            throw new IllegalArgumentException("La duracion minima de un proyecto no puede ser inferior a 1 mes");
        } else {
            this.duracionMeses = duracionMeses;
        }
        // validar costo
        if (costoTotal <= 0) {
            throw new IllegalArgumentException("El costo total no puede ser menor a 0");
        } else {
            this.costoTotal = costoTotal;
        }
    }

    /**
     * @return the codigo.
     */
    public String getCodigo() {
        return this.codigo;
    }

    /**
     * @return the nombre.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @return the duracion en meses.
     */
    public int getDuracionMeses() {
        return this.duracionMeses;
    }

    /**
     * @return the costo total.
     */
    public double getCostoTotal() {
        return this.costoTotal;
    }

    /**
     * @return el costo mensual.
     */
    public double getCostoMensual() {
        return this.costoTotal / this.duracionMeses;
    }

    /**
     * @return the Ingeniero.
     */
    public Ingeniero getIngeniero() {
        return this.ingeniero;
    }

    /**
     * Asigna un Ingeniero al proyecto.
     *
     * @param ingeniero a asignar.
     */
    public void setIngeniero(Ingeniero ingeniero) {
        // validacion de existencia del Ingeniero.
        if (ingeniero == null) {
            throw new IllegalArgumentException("No se permite un Proyecto sin Ingeniero");
        }
        this.ingeniero = ingeniero;
    }

}
