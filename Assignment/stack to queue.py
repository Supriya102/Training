
def stack_to_queue(stack):
    stack.sort()
    min1=stack[0]
    min2=stack[1]
    
    queue=[]
    mul1=[]
    mul2=[]
    for num in stack:
        if(num>min1) and (num%min1==0):
            mul1.append(num)
        if(num>min2) and (num%min2==0):
            mul2.append(num)
    
    queue.extend(mul1)
    queue.extend(mul2)
    return queue 
        
print(stack_to_queue([6, 12, 2, 15, 17, 3, 9]))
    

    
