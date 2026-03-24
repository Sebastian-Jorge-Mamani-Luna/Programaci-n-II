import math
class AlgebraVectorial:

    def __init__(self, a, b, c):
            self.a1 = a
            self.a2 = b
            self.a3 = c

    def __add__(self, vector2):  #lo usamos para sumar 2 vectores
        return AlgebraVectorial(
            self.a1 + vector2.a1,
            self.a2 + vector2.a2,
            self.a3 + vector2.a3
        )

    def __rmul__(self, r):  #lo usamos para multiplicar un escalar r * self.a#
        return AlgebraVectorial(
            r * self.a1,
            r * self.a2,
            r * self.a3
        )

    def __abs__(self): #aplicamos la longitud del vector
        return (math.sqrt(self.a1 ** 2 + self.a2 ** 2 + self.a3 ** 2))

    def __truediv__(self, escalar): # Sobrecarga para dividir el vector por un escalar (vector / escalar)
        if escalar == 0:
            raise ValueError("No se puede dividir por cero")
        return AlgebraVectorial(
            self.a1 / escalar,
            self.a2 / escalar,
            self.a3 / escalar
        )

    def normal(self):  # Calculemos el vector normalizado
        if abs(self) == 0:
            raise ValueError("No se puede normalizar el vector cero")
        return self / abs(self)

    def __mul__(self, otro):
        if isinstance(otro, AlgebraVectorial):
            #Producto escalar
            return (self.a1 * otro.a1 +
                    self.a2 * otro.a2 +
                    self.a3 * otro.a3)
        else:
            #Escalar * vector
            return AlgebraVectorial(
                self.a1 * otro,
                self.a2 * otro,
                self.a3 * otro
            )

    #calculamos el producto vectorial entre dos vectores
    def __xor__(self, otro):
        return AlgebraVectorial(
            self.a2 * otro.a3 - self.a3 * otro.a2,
            self.a3 * otro.a1 - self.a1 * otro.a3,
            self.a1 * otro.a2 - self.a2 * otro.a1
        )

    def __str__(self):
        return f"({self.a1}, {self.a2}, {self.a3})"


class Main:
    a = AlgebraVectorial(1,5,6)
    b = AlgebraVectorial(43,4,5)
    d = AlgebraVectorial(1,2,3)

    #SUMA DE DOS VECTORES
    c = a + b
    print("Suma de dos vectores a y b: " , c)

    #MULTIPLICACION DE UN ESCALAR POR UN VECTOR
    a1 = 2 * b
    print("Multiplicación de un escalar r por un vector a: ", a1)

    #LONGITUD DE UN VECTOR
    print(c)
    print("Longitud de un vector a: ", abs(a))

    #NORMAL DE UN VECTOR
    print("Normal de un vector a: ", a.normal())

    #PRODUCTO ESCALAR
    print("Producto escalar de a y b:", a * b)

    #PRODUCTO VECTORIAL
    print("Producto vectorial de a y b:", a ^ b)



