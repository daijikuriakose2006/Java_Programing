/*
 * Daiji KUriakose
 * Cse - B
 * July 11, 2025
 *                                                                            
 */

class Students{
	String name;
	int rollNumber;
	String department;
	Students(String name,int rollNumber,String department){
		this.name=name;
		this.rollNumber=rollNumber;
		this.department=department;
		
	}
	public void StudentInfo() {
		System.out.println("name\t"+name);
		System.out.println("rollNumber\t"+rollNumber);
		System.out.println("Price\t"+department);
	}
}

public class Student {
	public static void main(String[] args) {
		Students Student1 =new Students("Sreehari",20,"CSE");
		Student1.StudentInfo();
		Students Student2 =new Students("Thomas",71,"CSE");
		Student2.StudentInfo();
		Students Student3 =new Students("Abjith",03,"CSE");
		Student3.StudentInfo();
	}
}
