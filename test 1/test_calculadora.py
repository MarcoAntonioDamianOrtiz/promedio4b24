import unittest
from calculadora import suma

class TestCalculadora(unittest.TestCase):
    def test_suma(self):
        self.assertEqual(suma(1, 2), 3)
        self.assertEqual(suma(-1, 1), 0)
        self.assertEqual(suma(-1, -1), -2)

if __name__ == '__main__': 
    unittest.main()
