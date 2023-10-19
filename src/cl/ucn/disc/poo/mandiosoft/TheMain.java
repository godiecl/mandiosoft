/*
 * Copyright (c) 2023. Programacion Orientada al Objeto, DISC, UCN.
 */

package cl.ucn.disc.poo.mandiosoft;

import cl.ucn.disc.poo.mandiosoft.services.Sistema;
import cl.ucn.disc.poo.mandiosoft.services.SistemaImpl;

/**
 * The Main.
 *
 * @author Programacion Orientada al Objeto.
 */
public final class TheMain {

    /**
     * Run!
     */
    public static void main(String[] args) {

        // Construccion del sistema
        Sistema sistema = new SistemaImpl();

        System.out.println("Proyectos con Costos: " + sistema.getProyectosConCostos());

    }

}
