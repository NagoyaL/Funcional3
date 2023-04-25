import java.util.function.IntToDoubleFunction

package object Huffman {
 abstract class ArbolH
  case class Nodo(izq: ArbolH, der: ArbolH, cars: List[Char], peso: Int) extends ArbolH
  case class Hoja(car: Char, peso: Int) extends ArbolH

 // Parte 1: Funciones esenciales y sencillas
  def peso(arbol: ArbolH): Int = arbol match {
   case Hoja(_, peso) => peso
   case Nodo(izq, der, _, _) => peso(izq) + peso(der)
  }

  def cars(arbol: ArbolH): List[Char] = arbol match {
   case Hoja(c, _) => List(c)
   case Nodo(izq, der, _, _) => cars(izq) ::: cars(der) // se usa ::: porque concatena listas, :: concatena un elemento a una lista
  }

  def hacerNodoArbolH(izq: ArbolH, der: ArbolH) =
    Nodo(izq, der, cars (izq) ::: cars(der), peso (izq) + peso (der))

 // Parte 2: Construyendo arboles de Huffman
  def cadenaALista (cad: String): List[Char] = cad.toList

  def ocurrencias(cars: List [Char]): List [(Char, Int)] = {
   cars match {
    case Nil => Nil
    case c :: tail =>
     val lista = List[(Char, Int)]
     if (!lista.contains(c)) {
      (c, cars.count(_ == c)) :: ocurrencias(tail)
     } else {
      ocurrencias(tail)
     }
   }
    // cars.distinct.map(c => (c, cars.count(_ == c))) // .distinct devuelve una lista sin elementos repetidos
  }


 // Funcion que devuelve una lista de hojas ordenadas por peso

  def listaDeHojasOrdenadas (frecs: List [(Char, Int)]): List [Hoja] = {
   def merge(izq: List[(Char, Int)], der: List[(Char, Int)]): List[(Char, Int)] = (izq, der) match {
     case (Nil, der) => der
     case (izq, Nil) => izq
     case ((c1, f1) :: t1, (c2, f2) :: t2) =>
      if (f1 < f2) (c1, f1) :: merge(t1, der)
      else (c2, f2) :: merge(izq, t2)
    }

   def mergeSort(frec: List[(Char, Int)]): List[(Char, Int)] = frec match {
     case Nil => Nil
     case List(x) => List(x)
     case xs =>
      val (izq, der) = xs.splitAt(xs.length / 2)
      merge(mergeSort(izq), mergeSort(der))
    }

   mergeSort(frecs).map {
    case (c, f) => Hoja(c, f)
   }
  }

 def listaUnitaria (arboles: List [ArbolH]): Boolean = {
   arboles match {
    case Nil => false
    case _ :: Nil => true
    case _ => false
  }
 }

 def combinar (arboles: List[ArbolH]): List[ArbolH] = {
    arboles match {
      case a :: b :: tail => hacerNodoArbolH(a, b) :: tail
      case _ => arboles
    }
 }

 def hastaQue(cond: List[ArbolH] => Boolean, mezclar: List[ArbolH] => List [ArbolH])
              (listaOrdenadaArboles: List[ArbolH]): List [ArbolH] = {

 }

 def crearArbolDeHuffman(cars: List[Char]): ArbolH = {

 }

 type Bit = Int

 def decodificar(arbol: ArbolH, bits: List[Bit]): List [Bit] = {

 }

 def codificar(arbol: ArbolH)(texto: List[Char]): List[Bit] = {

 }


  type TablaCodigos = List [(Char, List [Bit])]

  def codigoEnBits(tabla: TablaCodigos)(car: Char): List[Bit] = {

  }

  def mezclarTablasDeCodigos(a: TablaCodigos, b: TablaCodigos): TablaCodigos ={

  }

  def convertir (arbol: ArbolH): TablaCodigos = {

  }

  def codificarRapido (arbol: ArbolH)(texto: List[Char]): List[Bit] = {

  }




}