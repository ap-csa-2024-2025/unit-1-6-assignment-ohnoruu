/*
 * ## Problem3
Create a double and print the first three digits after the decimal point with a space between them.

Sample run:
```
decimal number: 67.3424
Answer: 3 4 2
```
Hint - to complete the second coding activity in lesson 5 you had to learn how to get individual digits from an int value. You can reuse this method once you convert the user input to an appropriate int value (you will need both multiplication and casting for this).

 */

 public class Problem3{
    public static void main(String[]args){
        double decimal = 67.3424;
        decimal *= 10;
        //System.out.println(decimal);
        int digit1 = (int)(decimal);
        digit1 %= 10;
        decimal *= 10;
        int digit2 = (int)(decimal);
        digit2 %= 10;
        decimal *= 10;
        int digit3 = (int)(decimal);
        digit3 %= 10;
        System.out.print(digit1 + " " + digit2 + " " + digit3);
    }
 }
