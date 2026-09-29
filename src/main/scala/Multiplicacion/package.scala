package object Multiplicacion {
  def PeasantAlgorithmIt(a:Int, b:Int): Int = {
    //Versión iterativa del Peasant Algorithm para multiplicar 2 enteros positivos
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("Los operandos deben ser positivos")
    }
    var x=a
    var y=b
    var producto=0
    while (x>0) {
      if (x%2!=0){
        producto=producto+y
      }
      x=x/2
      y=y+y
    }
    producto
  }

  def FastAlgorithm(a: Int, b: Int): Int = {
    //Retorna la multiplicación de dos enteros recursivos usando el FastAlgorithm
    if (a < 0 || b < 0) {
      throw new IllegalArgumentException("Los operandos deben ser no negativos")}
    //Función adicional para determinar la longitud de los números
    def Digitos(numero: Long): Int ={
      if (numero<10) 1
      else 1+Digitos(numero/10)
    }
    //Multiplicación sencilla de una sola cifra
    if (a<10 && b<10){
      return a*b
    }
    //Identificador de la cantidad de dígitos de los números ingresados
    val n =math.max(Digitos(a), Digitos(b))
    //Cálculo del punto de división
    val m = n/2
    //Cálculo de las potencias correspondientes
    val powM=math.pow(10,m).toInt
    val pow2M=math.pow(10,2*m).toInt
    //Separación de la primera entrada en parte superior e inferior
    val a1 =a/powM
    val a0=a%powM
    //Separación de la segunda entrada en parte superior e inferior
    val b1 =b/powM
    val b0=b%powM
    //Este es el cálculo recursivo de los 3 productos
    val P1= FastAlgorithm(a1,b1)
    val P2 = FastAlgorithm(a0, b0)
    val P3 = FastAlgorithm(a1+a0,b1+b0)
    //Ecuación principal de Karatsuba
    (P1*pow2M)+((P3-P1-P2)*powM)+P2
  }
}
