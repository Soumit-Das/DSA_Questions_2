def reverse(x):
    rev = 0
    sign = 1 if x >= 0 else -1
    x = abs(x)  # Work with the absolute value of x

    while x != 0:
        last_digit = x % 10
        if rev > (2**31 - 1) // 10:
            return 0
        rev = (rev * 10) + last_digit
        x //= 10

    return rev * sign

if __name__ == "__main__":
    print(reverse(132))