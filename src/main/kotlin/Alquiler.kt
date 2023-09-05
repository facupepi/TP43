class Alquiler(
    var Numero: Int,
    var fecha: String,
    var socio: Socio
)
{
    private var peliculas_alquiladas: ArrayList<Pelicula> = arrayListOf()

    fun agregarPelicula(Temp: Pelicula){

        if(Temp.alquilada == false){
            peliculas_alquiladas.add(Temp)
            Temp.alquilada = true
        }
        else {
            println("PELICULA YA ALQUILADA")
        }

    }

    override fun toString(): String {
        return "NUMERO: $Numero - FECHA: $fecha \nSOCIO : [$socio] \nPELICULAS ALQUILADAS: [$peliculas_alquiladas]"
    }
}


