/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PEDRO LIIS
 */
@Entity
@Table(name = "activo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Activo.findAll", query = "SELECT a FROM Activo a"),
    @NamedQuery(name = "Activo.findById", query = "SELECT a FROM Activo a WHERE a.id = :id"),
    @NamedQuery(name = "Activo.findByNombre", query = "SELECT a FROM Activo a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Activo.findByDescripcion", query = "SELECT a FROM Activo a WHERE a.descripcion = :descripcion"),
    @NamedQuery(name = "Activo.findBySerial", query = "SELECT a FROM Activo a WHERE a.serial = :serial"),
    @NamedQuery(name = "Activo.findByNumeroInternoInventario", query = "SELECT a FROM Activo a WHERE a.numeroInternoInventario = :numeroInternoInventario"),
    @NamedQuery(name = "Activo.findByPeso", query = "SELECT a FROM Activo a WHERE a.peso = :peso"),
    @NamedQuery(name = "Activo.findByAlto", query = "SELECT a FROM Activo a WHERE a.alto = :alto"),
    @NamedQuery(name = "Activo.findByAncho", query = "SELECT a FROM Activo a WHERE a.ancho = :ancho"),
    @NamedQuery(name = "Activo.findByValorCompra", query = "SELECT a FROM Activo a WHERE a.valorCompra = :valorCompra"),
    @NamedQuery(name = "Activo.findByFechaCompra", query = "SELECT a FROM Activo a WHERE a.fechaCompra = :fechaCompra"),
    @NamedQuery(name = "Activo.findByFechaBaja", query = "SELECT a FROM Activo a WHERE a.fechaBaja = :fechaBaja"),
    @NamedQuery(name = "Activo.findByColor", query = "SELECT a FROM Activo a WHERE a.color = :color")})
public class Activo implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private BigDecimal id;
    @Size(max = 60)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 12)
    @Column(name = "serial")
    private String serial;
    @Column(name = "numero_interno_inventario")
    private Integer numeroInternoInventario;
    @Column(name = "peso")
    private Integer peso;
    @Column(name = "alto")
    private Integer alto;
    @Column(name = "ancho")
    private Integer ancho;
    @Column(name = "valor_compra")
    private Double valorCompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_compra")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;
    @Size(max = 20)
    @Column(name = "color")
    private String color;
    @JoinColumn(name = "id_encargado", referencedColumnName = "id")
    @OneToOne
    private Encargado idEncargado;
    @JoinColumn(name = "id_estado", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Estado idEstado;

    public Activo() {
    }

    public Activo(BigDecimal id) {
        this.id = id;
    }

    public Activo(BigDecimal id, Date fechaCompra, Date fechaBaja) {
        this.id = id;
        this.fechaCompra = fechaCompra;
        this.fechaBaja = fechaBaja;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Integer getNumeroInternoInventario() {
        return numeroInternoInventario;
    }

    public void setNumeroInternoInventario(Integer numeroInternoInventario) {
        this.numeroInternoInventario = numeroInternoInventario;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Encargado getIdEncargado() {
        return idEncargado;
    }

    public void setIdEncargado(Encargado idEncargado) {
        this.idEncargado = idEncargado;
    }

    public Estado getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Estado idEstado) {
        this.idEstado = idEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Activo)) {
            return false;
        }
        Activo other = (Activo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entidades.Activo[ id=" + id + " ]";
    }
    
}
