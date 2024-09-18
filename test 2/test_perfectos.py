import unittest
from perfectos import numero_perfecto

class TestNumeroPerfecto(unittest.TestCase):
    def test_es_un_numero_perfecto(self):
        self.assertTrue(numero_perfecto(6))
        self.assertTrue(numero_perfecto(28))
        self.assertTrue(numero_perfecto(10))
        self.assertTrue(numero_perfecto(0))
        self.assertTrue(numero_perfecto(-6.8))
        
        if __name__ == '__main__': 
            unittest.main()
