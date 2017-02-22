package com.entidades;

import com.entidades.Activo;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-21T22:58:54")
@StaticMetamodel(Estado.class)
public class Estado_ { 

    public static volatile CollectionAttribute<Estado, Activo> activoCollection;
    public static volatile SingularAttribute<Estado, String> nombreEstado;
    public static volatile SingularAttribute<Estado, BigDecimal> id;

}