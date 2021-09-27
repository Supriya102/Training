
levels = int(input("Enter the number of levels you want :"))
step = int(input("Enter the step size you want :"))
start =1
l=[]
for i in range(0, levels):
    for j in range(0, levels-i-1):
        print(end=" ")
    for j in  range(0, i+1):
        print(start, end=" ")
    print()
    l.append(start)
    start += step
    
print()
for i in range(0,levels):
        print("Line",i+2,":",l[i],"s","=",l[i]*(i+1))
