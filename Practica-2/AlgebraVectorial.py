import math
from multimethod import multimethod

class Vector:
    def __init__(self, x, y):
        #Constructor de la clase Vector 2D
        self.x = x
        self.y = y

    def __add__(self, otro):
        return Vector(self.x + otro.x, self.y + otro.y)

    def __sub__(self, otro):
        return Vector(self.x - otro.x, self.y - otro.y)

    def __mul__(self, otro):
        return (self.x * otro.x + self.y * otro.y)


    def scalar_product(self, scalar):
        # Producto de un vector por un escalar
        return Vector(self.x * scalar, self.y * scalar)
    
    def cross_product(self, other):
        # Producto cruz en 2D (devuelve un escalar)
        return self.x * other.y - self.y * other.x

    def __abs__(self):
        # Sobrecarga para calcular la magnitud del vector
        return math.sqrt(self.x**2 + self.y**2)
    
    def __str__(self):
        return f"({self.x}, {self.y})"

class AlgebraVectorial:
    # Clase que contiene los métodos de sobrecarga para las operaciones vectoriales.
    @multimethod
    def perpendicular(self, a, b):
        """(a) |a + b| = |a - b|"""
        return abs(a + b) == abs(a - b)

    @perpendicular.register
    def perpendicular_b(self, a, b):
        """(b) |a - b| = |b - a|"""
        # En álgebra vectorial, esto siempre es verdadero.
        return abs(a - b) == abs(b - a)

    @perpendicular.register
    def perpendicular_c(self, a, b):
        """(c) a · b = 0"""
        return a * b == 0

    @perpendicular.register
    def perpendicular_d(self, a, b):
        """(d) |a + b|^2 = |a|^2 + |b|^2"""
        return math.isclose(abs(a + b)**2, abs(a)**2 + abs(b)**2)

    @multimethod
    def paralela(self, a, b):
        """(e) a = r*b. Comprobamos si el vector a es múltiplo de b."""
        if abs(b) == 0:
            return abs(a) == 0
        
        r_x = a.x / b.x if b.x != 0 else None
        r_y = a.y / b.y if b.y != 0 else None

        if r_x is not None and r_y is not None:
            return math.isclose(r_x, r_y)
        elif r_x is not None and r_y is None:
            return b.y == 0
        elif r_y is not None and r_x is None:
            return b.x == 0
        
        return False

    @paralela.register
    def paralela_b(self, a, b):
        """(f) a x b = 0. En 2D, el producto cruz es un escalar."""
        return a.cross_product(b) == 0

    def proyeccion(self, a, b):
        """
        (g) Proyección ortogonal de a sobre b.
        Proy_b a = (a · b / |b|^2) * b
        """
        magnitud_b = abs(b)**2
        if magnitud_b == 0:
            raise ValueError("El vector 'b' no puede ser el vector cero para la proyección.")
        
        dot_product = a * b
        fac_escalar = dot_product / magnitud_b
        return b.scalar_product(fac_escalar)

    def componente(self, a, b):
        """
        (h) Componente de a en la dirección de b.
        Comp_b a = a · b / |b|
        """
        magnitud_b = abs(b)
        if magnitud_b == 0:
            raise ValueError("El vector 'b' no puede ser el vector cero para la componente.")
        
        dot_product = a * b
        return dot_product / magnitud_b

# --- PROGRAMA PRINCIPAL ---
av = AlgebraVectorial()
# Vectores 2D 
v1 = Vector(3, -2)
v2 = Vector(4, 6)
v3 = Vector(6, -4)
v4 = Vector(1, 1)
print(f"v1: {v1.__str__()}")
print(f"v2: {v2.__str__()}")
print(f"v3: {v3.__str__()}")
print(f"v4: {v4.__str__()}")
print("-" * 30)
# 1. PERPENDICULARIDAD
print("--- Verificación de Perpendicularidad ---")
print(f"¿v1 y v2 son perpendiculares? (por |a+b|=|a-b|) -> {av.perpendicular(v1, v2)}")  
print(f"¿v1 y v2 son perpendiculares? (por |a-b|=|b-a|) -> {av.perpendicular_b(v1, v2)}")  
print(f"¿v1 y v2 son perpendiculares? (por a·b=0) -> {av.perpendicular_c(v1, v2)}") 
print(f"¿v1 y v3 son perpendiculares? (por |a+b|^2 = |a|^2+|b|^2) -> {av.perpendicular_d(v1, v3)}") 
print("-" * 30)
# 2. PARALELISMO
print("--- Verificación de Paralelismo ---")
print(f"¿v1 y v3 son paralelos? (por a=rb) -> {av.paralela(v1, v3)}") 
print(f"¿v1 y v3 son paralelos? (por a x b = 0) -> {av.paralela_b(v1, v3)}") 
print("-" * 30)
# 3. PROYECCIÓN
print("--- Proyección de un vector ---")
try:
    proy = av.proyeccion(v1, v4)
    print(f"La proyección de v1 sobre v4 es: {proy.__str__()}")
except ValueError as e:
    print(e)
print("-" * 30)
# 4. COMPONENTE
print("--- Componente de un vector ---")
try:
    comp = av.componente(v1, v4)
    print(f"El componente de v1 en la dirección de v4 es: {comp}")
except ValueError as e:
    print(e)

    