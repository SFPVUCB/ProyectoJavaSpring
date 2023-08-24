package com.platzi.platzi.market.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
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



}
