package com.entidades;

import com.entidades.Encargado;
import com.entidades.Estado;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-21T22:58:54")
@StaticMetamodel(Activo.class)
public class Activo_ { 

    public static volatile SingularAttribute<Activo, String> descripcion;
    public static volatile SingularAttribute<Activo, Date> fechaBaja;
    public static volatile SingularAttribute<Activo, String> tipo;
    public static volatile SingularAttribute<Activo, Encargado> idEncargado;
    public static volatile SingularAttribute<Activo, String> color;
    public static volatile SingularAttribute<Activo, Integer> peso;
    public static volatile SingularAttribute<Activo, Double> valorCompra;
    public static volatile SingularAttribute<Activo, Integer> alto;
    public static volatile SingularAttribute<Activo, String> nombre;
    public static volatile SingularAttribute<Activo, Date> fechaCompra;
    public static volatile SingularAttribute<Activo, Estado> idEstado;
    public static volatile SingularAttribute<Activo, String> serial;
    public static volatile SingularAttribute<Activo, Integer> ancho;
    public static volatile SingularAttribute<Activo, BigDecimal> id;
    public static volatile SingularAttribute<Activo, Integer> numeroInternoInventario;

}