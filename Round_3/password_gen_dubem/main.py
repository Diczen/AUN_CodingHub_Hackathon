# Password Generator
import random

def generate_password():
    Chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+[]{}|;:,.<>?"

    passwordLength = int(input("Enter the desired password length: "))

    # Validate lenght of password
    if passwordLength < 8:
        print("Password length should be at least 8 characters.")
        return

    for i in range(passwordLength - 1):
        password = ""
        password += random.choice(Chars)
        print(password)

generate_password()