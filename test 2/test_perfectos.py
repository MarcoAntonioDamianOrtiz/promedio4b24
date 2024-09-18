import unittest
from perfectos import numero_perfecto

class TestNumeroPerfecto(unittest.TestCase):
    def test_es_numero_perfecto(self):
        # Pruebas para números perfectos
        self.assertTrue(numero_perfecto(6))   # 6 es un número perfecto
        self.assertTrue(numero_perfecto(28))  # 28 es un número perfecto

    def test_no_es_numero_perfecto(self):
        # Pruebas para números que no son perfectos
        self.assertFalse(numero_perfecto(10))  # 10 no es un número perfecto
        self.assertFalse(numero_perfecto(0))    # 0 no es un número
