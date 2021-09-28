def merge(list1, l, m, r):
    n1 = m - l + 1
    n2 = r - m
    L = [0] * (n1)
    R = [0] * (n2)

    for i in range(0, n1):
        L[i] = list1[l + i]
 
    for j in range(0, n2):
        R[j] = list1[m + 1 + j]
    
    i = 0    
    j = 0    
    k = l     
    while i < n1 and j < n2:
        if L[i] <= R[j]:
            list1[k] = L[i]
            i += 1
        else:
            list1[k] = R[j]
            j += 1
        k += 1
 
    while i < n1:
        list1[k] = L[i]
        i += 1
        k += 1
 
    while j < n2:
        list1[k] = R[j]
        j += 1
        k += 1
 
def mergeSort(list1, l, r):
    if l < r:
        m = l+(r-l)//2
        mergeSort(list1, l, m)
        mergeSort(list1, m+1, r)
        merge(list1, l, m, r)
    
list1=['doll','banana','apple','car']
n=len(list1)
print("Given list is :",list1)
mergeSort(list1, 0, n-1)
print("\nAfter sorting the list is :",list1)