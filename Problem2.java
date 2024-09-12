/*
 * ## Problem2
Write a program which takes two doubles and then prints the sum of the numbers when they are both rounded to their nearest whole number. You may assume the doubles are always positive.

Hint: Remember not to just truncate the number - look back at the slides from the lesson if you don't remember how to ensure the number is rounded, not just truncated.

Sample run:
```
Two original numbers:
57.3934
22.5211
Answer: 57 + 23 = 80
```
 */

 public class Problem2{
    public static void main (String[]args){
        double num1 = 2.5;
        double num2 = 1.5;
        int roundNum1 = (int)(num1+0.5); 
        System.out.println(roundNum1);
        int roundNum2 = (int)(num2+0.5);
        System.out.println(roundNum2);
        int sum = (roundNum1 + roundNum2);
        System.out.print(sum);
    }
 }
