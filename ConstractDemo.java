class Books{
	String title;
	String author;
	double price;
	Books (){
		title="Unknown";
		author="Not Assined";
		price=0.0;
	}
	public void displayDetails() {
		System.out.println("title\t"+title);
		System.out.println("Author\t"+author);
		System.out.println("Price\t"+price);
	}
}


public class ConstractDemo {
	public static void main(String [] args) {
		Books book=new Books();
		book.displayDetails();
	}

}
