def numero_perfecto(n):
<<<<<<< HEAD
    suma_divisores = sum([i for i in range(1, n) if n % i == 0])
    return suma_divisores == n
=======
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
>>>>>>> 5fc9958fc296f17d91d943101b05f5faa74bd667
