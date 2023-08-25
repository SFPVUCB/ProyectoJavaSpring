package com.platzi.platzi.market.persistence.crud;

import com.platzi.platzi.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.temporal.ValueRange;
import java.util.List;
import java.util.Optional;

//Importante debemos extender de CrudRepository y pasarle la clase que representa la tabla en cuestion,
//y el tipo de dato de su llave primaria
public interface ProductoCrudRepository extends CrudRepository<Producto,Integer>
{
    //Aqui vemos 2 formas de hacer una consulta sql
    //Primera es de forma nativa usan la anotacion @Query
    //@Query(value = "SELECT *FROM prodcutos WHERE id_categoria=?",nativeQuery = true)
    //La segunda es por medio de los QueryMethods pero respetando su estructura
    //findBy'lo que busca'(tipovariable variableClase)

    List<Producto> findByIdCategoria(int idCategoria);

    List<Producto> findByIdCategoriaOOrderByNombreAsc(int idCategoria);
    //QueryMethods tambien soporta los nuevos operadores de java como Optional
    //Buscar cantidad de Stock es menor que y que esten activos
    //traera productos que se estan agotando y que los estoy vendiendo

    Optional<List<Producto>>findByCantidadStockLessThanAndEstado(int cantidadStock,boolean estado);



}
