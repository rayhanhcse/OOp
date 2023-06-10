
package Rayhan;
class TestClass{
void test(int a){
System.out.println("a: " + a);
}
void test(int a, int b){
System.out.println("a and b: " + a + " " + b);
}
double test(double a){
System.out.println("double a: " + a);
return a*a;
}
}
public class Overlodding {
public static void main(String args[]) {
TestClass ob= new TestClass();
ob.test(10);
ob.test(10, 20);
System.out.println("Return value of ob.test(10.10)" + ob.test(10.10));
}
}
