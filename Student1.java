public class Student1{
    int Rno ;
    String Name ;
    String Department;
    int Percentage;
	//default constructor
	Student1(){
		Rno = 205;
		Name = "john";
		Department = "IT";
		Percentage = 75;
	}

	//paramaterized constructor
	Student1(int id, String Nm,String dp,int score){
		Rno = id;
		Name = Nm;
		Department = dp;
		Percentage = score;
		
	}
    public static void main(String[] args)
    {
        Student1 s1=new Student1();
        
        System.out.println("Student Rno is "+s1.Rno);
        System.out.println("Student Name is "+s1.Name);
        System.out.println("Student Department is "+s1.Department);
        System.out.println("Student Percentage is "+s1.Percentage);
		
		Student1 s2 = new Student1(205,"john","IT",75);
		System.out.println("Paramaterized constructor");
		System.out.println("Student Rno is "+s2.Rno);
        System.out.println("Student Name is "+s2.Name);
        System.out.println("Student Department is "+s2.Department);
        System.out.println("Student Percentage is "+s2.Percentage);
		
    }
}