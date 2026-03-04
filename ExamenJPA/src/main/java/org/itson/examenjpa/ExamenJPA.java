/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.itson.examenjpa;

import dao.SuperHeroeDAO;
import dao.iSuperHeroeDAO;
import java.util.List;
import models.IdentidadSecreta;
import models.SuperHeroe;
import models.Universo;

/**
 *
 * @author LABORATORIOS
 */
public class ExamenJPA {

    public static void main(String[] args) {
        iSuperHeroeDAO sDAO = new SuperHeroeDAO();
        SuperHeroe spiderman = new SuperHeroe("Spider-Man", 
                Universo.MARVEL, 
                new IdentidadSecreta("Peter Parker", "New York", "Fotógrafo"), 
                "Con gran poder viene gran responsabilidad");
        SuperHeroe batman = new SuperHeroe("Batman", 
                Universo.DC, 
                new IdentidadSecreta("Bruce Wayne", "Gotham", "Empresario"), 
                "Soy la venganza");
        SuperHeroe goku = new SuperHeroe("Goku", 
                Universo.INDEPENDIENTE, 
                new IdentidadSecreta("Kakarotto", "Planeta Tierra", "Guerrero"), 
                "¡Kamehameha!");
        System.out.println("\nSuperHeroes insertados");
        sDAO.insertar(spiderman);
        sDAO.insertar(batman);
        sDAO.insertar(goku);
        List<SuperHeroe> superHeroes = sDAO.listar();
        superHeroes.forEach(s -> System.out.println("ID: " + s.getId() + " SuperHeroe: " + s.getNombre() + " Universo: " + s.getUniverso()));
        goku.setNombre("Vegeta");
        sDAO.actualizar(goku);
        System.out.println("\nSuperHeroes actualizados"); 
        superHeroes = sDAO.listar();
        superHeroes.forEach(s -> System.out.println("ID: " + s.getId() + " SuperHeroe: " + s.getNombre() + " Universo: " + s.getUniverso()));
        sDAO.eliminar(goku.getId());
        System.out.println("\nSuperHeroes con Goku eliminado");
        superHeroes = sDAO.listar();
        superHeroes.forEach(s -> System.out.println("ID: " + s.getId() + " SuperHeroe: " + s.getNombre() + " Universo: " + s.getUniverso()));
    }
}
