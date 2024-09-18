def numero_perfecto(n):
    if n < 2:
        return False

    suma_divisores = sum(i for i in range(1, n) if n % i == 0)
    return suma_divisores == n
