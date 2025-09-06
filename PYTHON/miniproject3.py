# # voting system
records={"BJP":0,"INC":0,"AAP":0}
while(True):
    name=input("enter your name:")
    age=int(input("enter your age:"))
    if(age>=18):
        choice=int(input("1)Bhartiya Janta Party\n2)Congress\n)Aam Adami Party\nTo which party you want to vote:"))
        if(choice==1):
            records["BJP"]=(records["BJP"])+1
        elif(choice==2):
            records["INC"]=(records["INC"])+1
        elif(choice==3):
            records["AAP"]=(records["AAP"])+1
        else:
            print("INVALID...!\nenter the correct choice:")

    
    else:
        print("you are not ELIGIBLE before !8")

    print(records)
    more=input("more voter to vote(y/n):")
    if(more=="y"):
        continue
    elif(more=="n"):
        break
    else:
        print("enter correct choice")
