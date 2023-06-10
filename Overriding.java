
package Rayhan;
class Human {
public void think()
{
System.out.println("Human is thinking.");
}
}
class Boy extends Human{
@Override
public void think(){
System.out.println("He is overthinking.");
}

}
public class Overriding {
    public static void main( String args[]) {
Human a = new Human();
Human b = new Boy();
a.think();
b.think();
}}
