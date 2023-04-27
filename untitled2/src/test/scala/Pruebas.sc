import Huffman._

val arbolEjemplo = hacerNodoArbolH(hacerNodoArbolH(Hoja ('x', 1 ), Hoja ('e', 1) Hoja ('t', 2)))

val c1 = cadenaALista("La-vida-es-dura")
val ho1 = listaDeHojasOrdenadas(ocurrencias(c1))
listaUnitaria(ho1)
crearArbolDeHuffman(c1)

val nodoTest = Nodo(Hoja('c', 7), Hoja('d', 100), List(), 0) // Se crea un nodo con 2 hojas

// Casos para peso
peso(Hoja('a', 10)) // Debe imprimir 10
peso(Hoja('b', 15)) // Debe imprimir 15
peso(nodoTest) // Debe imprimir 107
peso(Nodo(Hoja('a', 10), Hoja('b', 20), List(), 0)) // Debe imprimir 30
peso(Nodo(Hoja('a', 10), Nodo(Hoja('b', 20), Hoja('c', 30), List(), 0), List(), 0)) // Debe imprimir 60

// Casos de prueba para cars
cars(Hoja('a', 2))  // Debe imprimir List('a')
cars(Hoja('b', 3))  // Debe imprimir List('b')
cars(nodoTest) // Debe imprimir List('c', 'd')
cars(Nodo(Hoja('a', 10), Hoja('b', 20), List(), 0)) // Debe imprimir List('a', 'b')
cars(Nodo(Hoja('a', 10), Nodo(Hoja('b', 20), Hoja('c', 30), List(), 0), List(), 0)) // Debe imprimir List('a', 'b', 'c')


// Casos de prueba para hacerNodoArbolH
val arbol1 = hacerNodoArbolH(Hoja('a', 10), Hoja('b', 20))
val arbol2 = hacerNodoArbolH(Hoja('a', 10), Nodo(Hoja('b', 20), Hoja('c', 30), List(), 0))
val arbol3 = hacerNodoArbolH(Nodo(Hoja('a', 10), Hoja('b', 20), List(), 0), Nodo(Hoja('c', 30), Hoja('d', 40), List(), 0))
val arbol4 = hacerNodoArbolH(Nodo(Hoja('a', 10), Hoja('b', 20), List(), 0), Nodo(Hoja('c', 30), Hoja('d', 40), List(), 0))
val arbol5 = hacerNodoArbolH(nodoTest, Nodo(Hoja('e', 50), Hoja('f', 60), List(), 0))

// Casos de prueba para cadenaALista
cadenaALista("0101") // Debe imprimir List(0, 1, 0, 1)
cadenaALista("") // Debe imprimir List()
cadenaALista("ABC") // Debe imprimir List(A, B, C)
cadenaALista("La-vida-no-es-dura")
cadenaALista("FUNCIONAL") // Debe imprimir List(F, U, N, C, I, O, N, A, L)

// Casos de prueba para ocurrencias
ocurrencias(cadenaALista("0101")) // Debe imprimir List((0, 2), (1, 2))
ocurrencias(cadenaALista("")) // Debe imprimir List()
ocurrencias(cadenaALista("ABC")) // Debe imprimir List((A, 1), (B, 1), (C, 1))
ocurrencias(cadenaALista("La-vida")) // Debe imprimir List((L, 1), (a, 2), (-, 1), (v, 1), (i, 1), (d, 1))
val oc1 = ocurrencias(c1)

// Casos de prueba para listaDeHojasOrdenadas
listaDeHojasOrdenadas(ocurrencias(cadenaALista("0101"))) // Debe retornar List(Hoja(0, 2), Hoja(1, 2))
listaDeHojasOrdenadas(ocurrencias(cadenaALista(""))) // Debe retornar List()
listaDeHojasOrdenadas(ocurrencias(cadenaALista("ABC"))) // Debe retornar List(Hoja(A, 1), Hoja(B, 1), Hoja(C, 1))
listaDeHojasOrdenadas(ocurrencias(cadenaALista("La-vida")))
listaDeHojasOrdenadas(oc1)

// Casos de prueba para listaUnitaria
listaUnitaria(listaDeHojasOrdenadas(ocurrencias(cadenaALista("0101")))) // Debe retornar false
listaUnitaria(listaDeHojasOrdenadas(ocurrencias(cadenaALista("")))) // Debe retornar false
listaUnitaria(listaDeHojasOrdenadas(ocurrencias(cadenaALista("2")))) // Debe retornar true
listaUnitaria(listaDeHojasOrdenadas(ocurrencias(cadenaALista("ABC")))) // Debe retornar false
listaUnitaria(listaDeHojasOrdenadas(ocurrencias(cadenaALista("A")))) // Debe retornar true

// Casos de prueba para combinar
combinar(listaDeHojasOrdenadas(ocurrencias(cadenaALista("0101")))) // Debe retornar List(Hoja(0, 2), Hoja(1, 2))
combinar(listaDeHojasOrdenadas(ocurrencias(cadenaALista("")))) // Debe retornar List()
combinar(listaDeHojasOrdenadas(ocurrencias(cadenaALista("ABC")))) // Debe retornar List(Hoja(A, 1), Hoja(B, 1), Hoja(C, 1))
combinar(List(arbol1, arbol2) // Debe retornar List(Nodo(Hoja(a, 10), Hoja(b, 20), List(), 30))
combinar(List(arbol3, arbol4)

// Casos de prueba para hastaQue
hastaQue(listaUnitaria, combinar)(listaDeHojasOrdenadas(ocurrencias(cadenaALista("0101"))))
hastaQue(listaUnitaria, combinar)(listaDeHojasOrdenadas(ocurrencias(cadenaALista(""))))
hastaQue(listaUnitaria, combinar)(listaDeHojasOrdenadas(ocurrencias(cadenaALista("ABC"))))
hastaQue(listaUnitaria, combinar)(List(arbol1, arbol2))
hastaQue(listaUnitaria, combinar)(List(arbol3, arbol4))

// Casos de prueba para crearArbolDeHuffman
crearArbolDeHuffman(cadenaALista("0101")) //Debe crear Nodo(Hoja(0, 2), Hoja(1, 2), List(), 4)
crearArbolDeHuffman(cadenaALista("")) //Debe crear Hoja(, 0)
crearArbolDeHuffman(cadenaALista("ABC")) //Debe crear Nodo(Hoja(A, 1), Nodo(Hoja(B, 1), Hoja(C, 1), List(), 2), List(), 3)
crearArbolDeHuffman(cadenaALista("La-vida"))
crearArbolDeHuffman c1

