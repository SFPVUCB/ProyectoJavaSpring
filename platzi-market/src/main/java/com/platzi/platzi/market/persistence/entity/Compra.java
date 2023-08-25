package com.platzi.platzi.market.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="compras")
public class Compra
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCompra;
    @Column(name="id_cliente")
    private Integer idCliente;
    private LocalDateTime fecha;
    @Column(name="medio_pago")
    private String medioPago;
    private String comentario;
    private String estado;

    //Crearemos la variable que relaciona la compra con cliente
    //Muchas compras realiza 1 cliente
    @ManyToOne
    //le indicamos que la columna id_categoria es lo que lo une y
    // que no es insertable ni actualizable desde esta clase.Para hacerlo sera en la clase Cliente
    @JoinColumn(name="id_cliente",insertable = false,updatable = false)
    private Cliente cliente;
    //Creamos la relacion con ComprasProducto

    @OneToMany(mappedBy = "compra")
    private List<ComprasProducto> productos;

    //GETTERS AND SETTERS
    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
