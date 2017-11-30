package com.example.alumno.master1


class Leer(val cadenaentera:String) {
    public fun convierte(): Pair<String,String> {

        //var cadenaentera="{'uno','dos'}"

        var cadena=(cadenaentera.substringAfter("=")).substringBefore(",")
        var uno=(cadena.substringAfter("\"")).substringBefore("\"")


        cadena=(cadenaentera.substringAfter(",")).substringBefore("}")
        var dos=(cadena.substringAfter("=")).substringBefore("\"")
        return Pair(uno, dos)
    }
}