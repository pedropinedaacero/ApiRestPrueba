package com.entidades;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RepositorioActivos extends JpaRepository<Activo,Long>{
    @Query("select o from Activo o ")
    public List<Activo> encontrarTodosLosActivos();
    
    
}
