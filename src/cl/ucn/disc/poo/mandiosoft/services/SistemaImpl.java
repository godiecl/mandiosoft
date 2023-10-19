/*
 * Copyright (c) 2023. Programacion Orientada al Objeto, DISC, UCN.
 */

package cl.ucn.disc.poo.mandiosoft.services;

import cl.ucn.disc.poo.mandiosoft.model.Proyecto;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementacion de los Contratos del Sistema.
 *
 * @author Programacion Orientada al Objeto.
 */
public final class SistemaImpl implements Sistema {

    /**
     * The List of Proyectos.
     */
    private final List<Proyecto> proyectos = new ArrayList<>();

    /**
     * Constructor del Sistema.
     */
    public SistemaImpl() {
        // nothing here
    }

    /**
     * @return the proyectos con sus costos.
     */
    @Override
    public String getProyectosConCostos() {
        return null;
    }
}
