package Rayhan;
class Student{
private String name;
private String id;
public String getName(){
return name;}
public String getId(){
return id;}
public void setName(String name){
this.name=name;}
public void setId(String id){
this.id=id;}}
class TestEncapsulation{
public static void main(String[] args){
System.out.println();
Student s=new Student();
s.setName("Rayhan Hussain");
s.setId("126/21|CSE-27");
System.out.println(s.getName());
System.out.println(s.getId());}}
