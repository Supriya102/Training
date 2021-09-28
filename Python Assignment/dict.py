input_dict = {'One':'Two','Two':'One','Five':'Five'}
sorted_dict = dict(sorted(input_dict.items(),key= lambda x:x[1]))
print("\nBefore Sorting : ",input_dict)
print()
print("After sorting : ",sorted_dict)
