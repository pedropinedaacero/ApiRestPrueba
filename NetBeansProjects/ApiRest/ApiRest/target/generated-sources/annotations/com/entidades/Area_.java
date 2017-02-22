package com.entidades;

import com.entidades.Encargado;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-21T22:58:54")
@StaticMetamodel(Area.class)
public class Area_ { 

    public static volatile SingularAttribute<Area, String> nombreArea;
    public static volatile SingularAttribute<Area, Encargado> idEncargado;
    public static volatile SingularAttribute<Area, BigDecimal> id;
    public static volatile SingularAttribute<Area, BigDecimal> idCiudad;

}