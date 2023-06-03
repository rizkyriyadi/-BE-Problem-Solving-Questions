Question 1


You need to manage a library that is able to calculate fine based on corresponding rules:
If the book is returned on or before due time, then no fine (0)
If the book is returned after the expected return day but still on the same month and
year then the fine will be 15 for each day it is late. (if 3 days then will be 45 because 3 * 15)


If the book is returned after the return month but still in the same year then the fine will
be 500 for each month it is late.
If the book is returned after expected year then there will be a fixed fine of 12000
Fine is only calculated based on day/month/year (not accumulated), so if there's a late
difference in day and month, only take the month.


Example


d1, m1, y1 = 15,8,2022


d2, m2, y2 = 22,8,2022


The first value is the expected return date while the second value is the actual return date.
The book will be 7 days late (22 - 15), hence the fee will be 105 (7*15).

Question 2


The classroom has a certain number of students and a number of candies provided by the
teacher. The teacher will hand in one candy to each student sequentially until no more
candies are left. The first student that will get the candy is determined by the teacher. The
teacher always slips in one sour candy as the last piece of candy. You need to determine
which one of the students got the sour candy

Example
student = 3

candies = 5

first student = 2

The distribution of candies starts from student 2 and the students will be arranged from 1
to 3. So the candy distribution will be 2,3,1,2,3. The student who will get the sour candy is
student 3.
