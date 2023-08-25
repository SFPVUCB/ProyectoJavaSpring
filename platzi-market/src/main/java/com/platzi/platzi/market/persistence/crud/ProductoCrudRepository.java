package com.platzi.platzi.market.persistence.crud;

import com.platzi.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;
//Importante debemos extender de CrudRepository y pasarle la clase que representa la tabla en cuestion,
//y el tipo de dato de su llave primaria
public interface ProductoCrudRepository extends CrudRepository<Producto,Integer>
{



}
