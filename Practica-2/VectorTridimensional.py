import math

class Vector:

    def __init__(self, a1, a2, a3):
        self.a1 = a1
        self.a2 = a2
        self.a3 = a3

    def __str__(self):
        return f'({self.a1}, {self.a2}, {self.a3})'

    # a) Suma de dos vectores
    def __add__(self, other):
        return Vector(self.a1 + other.a1, self.a2 + other.a2, self.a3 + other.a3)

    # b) Multiplicación de un escalar por un vector (sobrecarga del operador '*')
    def __mul__(self, otro):
        return Vector(self.a1 * otro, self.a2 * otro, self.a3 * otro)

    def __rmul__(self, other):
        """
        Multiplica un escalar por el vector (ej. 2 * v).
        """
        return self.__mul__(other)
    # c) Longitud de un vector
    def longitud(self):
        return math.sqrt(self.a1**2 + self.a2**2 + self.a3**2)

    # d) Normal de un vector
    def normal(self):
        """
        Calcula y devuelve el vector normal (unitario).
        """
        magnitud = self.longitud()
        if magnitud == 0:
            return Vector(0, 0, 0)
        return Vector(self.a1 / magnitud, self.a2 / magnitud, self.a3 / magnitud)

    # e) Producto escalar (o producto punto) de dos vectores
    def prodPunto(self, otro):
        return self.a1 * otro.a1 + self.a2 * otro.a2 + self.a3 * otro.a3

    # f) Producto vectorial (o producto cruz) de dos vectores
    def prodCruz(self, otro):
        a_c1 = self.a2 * otro.a3 - self.a3 * otro.a2
        a_c2 = self.a3 * otro.a1 - self.a1 * otro.a3
        a_c3 = self.a1 * otro.a2 - self.a2 * otro.a1
        return Vector(a_c1, a_c2, a_c3)


# --- PROGRAMA PRINCIPAL ---
# vectores
a = Vector(1, 2, 3)
b = Vector(4, 5, 6)
r = 2

print(f"Vector a = {a}")
print(f"Vector b = {b}")
print(f"Escalar r = {r}")
print("-"*30)

# a) Suma de vectores
c = a + b
print(f"Suma de vectores a + b = {c}")

# b) Multiplicación por un escalar
d = r * a
print(f"Multiplicación por un escalar (r * a): {d}")

# c) Longitud de un vector
long_a = a.longitud()
print(f"Longitud de a (|a|): {long_a}")

# d) Normal de un vector
norm_a = a.normal()
print(f"Normal de a: {norm_a}")

# e) Producto escalar
p = a.prodPunto(b)
print(f"Producto escalar (a · b): {p}")

# f) Producto vectorial
pcruz = a.prodCruz(b)
print(f"Producto vectorial de a x b = {pcruz}")

