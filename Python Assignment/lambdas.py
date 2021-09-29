list1=[]
dict1={}

def add_to_list():
    value = int(input("\nEnter the element you want to add to the list :"))
    list1.append(value)
    print("\nList is : ",str(list1))

def create_dict():
    k = 'key_'
    dict1 = {k + str(ele) : ele for ele in list1}
    print("\nThe dictionary is : ",str(dict1))

def sort_dict():
    k = 'key_'
    dict1 = {k + str(ele) : ele for ele in list1}
    sorted_dict = dict(sorted(dict1.items(),key= lambda x:x[1],reverse=True))
    print("\nSorted dictionary is : ",str(sorted_dict))

while True:
    print("\n\n-----MENU-----")
    print("1.Add a new element to the list.")
    print("2.Create dictionary from the list.")
    print("3.Sort dictionary in descending order based on values.")
    print("4.Exit")
    n=int(input("\nEnter your choice:"))

    if(n==1):
        add_to_list()
    elif(n==2):
        create_dict()
    elif(n==3):
        sort_dict()
    elif(n==4):
        break
    else:
        print("\nPlease Enter correct choice.\n")
