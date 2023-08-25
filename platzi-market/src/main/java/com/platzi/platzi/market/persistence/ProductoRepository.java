package com.platzi.platzi.market.persistence;

import com.platzi.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.platzi.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
//@Repository con esta anotacion le indico a Spring que esta clase se encarga de interactuar con la DB.
@Repository
//@Component es una generalizacion de las anotaciones que indica que es un componente de spring
public class ProductoRepository
{
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto>getall()
    {
        // Si sale un error es necesario castear, en este caso (List<Producto>)
        return (List<Producto>) productoCrudRepository.findAll();

    }
    public List<Producto>getByCategoria1(int idCategoria)
    {
        return productoCrudRepository.findByIdCategoria(idCategoria);
    }
    public List<Producto>getByCategoria(int idCategoria)
    {
        return productoCrudRepository.findByIdCategoriaOOrderByNombreAsc(idCategoria);
    }
    public Optional<List<Producto>> getEscasos(int cantidad)
    {
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
    }
    public Optional<Producto> getProducto(int idProducto)
    {
        return productoCrudRepository.findById(idProducto);
    }
    public Producto save(Producto producto)
    {
        return productoCrudRepository.save(producto);
    }
    public void delete(int idProducto)
    {
         productoCrudRepository.deleteById(idProducto);
    }

}
