fun main() {
    var socio1 = Socio(1,"Santi","Roca","3492")
    var socio2 = Socio(2,"Facu","Mitre","3564")

    var pelicula1 = Pelicula(0,"Barbie",false,"Animadas")
    var pelicula2 = Pelicula(1,"La Bella y la Bestia",false,"Animadas")
    var pelicula3 = Pelicula(2,"Rapidos y Furiosos",false,"Accion")
    var pelicula4 = Pelicula(3,"IT",false,"Terror")
    var pelicula5 = Pelicula(4,"After",false,"Romance")
    var pelicula6 = Pelicula(5,"La Monja",false,"Terror")
    var gestor = GestorDePeliculas()

    gestor.agregarPelicula(pelicula1)
    gestor.agregarPelicula(pelicula2)
    gestor.agregarPelicula(pelicula3)
    gestor.agregarPelicula(pelicula4)
    gestor.agregarPelicula(pelicula5)
    gestor.agregarPelicula(pelicula6)

    var alquiler1 = Alquiler(0,"2023",socio1)
    alquiler1.agregarPelicula(pelicula1)
    alquiler1.agregarPelicula(pelicula2)

    var alquiler2 = Alquiler(1,"2024",socio2)
    alquiler2.agregarPelicula(pelicula3)
    alquiler2.agregarPelicula(pelicula4)

    println( "\n\n\nALQUILER 1\n"+ alquiler1.toString() )
    println( "\n\n\nALQUILER 2\n"+ alquiler2.toString() )

    println("\n\n\nPELICULAS DISPONIBLES: " +gestor.pelisDisponibles())

}
