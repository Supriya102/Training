str1 = input("Enter the string 1 : ")
str2 = input("Enter the string 2 : ")
str3 = input("Enter the string 3 : ")

s1 = list(str1.lower())
s2 = list(str2.lower())
s3 = list(str3.lower())

if sorted(s1) == sorted(s2) and sorted(s1) == sorted(s3):
    print("strings are anagram.")
else:
    print("Strings are not anagram.")


