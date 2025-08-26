# making count function

list  = [1,2,3,2,2]
b=int(input("enter the number you want to check:"))
flag=0
for i in list:
    if b==i:
        flag=flag+1
    
print("total number of",b,"is",flag)