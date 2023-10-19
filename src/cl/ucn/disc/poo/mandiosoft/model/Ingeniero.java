/*
 * Copyright (c) 2023. Programacion Orientada al Objeto, DISC, UCN.
 */

package cl.ucn.disc.poo.mandiosoft.model;

/**
 * The Ingeniero class.
 *
 * @author Programacion Orientada al Objeto.
 */
public final class Ingeniero extends Funcionario {

    /**
     * The titulo.
     */
    private final String titulo;

    /**
     * The carga familiares.
     */
    private int cantidadCargasFamiliares;

    /**
     * The Constructor.
     *
     * @param rut
     * @param nombre
     * @param direccion
     * @param sueldoBase
     * @param titulo
     * @param cantidadCargasFamiliares
     */
    public Ingeniero(String rut, String nombre, String direccion, double sueldoBase, String titulo, int cantidadCargasFamiliares) {
        super(rut, nombre, direccion, sueldoBase);
        // TODO: add validations
        this.titulo = titulo;
        this.cantidadCargasFamiliares = cantidadCargasFamiliares;
    }

    /**
     * Incrementa en numeroCargas el valor de cargas.
     *
     * @param numeroCargas
     */
    public void incrementarCargaFamiliar(int numeroCargas) {
        this.cantidadCargasFamiliares += numeroCargas;
    }

    /**
     * @return the sueldo liquido.
     */
    @Override
    public double getSueldo() {

        double totalProyectos = 0.0;

        // 30% del costo mensual de cada proyecto
        for (Proyecto p : this.getProyectos()) {
            totalProyectos += 0.3 * (p.getCostoTotal() / p.getDuracionMeses());
        }

        // 8000 por cada carga familiar.
        return this.getSueldoBase()
                + 8000 * this.cantidadCargasFamiliares
                + totalProyectos;
    }
}
