package problemsOfClasses;

public class A {

	public static void main(String[] args) {
		B b1=new B();
		int sum1=b1.sum(6, 9);
		System.out.println("Sum of two integer value is :"+sum1);
		
		int sum2=b1.sum(6, 9,10);
		System.out.println("Sum of three integer value is :"+sum2);
		
		double sum3=b1.sum(6.2546, 9.952);
		System.out.println("Sum of two double value is :"+sum3);
		
		System.out.println("===========================================================");
		
		Student s1=new Student(1,"sanjay","singh",25,"gandhinagar",9724119727l);
		s1.display();
		System.out.println("===========================================================");
		
		Student s2=new Student(2,"bhola","yadav",35,"kanpur",25426554215l);
		s2.display();
		
		System.out.println("===========================================================");
		
		Student s3=new Student(3,"ram","singh",75,"kalupur",9895656542l);
		s3.display();
		
		System.out.println("===========================================================");
		
		Student s4=new Student(4,"rashmi","singh",25,"gandhinagar",98956594665l);
		s4.display();
		
		System.out.println("===========================================================");
		Student s5=new Student(5,"khusbu","upadhaya",25,"gandhinagar",5421542154l);
		s5.display();
		
	}

}
