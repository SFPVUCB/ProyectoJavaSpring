package com.platzi.platzi.market.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Categorias")
public class Categoria
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Integer idCategoria;
    private String descripcion;
    private Boolean estado;

    //ahora debemos crear un atributo lista
    //NOTA IMPORTANTE ES COLOCAR @OnetoMany antes del atributo lista
    //de uno a muchos, una Categoria tiene muchos productos
    //@OnetoMany pregunta quien mantiene esta relacion, y es la variable categoria en la clase Producto
    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    //GETTERS AND SETTERS

    public Integer getIdCategoria()
    {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria)
    {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
