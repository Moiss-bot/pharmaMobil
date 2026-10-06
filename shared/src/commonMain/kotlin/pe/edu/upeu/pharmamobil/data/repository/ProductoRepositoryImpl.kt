package pe.edu.upeu.pharmamobil.data.repository

import pe.edu.upeu.pharmamobil.data.mapper.toDomain
import pe.edu.upeu.pharmamobil.data.remote.ProductoApi
import pe.edu.upeu.pharmamobil.domain.model.Producto
import pe.edu.upeu.pharmamobil.domain.repository.ProductoRepository

class ProductoRepositoryImpl(
    private val api: ProductoApi
) : ProductoRepository {

    override suspend fun registrar(producto: Producto): Producto {
        // Se implementará más adelante cuando hagamos peticiones POST (CRUD completo)
        TODO("Not yet implemented")
    }

    override suspend fun listar(): List<Producto> {
        // Consumimos la API, mapeamos cada DTO al modelo de dominio y devolvemos la lista
        return api.obtenerProductos().map { it.toDomain() }
    }
}