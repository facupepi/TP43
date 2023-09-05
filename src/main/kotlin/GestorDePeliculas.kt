class GestorDePeliculas(
    var listado_peliculas : ArrayList<Pelicula> = arrayListOf()
) {
    fun agregarPelicula(PeliTemp : Pelicula){
        listado_peliculas.add(PeliTemp)
    }

    fun pelisDisponibles() : ArrayList<Pelicula>{
        var arrayPelisDisponibles : ArrayList<Pelicula> = arrayListOf()

        for (peliTemp in listado_peliculas){

            if (!peliTemp.alquilada){
                arrayPelisDisponibles.add(peliTemp)
            }
        }
        return arrayPelisDisponibles
    }

}