import unittest
from perfectos import numero_perfecto

class TestNumeroPerfecto(unittest.TestCase):
    def test_es_numero_perfecto(self):
        self.assertTrue(numero_perfecto(6))  
if __name__ == '__main__':
    unittest.main()
