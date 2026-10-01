import Multiplicacion._
//Se añadieron negativos en algunos algoritmos para probar la 
//funcionalidad del mensaje de advertencia para enteros negativos

PeasantAlgorithm(7,7)
PeasantAlgorithm(11,42)
PeasantAlgorithm(2145,3233)
PeasantAlgorithm(7002,12)
PeasantAlgorithm(34,-67)

PeasantAlgorithmIt(15,4)
PeasantAlgorithmIt(874,15)
PeasantAlgorithmIt(500,10)
PeasantAlgorithmIt(6,7)
PeasantAlgorithmIt(-15,4)

splitMultiply(5,5)
splitMultiply(400,243)
splitMultiply(1512,4721)
splitMultiply(676767,512)
splitMultiply(-12,1)

FastAlgorithm(12,8989)
FastAlgorithm(1,0)
FastAlgorithm(8257,1200)
FastAlgorithm(123456,567890)
FastAlgorithm(-14,3)

/* Resultados esperados:
val res0: Int = 49
val res1: Int = 462
val res2: Int = 6934785
val res3: Int = 84024
java.lang.IllegalArgumentException: Los operandos deben ser positivos
  

val res5: Int = 60
val res6: Int = 13110
val res7: Int = 42
java.lang.IllegalArgumentException: Los operandos deben ser positivos
  

val res9: Int = 25
val res10: Int = 97200
val res11: Int = 7138152
val res12: Int = 346504704
java.lang.IllegalArgumentException: Los operandos deben ser no negativos
  

val res14: Int = 107868
val res15: Int = 0
val res16: Int = 1389951104
java.lang.IllegalArgumentException: Los operandos deben ser no negativos
  
 */
