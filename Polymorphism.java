package Rayhan;
class Shape{public void draw() {System.out.println("Draw");}
public void erase(){System.out.println("Erase");}}
class Circle extends Shape{public void draw() {
System.out.println("Draw circle");}
public void erase(){System.out.println("Erase circle");}}
class Triangle extends Shape{
public void draw(){System.out.println("Draw triangle");}
public void erase(){System.out.println("Erase triangle");}}
class Square extends Shape{
public void draw(){System.out.println("Draw square");}
public void erase(){System.out.println("Erase square");}}
public class Polymorphism {
    public static void main(String[] args){
Shape C=new Circle();
C.draw();
C.erase();
Shape Tr=new Triangle();
Tr.draw();
Tr.erase();
Shape Sq=new Square();
Sq.draw(); 
Sq.erase();}}
