class Operaciones(var N1:Double , var N2:Double ) {

    fun suma(N1: Double, N2: Double){
        var suma =N1+N2
        println(suma)
    }


    override fun toString(): String {
        return super.toString()
    }


    fun resta(N1: Double , N2: Double){
        var resta = N1-N2
        println(resta)
    }


    fun div(N1: Double,N2: Double):Double{
        var div= N1/N2
        println(div)
        return N1/N2
    }

    fun raiz(N1: Double){
        var r=Math.sqrt(N1)
            println(r)

    }

}