n=int(input("Enter the size :"))
elem=[]
print("Enter the elements :")
for i in range(0,n):
    elem.append(int(input()))

set1=set(elem)
set1=sorted(set1,reverse=True)
print(set1)
