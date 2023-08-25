package com.platzi.platzi.market.persistence;

import com.platzi.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.platzi.market.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

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



}
