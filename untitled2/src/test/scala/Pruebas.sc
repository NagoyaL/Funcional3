import Huffman.*

  val arbolEjemplo = hacerNodoArbolH(hacerNodoArbolH(Hoja ('x', 1 ), Hoja ('e', 1')) Hoja (´'t', 2))

  val 1c=cadenaALista("La-vida-es-dura")
  val 1ho=listaDeHojasOrdenadas(ocurrencias(1c))
  listaUnitaria(1ho)
  crearArbolDeHuffman(1c)


  // Casos para peso
  println(peso(Hoja('a', 10))) // Debe imprimir 10
  println(peso(Nodo(Hoja('a', 10), Hoja('b', 20)))) // Debe imprimir 30
  println(peso(Nodo(Hoja('a', 10), Nodo(Hoja('b', 20), Hoja('c', 30)))) // Debe imprimir 60

    // Casos de prueba para cars
    println(cars(Hoja('a', 10))) // Debe imprimir List('a')
    println(cars(Nodo(Hoja('a', 10), Hoja('b', 20)))) // Debe imprimir List('a', 'b')
    println(cars(Nodo(Hoja('a', 10), Nodo(Hoja('b', 20), Hoja('c', 30)))) // Debe imprimir List('a', 'b', 'c')

  // Casos de prueba para hacerNodoArbolH
  val arbol1 = hacerNodoArbolH(Hoja('a', 10), Hoja('b', 20))
  println(arbol1) // Debe imprimir Nodo(Hoja('a',10),Hoja('b',20))

  val arbol2 = hacerNodoArbolH(Hoja('a', 10), Nodo(Hoja('b', 20), Hoja('c', 30)))
  println(arbol2) // Debe imprimir Nodo(Hoja('a',10),Nodo(Hoja('b',20),Hoja('c',30)))

  // Casos de prueba para cadenaALista
  println(cadenaALista("0101")) // Debe imprimir List(Cero, Uno, Cero, Uno)
  println(cadenaALista("")) // Debe imprimir List()
