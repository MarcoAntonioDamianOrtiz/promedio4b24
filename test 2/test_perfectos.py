import unittest
from perfectos import numero_perfecto

class TestNumeroPerfecto(unittest.TestCase):
<<<<<<< HEAD
    def test_es_numero_perfecto(self):
        self.assertTrue(numero_perfecto(6))  
if __name__ == '__main__':
    unittest.main()
=======
    def test_es_un_numero_perfecto(self):
        self.assertTrue(numero_perfecto(6))
        self.assertTrue(numero_perfecto(28))
        self.assertTrue(numero_perfecto(10))
        self.assertTrue(numero_perfecto(0))
        self.assertTrue(numero_perfecto(-6.8))
        
        if __name__ == '__main__': 
            unittest.main()
>>>>>>> 5fc9958fc296f17d91d943101b05f5faa74bd667
