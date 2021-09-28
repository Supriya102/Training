n=int(input("Enter the size of list :"))
list1=[]
print("Enter the sequence :")
for i in range(0,n):
    list1.append(int(input()))

print("You have entered the list as : ",list1)

step=int(input("Enter the step size :"))
start=1
list2=[]
last=list1[-1]
for i in range(0,last):
    list2.append(start)
    start += step

set1=set(list1)
set2=set(list2)
print("Mising values are : ",set2-set1)

