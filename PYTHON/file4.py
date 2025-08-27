# pop function 
l=[1,2,3,4,5,6,7,8]

def pop1(a):
    b=len(a)
    b=b-1
    l1=[]
    for i in range(b):
        c=a[i]
        l1.append(c)
    a=l1
    print(a)

pop1(l)