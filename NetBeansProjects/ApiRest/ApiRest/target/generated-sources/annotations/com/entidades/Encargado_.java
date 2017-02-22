package com.entidades;

import com.entidades.Activo;
import com.entidades.Area;
import com.entidades.Persona;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-21T22:58:54")
@StaticMetamodel(Encargado.class)
public class Encargado_ { 

    public static volatile CollectionAttribute<Encargado, Persona> personaCollection;
    public static volatile SingularAttribute<Encargado, BigDecimal> id;
    public static volatile CollectionAttribute<Encargado, Area> areaCollection;
    public static volatile SingularAttribute<Encargado, Activo> activo;

}