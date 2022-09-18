public class Student{
   private int rollno= 205;
   private String name= john;
   private String department= IT;
   private double percentage= 75.36;
	
	Student(){
	}
	
	//paramaterized constructor
	Student(int id, String nm,String dp,double score){
		rollno = id;
		name = nm;
		department = dp;
		percentage = score;
		
	}
    public static void main(String[] args)
    {
	    //Object for Default constructor
        Student s1=new Student();
        
        System.out.println("Student Rno is "+s1.rollno);
        System.out.println("Student Name is "+s1.name);
        System.out.println("Student Department is "+s1.department);
        System.out.println("Student Percentage is "+s1.percentage);
		
	    //Object for Parameterized construtor
	Student s2 = new Student(237,"phani","IT",81.28);
	    
	System.out.println("Paramaterized constructor");
	    
	System.out.println("Student Rno is "+s2.rollno);
        System.out.println("Student Name is "+s2.name);
        System.out.println("Student Department is "+s2.department);
        System.out.println("Student Percentage is "+s2.percentage);
		
    }
}
