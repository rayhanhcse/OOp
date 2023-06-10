package Rayhan;
interface Printable{
void print();}
interface Readable{
void read();}
class A4 implements Printable,Readable{
@Override
public void print() {
System.out.println("My");}
@Override
public void read(){
System.out.println("Love");}}
public class MultipleInheritance {
public static void main(String[] args){
System.out.println();
A4 obj = new A4();
obj.print();
obj.read();}}
