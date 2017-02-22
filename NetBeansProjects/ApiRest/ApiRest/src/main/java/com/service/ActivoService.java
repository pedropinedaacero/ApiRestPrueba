package com.service;

import com.entidades.Activo;
import com.entidades.Encargado;
import com.entidades.Estado;
import com.entidades.RepositorioActivos;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import org.springframework.stereotype.Service;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

@Service
public class ActivoService {
    
    @Autowired
    RepositorioActivos repo;
    
    private List<Activo> activos;
    
    
    public List<Activo> ObtenerTodosLosActivos(){
      List<Activo> lista = repo.encontrarTodosLosActivos();
      return lista;
    }
    
    public List<Activo> obtenerActivosPorConsulta(String tipo,Date fechaCompra, String serial){
       List<Activo> lista = repo.encontrarTodosLosActivos();
       return lista;
    }
    
    public int agregarActivo(String tipo,Date fechaCompra, String serial,String nombre,String descripcion
            ,Integer peso,Integer alto, Integer ancho, Double valorCompra,Date fechaBaja
            ,BigDecimal estado,String color,BigDecimal encargado,Integer numeroInventario){
        
        Activo activo = new Activo();
        activo.setTipo(tipo);
        activo.setFechaCompra(fechaCompra);
        activo.setSerial(serial);
        activo.setNombre(nombre);
        activo.setDescripcion(descripcion);
        activo.setPeso(peso);
        activo.setAlto(alto);
        activo.setValorCompra(valorCompra);
        activo.setFechaBaja(fechaBaja);
        activo.setIdEstado(new Estado(estado));
        activo.setColor(color);
        activo.setIdEncargado(new Encargado(encargado));
        activo.setNumeroInternoInventario(numeroInventario);
        repo.save(activo);
        return 0;
    }

    public void actualizarActivo(String serial, Date fecha){
      Activo activo = new Activo();  
    }
    
    
}
