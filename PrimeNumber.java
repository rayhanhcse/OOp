package Rayhan;
import java.util.Scanner;
public class PrimeNumber {public static int primeNumber(int n)
{int c = 2, i, j;
for (c = 2; c <= n - 1; c++)
{if ((n % c) == 0){
break;}}
if (c == n){return n;}
else {return 0;}
}
public static void main(String[] args) {
int n1, n2, c = 2, i, j;
Scanner s = new Scanner(System.in);
System.out.print("Enter the starting number : ");
n1 = s.nextInt();
System.out.print("Enter the ending Number: ");
n2 = s.nextInt();
System.out.print("The prime numbers between the interval "
+ n1 + " and " + n2 + " are: ");
for (i = n1; i <= n2; i++)
{if (primeNumber(i) == 0){
continue;}else
{System.out.print(primeNumber(i) + ", ");}}}}
