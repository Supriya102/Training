n=int(input("Enter no. of lines :")) 
list1=[]
for i in range(0,n):
    print("Enter the values for Line ",i+1," : ")
    list1.append([])
    for j in range(0,3):
        list1[i].append(input())

index= [val[0] for val in list1]          #list of first element of all sublist

flag = True

for value in index:
    if index.count(value) > 1:
        flag=True  
    else:                               #there is duplicates 
        flag=False                      #there is no duplicates

if(flag==False): 
    with open('file.txt','w') as f:
        f.write("Name,Email,Contact\n")
        for k in list1:
            f.write('%s' % k)
            f.write('\n')
    f.close()

with open('file.txt','r') as f1:
    lines=f1.readlines()[1:]
    f1.close()
print(lines)





