def palindrome(x):
    if x < 0:
        return False;
    dup = x;
    rev = 0;
    while x != 0:
        last = x % 10;
        rev = (rev * 10) + last;
        x = x // 10;

    if rev == dup:
        return True;

    return False;


if __name__ == "__main__":
    print(palindrome(-121));