
package com.controller;

import com.entidades.Activo;
import com.service.ActivoService;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activos")
public class ControladorActivos {
    
    @Autowired 
    ActivoService as;
    
    @RequestMapping("/all")
    public List<Activo> retornarActivos(){
       
        return as.ObtenerTodosLosActivos();
    }
    
    @RequestMapping("{tipo,fechaCompra,serial}")
    public List<Activo> verActivosPorConsulta(@PathVariable("tipo") String tipo,@PathVariable("fechaCompra") String fechaCompra,@PathVariable("serial") String serial) throws ParseException{
        Date fecha = (fechaCompra!=null)?new SimpleDateFormat("dd-MM-YYYY").parse(fechaCompra):null;
        return as.obtenerActivosPorConsulta(tipo,fecha,serial);
    }
    
    @RequestMapping("/registrar")
    public int registrarActivo(@RequestParam("tipo") String tipo,@RequestParam("fechaCompra") String fechaCompra,
            @RequestParam("serial") String serial,@RequestParam("nombre") String nombre,@RequestParam("descripcion") String descripcion
            ,@RequestParam("peso") String peso,@RequestParam("alto") String alto,@RequestParam("ancho") String ancho
            ,@RequestParam("largo") String largo,@RequestParam("valorCompra") String valorCompra,@RequestParam("fechaBaja") String fechaBaja
            ,@RequestParam("estado") String estado,@RequestParam("color") String color,@RequestParam("encargado") String encargado,@RequestParam("numeroInventario") String numeroInventario) throws ParseException, Exception{
        Date fechaC = (fechaCompra!=null)?new SimpleDateFormat("dd-MM-YYYY").parse(fechaCompra):null;
        Date fechaB = (fechaCompra!=null)?new SimpleDateFormat("dd-MM-YYYY").parse(fechaBaja):null;
        Calendar calendarioCompra = Calendar.getInstance();
        Calendar calendarioBaja = Calendar.getInstance();
        calendarioCompra.setTime(fechaC);
        calendarioBaja.setTime(fechaB);
        if(calendarioCompra.after(calendarioBaja)){
            throw new Exception();
        }
        Integer pesoObj = Integer.parseInt(peso);
        Integer altoObj = Integer.parseInt(alto);
        Integer anchoObj = Integer.parseInt(ancho);
        Integer numeroInventarioObj = Integer.parseInt(numeroInventario);
        Double valorCompraObj = Double.parseDouble(valorCompra);
        BigDecimal estadoObj = new BigDecimal(estado);
        BigDecimal encargadoObj = new BigDecimal(encargado);
        as.agregarActivo(tipo,fechaC,serial,nombre,descripcion,pesoObj,altoObj,anchoObj,valorCompraObj,fechaB,estadoObj,color,encargadoObj,numeroInventarioObj);
        return 0;
    }
    
    
}
