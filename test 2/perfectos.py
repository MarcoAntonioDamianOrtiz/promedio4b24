def numero_perfecto(n):
    suma_divisores = sum([i for i in range(1, n) if n % i == 0])
    return suma_divisores == n
