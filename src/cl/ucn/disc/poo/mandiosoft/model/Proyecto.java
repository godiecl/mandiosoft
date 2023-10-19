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
        this.duracionMeses = duracionMeses;
        this.costoTotal = costoTotal;
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

}
