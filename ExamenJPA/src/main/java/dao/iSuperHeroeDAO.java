/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import models.SuperHeroe;

/**
 *
 * @author LABORATORIOS
 */
public interface iSuperHeroeDAO {
    public void insertar(SuperHeroe e);
    public void actualizar(SuperHeroe e);
    public void eliminar(Long id);
    public SuperHeroe buscar(Long id);
    public List<SuperHeroe> listar();
}
