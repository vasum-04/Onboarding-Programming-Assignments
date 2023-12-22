def is_vowel_present(s):
    return any(vowel in s.lower() for vowel in 'aeiou')

string = input("Enter a string: ")
print("Vowel present:", is_vowel_present(string))
