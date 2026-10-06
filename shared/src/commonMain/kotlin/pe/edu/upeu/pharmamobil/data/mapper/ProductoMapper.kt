package pe.edu.upeu.pharmamobil.data.mapper

import pe.edu.upeu.pharmamobil.domain.model.Producto
import pe.edu.upeu.pharmamobil.data.remote.dto.ProductoDTO

fun ProductoDTO.toDomain(): Producto = Producto(
    id = id,
    nombre = title,
    precio = price,
    stock = 10
)
