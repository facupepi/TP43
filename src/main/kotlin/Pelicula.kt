import extensiones.negritaYVerde

class Pelicula(
  var codigo : Int,
  var nombre : String,
  var alquilada : Boolean = false,
  var categoria : String
)
{
    override fun toString(): String {
        return "\n CODIGO:$codigo - NOMBRE: ${nombre.negritaYVerde()} - ALQUILADA? : $alquilada - CATEGORIA: $categoria "
    }
}