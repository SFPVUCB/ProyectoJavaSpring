package com.platzi.platzi.market.persistence;

import com.platzi.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.platzi.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository
{
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto>getall()
    {
        // Si sale un error es necesario castear, en este caso (List<Producto>)
        return (List<Producto>) productoCrudRepository.findAll();

    }


}
