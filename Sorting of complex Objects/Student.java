package comparing;

import java.util.Arrays;

public class Student implements Comparable<Student>{

	int rollno;
	float marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, float marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub   //if o.marks is greater diff becomes negative %Hence o.marks is greater
		int diff=(int) (this.marks-o.marks);   //this key represents current object 
		return diff;
	}
		
	@Override
	public String toString() {
		return marks+"";          //to sort marks
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
      Student student1=new Student(1,38.2f);
      Student student2=new Student(2,34.2f);
      Student student3=new Student(8,30.5f);
      Student student4=new Student(6,26.2f);
      Student student5=new Student(9,44.9f);
      Student student6=new Student(5,36.2f);
      
      Student list[]={student1,student2,student3,student4,student5,student6};
      
      System.out.println(Arrays.toString(list));  // toString is overided only returns marks to sort
      Arrays.sort(list);                         //to sort Object
      System.out.println(Arrays.toString(list));  //after sorting calling again toString to print in ascending order
         
	}
    	  
	}
	


