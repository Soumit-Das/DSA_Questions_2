def countdigits(n):
    num = n;
    count = 0;
    while n > 0:
        last = n % 10;
        if num % last == 0:
            count += 1;
        n = n // 10;
    return count;


if __name__ == "__main__":
    print(countdigits(12))