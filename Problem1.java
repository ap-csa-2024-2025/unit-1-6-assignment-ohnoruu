/*
 * Try to run the following code:
```java
double x = 5 / 20;
System.out.println(x);
```
What answer do you get? The answer is imprecise!

Write a Java program that precisely calculates the decimal value of a fraction, and prints the answer to the screen. The value displayed must be accurate.

Sample Run:
```
numerator: 5
denominator: 20
The decimal value is: 0.25
```
 */
public class Problem1{
  public static void main(String[] args){
    double x = 5/20;
    System.out.println(x);

    int numerator = 5;
    int denominator = 20;
    double fraction = (double)(numerator)/(double)(denominator);
    System.out.println(fraction);
  }
}