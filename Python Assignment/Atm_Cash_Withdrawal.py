amount_in_atm = {500:10,200:3,100:2}
account_balance = 5000
total_amount=0
transaction=[]

for k,v in amount_in_atm.items():
    total_amount += k*v

def withdraw():
    global total_amount
    global account_balance
    global transaction
    max_withdraw_amt=0.9*total_amount
    amt=int(input("\nPlease enter the amount to be withdrawn :"))
    if amt>account_balance:
        print("\nYou have insufficient balance. Your balance is Rs.",account_balance)
        breakpoint

    elif amt>max_withdraw_amt:
        print("\nYou can withdraw upto a maximum of Rs.",max_withdraw_amt)

    else:
        notes = [500, 200, 100]     
        count = [0, 0, 0] 
        l=[]
        k=[]
        t=amt
        for i, j in zip(notes, count): 
            if t >= i: 
                j = t // i 
                t = t - j * i 
                l.append(i)
                k.append(j)
        print(l,k)

        if (all(x in notes for x in l)):
            account_balance -= amt
            total_amount -= amt
            d=dict(zip(l,k))
            for k,v in amount_in_atm.items():
                if k in d:
                    amount_in_atm[k]=amount_in_atm[k]-d[k]
            print("\nCash Withdrawn!!")
            w ="Withdrawn amount : Rs. {}".format(amt)
            transaction.append(w)
        else:
            print("\nThis transaction cannot be done.")
            

def display_transactions():
    global transaction
    global account_balance
    count = len(transaction)
    if count==0:
        print("\nYou have not done any transaction yet.")
    else:
        print("\n--------Mini Statement-------")   
        print(str(transaction),sep="\n")
        print("\nAccount balance : ",str(account_balance))

while True:
    print("\n\n-----MENU-----")
    print("1.CASH WITHDRAWAL")
    print("2.PRINT MINI STATEMENT")
    print("3.Exit")
    n=int(input("\nEnter your choice:"))
    if(n==1):
        if (len(transaction)==3):
            print("\nYou have availed maximum of 3 transactions.No more allowed.\n")
            break
        else:
            withdraw()
    elif(n==2):
        display_transactions()
    elif(n==3):
        break
    else:
        print("\nPlease Enter correct choice.\n")
