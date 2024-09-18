def numero_perfecto(n):
    print(n)
    if n < 2:
        return False
    
    suma_divisores = 0
    for i in range (1, n):
        if n % i == 0:
            suma_divisores += i
            
        if suma_divisores == n:
            return True
        else:
            return False