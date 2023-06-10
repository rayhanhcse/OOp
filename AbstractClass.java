package Rayhan;
abstract class Shape{
abstract void draw();}
class Rectangle extends Shape{
void draw(){System.out.println("Draw a rectangle");}}
class Circle extends Shape{void draw(){
System.out.println("Draw a circle");}}
class AbstractClass{
public static void main(String[] args){
System.out.println();
Shape C =new Circle();
C.draw();
Shape R =new Rectangle();
R.draw();}}