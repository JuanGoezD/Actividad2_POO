# -*- coding: utf-8 -*-
"""FigurasGeometricas.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1DrsqH4XftqD5DA0IPsUyoCB-vwB4dyuD
"""

import math

class TrianguloRectangulo:

  """Constructor de la clase TrianguloRectangulo
  @param base Parametro que define la base de triangulo rectangulo
  @param altura Parametro que define la altura de triangulo rectangulo  """

  def __init__(self, base, altura):

    self.base   = base
    self.altura = altura

  """Metodo que devuelve el area de un triangulo rectangulo
    @return Area de un triangulo rectangulo"""

  def calcularArea(self):
      return ((self.base * self.altura)/2 )
  

  """Metodo que devuelve el perimetro
  @return perimetro de un triangulo rectangulo"""

  def calcularPerimetro(self):
    return (self.base + self.altura + self.calcularHipotenusa())#Invoco al metodo calcular hipotenusa

  """Metodo que calcula y devuelve la hipotenusa de un triangulo
  @return Hipotenusa de un triangulo rectangulo"""

  def calcularHipotenusa(self):
    return math.sqrt(((self.base**2) + (self.altura**2)))

  """* Método que determina si un triángulo es:
  - Equilatero: si sus tres lados son iguales
  - Escaleno: si sus tres lados son todos diferentes
  - Escaleno: si dos de sus lados son iguales y el otro es diferente de
  los demás"""

  def determinarTipoTriangulo(self):
    if((self.base == self.altura) and (self.base == self.calcularHipotenusa())
     and (self.altura == self.calcularHipotenusa())):
      
      print("Es un triangulo equilatero")
    
    elif ((self.base != self.altura ) and (self.base != self.calcularHipotenusa())
          and (self.altura != self.calcularHipotenusa())):
      
      print("Es un triangulo escalento")

    else:

      print("Es un triangulo isoceles")

class Cuadrado:

  """Constructor de la Cuadrado
  @param lado Parametro que define la longitud de la base de un cuadrado
  """

  def __init__(self, lado):

    self.lado  = lado

  """Metodo que devuelve el area de un cuadrado
    @return Area de un cuadrado"""

  def calcularArea(self):
      return (self.lado * self.lado )
  

  """Metodo que devuelve el perimetro
  @return perimetro de un cuadrado"""

  def calcularPerimetro(self):
    return (4 * self.lado)

class Rectangulo:

  """Constructor de la clase Rectangulo
  @param base Parametro que define la base de rectangulo
  @param altura Parametro que define la altura de rectangulo  """

  def __init__(self, base, altura):

    self.base   = base
    self.altura = altura

  """Metodo que devuelve el area de un rectangulo
    @return Area de un rectangulo"""

  def calcularArea(self):
      return (self.base * self.altura )
  

  """Metodo que devuelve el perimetro
  @return perimetro de un rectangulo"""

  def calcularPerimetro(self):
    return ((2*self.base) + (2*self.altura))

  
class Circulo:

  """Constructor de la clase Circulo
  @param radio Parametro que define el radio de un circulo
  """

  def __init__(self, radio):

    self.radio   = radio

  """Metodo que devuelve el area de un Circulo
    @return Area de un Circulo"""

  def calcularArea(self):
      return (math.pi * (self.radio**2) )
  

  """Metodo que devuelve el perimetro
  @return perimetro de un circulo"""

  def calcularPerimetro(self):
    return (2*math.pi*self.radio)
  
"""Python no necesita de una clase y un metodo main para interpretar 
el codigo, pero para demostrar que igualmente se puede y 
para dejar el codigo tal cual el UML se hara uso de esta"""

class Rombo:
  """Metodo constructor de la clase Rombo
  @param diagonal_menor Diagonal menor del rombo
  @param diagonal_mayor Diagonal mayor del rombo"""
  def __init__(self, diagonal_menor, diagonal_mayor):
    self.diagonal_menor = diagonal_menor
    self.diagonal_mayor = diagonal_mayor

  """Metodo para calcular un lado del rombo
  @return devuelve un lado del rombo"""

  def calcularLado(self):
    #Calcular el lado de un rombo es calcular una hipotenusa. Para eso los catetos
    cateto1 = self.diagonal_menor/2
    cateto2 = self.diagonal_mayor/2
    return math.sqrt(((cateto1**2) + (cateto2**2)))

  """Metodo para calcular el area del rombo
  @return Devuelve el area de un rombo"""

  def calcularArea(self):
    return (self.diagonal_menor * self.diagonal_mayor)/2

  """Metodo para calcular el perimetro del rombo
  @return Devuelve el perimetro de un rombo"""

  def calcularPerimetro(self):
    return 4*self.calcularLado() #Llamo la función calcularLado para generar un lado y calcular el perimetro

class Trapecio:

  """Metodo constructor de la clase Trapecio
  Este será un trapecio isoceles
  @param Base1 La primera base paralela del trapecio
  @param Base2 Segunda base  paralela del trapecio
  @param altura Altura del trapecio"""
  def __init__(self, base1, base2, altura):
    self.base1 = base1
    self.base2 = base2
    self.altura = altura

  """Metodo para calcular el area del trapecio
  @return Devuelve el area del trapecio"""
  def calcularArea(self):
    return ((self.base1+self.base2)/2)*self.altura

  """Metodo para calcular el perimetro del trapecio
  @return Devuelve el perimetro del trapecio"""

  def calcularPerimetro(self):

    return 2*self.calcularDiagonal() + self.base1 + self.base2

  """Metodo para calcular una diagonal del trapecio
  @return Devuelve una diagonal del trapecio"""

  def calcularDiagonal(self):
    cateto = abs(self.base1-self.base2)
    return math.sqrt(((cateto**2) + (self.altura**2)))
  

class PruebaFiguras:
  """Metodo main donde se instanciara un circulo
  un rectangulo, un cuadrado, un triangulo rectangulo,
  un rombo y un trapecio ademas de  calcular
  area y perimetro para estas figuras
  """
  def main(self):
    figura1 = Circulo(2)
    figura2 = Rectangulo(1,2)
    figura3 = Cuadrado(3)
    figura4 = TrianguloRectangulo(3,5)
    figura5 = Rombo(12,16)
    figura6 = Trapecio(12,15,6)

    print(f"El area del circulo es = {figura1.calcularArea()}")
    print(f"El perimetro del circulo es = {figura1.calcularPerimetro()}\n")
    print(f"El area del rectangulo es = {figura2.calcularArea()}")
    print(f"El Perimetro del rectangulo es = {figura2.calcularPerimetro()}\n")
    print(f"El area del cuadrado es = {figura3.calcularArea()}")
    print(f"El perimetro del cuadrado es = {figura3.calcularPerimetro()}\n")
    print(f"El area del triangulo es = {figura4.calcularArea()}")
    print(f"El perimetro del triangulo es = {figura4.calcularPerimetro()}\n")
    figura4.determinarTipoTriangulo()
    print(f"El perimetro del rombo es = {figura5.calcularPerimetro()}")
    print(f"El area del rombo es = {figura5.calcularArea()}\n")
    print(f"El perimetro del trapecio es = {figura6.calcularPerimetro()}")
    print(f"El area del Trapecio es = {figura6.calcularArea()}")


"""Llamar a la clase y su funcion Main para correr el codigo"""

Prueba = PruebaFiguras()

Prueba.main()