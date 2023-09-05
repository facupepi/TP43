class Socio(
    var dni : Int,
    var nombre : String,
    var direccion : String,
    var telefono : String
)

{
    override fun toString(): String {
        return "DNI: $dni - NOMBRE: $nombre - DIRECCION : $direccion - CATEGORIA: $telefono"
    }
}