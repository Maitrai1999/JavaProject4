package ArrList;
import java.util.List;
 import java.util.LinkedList;
  
 class Student {
 int id,age;
 String name,degree,location;
 public Student(int id,String name,String degree,String location,int age) {
	this.id=id;
	this.name=name;
	this.degree=degree;
	this.location=location;
	this.age=age;
 }  }
public class StudentList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Student>list=new LinkedList<Student>();
       Student s1=new Student(11,"maitrai","b.tech","Ap",22);
       Student s2=new Student(12,"yamini","b.tech","Ap",22);
       Student s3=new Student(13,"nisha","b.tech","TamilNadu",22);
       list.add(s1);
       list.add(s2);
       list.add(s3);
       for(Student s:list) {
    	   System.out.println(s.id+""+s.name+""+s.degree+""+s.location+""+s.age+"");
       }
       
	} 
        
}
  
        
        
        
        
        
        	
	


