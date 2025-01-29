word = input("Enter word:").lower#Take input

def reverse():     #define function
    txt = word [::-1]   #splice word and reverse it
    if txt == word:     #check is word is equal to input
        print(txt + " is a palindrome")

reverse() #call function

