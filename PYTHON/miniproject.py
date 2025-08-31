print("Welcome to Shivansh's Cafe, Here's the menu:\n1)Pizza : Rs40.\n2)Pasta : Rs50.\n3)Burger : Rs60.\n4)Salad : Rs70.\n5)Coffee : Rs80.")
bill_amount=0
while(True):
    order_number=int(input("enter your order number:"))
    
    if(order_number==1):
        bill_amount=bill_amount+40
        print("Pizza is added")

    elif(order_number==2):
        bill_amount=bill_amount+50
        print("Pasta is added")

    elif(order_number==3):
        bill_amount=bill_amount+60
        print("Burger is added")

    elif(order_number==4):
        bill_amount=bill_amount+70
        print("Salad is added")

    elif(order_number==5):
        bill_amount=bill_amount+80
        print("Coffee is added")

    else:
        print("INVALID...!\nEnter the correct choice:")
    
    choice=input("you want to add more:yes/no\n")
    if(choice=="yes"):
        continue
    elif(choice=="no"):
        break
    else:
        print("INVALID...!\nEnter the correct choice:")

print("Your Order will be ready soon. Your bill is",bill_amount)

