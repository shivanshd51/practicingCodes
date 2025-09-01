# Stone Paper Scissor Game

import random

while True:
    choice = int(input("1) Stone\n2) Paper\n3) Scissor\nEnter your choice: "))
    a = random.randint(1, 3)

    if a == 1:
        print("Computer chosen Stone")
    elif a == 2:
        print("Computer chosen Paper")
    else:
        print("Computer chosen Scissor")

    if a == choice:
        print("Match Draw!")
    elif (choice == 1 and a == 3) or (choice == 2 and a == 1) or (choice == 3 and a == 2):
        print("YOU WON!")
    elif choice in [1, 2, 3]:
        print("YOU LOSE!")
    else:
        print("Enter the correct choice")

    con = input("You want to play more? (y/n): ")
    if con.lower() == "y":
        continue
    elif con.lower() == "n":
        break
    else:
        print("Enter a valid input!")
