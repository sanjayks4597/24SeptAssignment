package problemsOfClasses;

public class Student {

	private int studentId;
	private String studentFirstName;
	private String studentLastName;
	private int studentRollno;
	private String studentCity;
	private long mobileNo;
	
	public Student() {
		
	}
	
	public Student(int studentId,String studentFirstName,String studentLastName,int studentRollno,String studentCity,long mobileNo )
	{
		this.studentId=studentId;
		this.studentFirstName=studentFirstName;
		this.studentLastName=studentLastName;
		this.studentRollno=studentRollno;
		this.studentCity=studentCity;
		this.mobileNo=mobileNo;
	}
	
	void display() {
		System.out.println("Student Id: "+studentId);
		System.out.println("Student First Name: "+studentFirstName);
		System.out.println("Student Last Name: "+studentLastName);
		System.out.println("Student Rollno:: "+studentRollno);
		System.out.println("Student City: "+studentCity);
		System.out.println("Student Mobile: "+mobileNo);
	}

}
