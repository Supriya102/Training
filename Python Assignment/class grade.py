no_of_students=int(input("Enter the number of students in the class :" ))
roll_no=[]
passed=[]
failed=[]
distinction=[]
first_grade=[]
second_grade=[]
reappeared=[]
maths_list=[]
science_list=[]
english_list=[]
total_marks=[]
count=0

for i in range(0,no_of_students):
    roll_no=i+1
    score=int(input("Enter the maths score of student :\n"))
    maths_list.append(score)
    score1=int(input("Enter the science score of  student :\n"))
    science_list.append(score1)
    score2=int(input("Enter the english scores of  student :\n"))
    english_list.append(score2)
    total_marks=[maths_list,science_list,english_list]
    total_marks=[item for elem in total_marks for item in elem]

for marks in total_marks :
    if marks < 50 : 
            count += 1
    if count > 1 :
        failed.append(roll_no)
    elif count == 1 :
        reappeared.append(roll_no)
    else : 
        passed.append(roll_no)
        avg = sum(total_marks)/3
        if (avg >= 90) :
            distinction.append(roll_no)
        elif (avg >= 70) :
            first_grade.append(roll_no)
        else : 
            second_grade.append(roll_no)

print("No. of Students failed : ", (len(failed)/no_of_students))
print("No. of Students reappearing : ", (len(reappeared)/no_of_students))
print("No. of Students passed : ", (len(passed)/no_of_students))
print("No. of Students passed with Distinction : ", (len(distinction)/no_of_students))
print("No. of Students passed with First Grade : ", (len(first_grade)/no_of_students))
print("No. of Students passed with Second Grade : ", (len(second_grade)/no_of_students))
