package sreehari;
class Book{
	String title;
	String author;
	double price;
	Book(String title, String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void displayDetails(){
		System.out.println("title= "+title);
		System.out.println("author= "+author);
		System.out.println("price= "+price);
	}
}
class EBook extends Book{
	double filesizeMB;
	EBook(String title, String author,double price, double filesizeMB){
		super(title,author,price);
		this.filesizeMB=filesizeMB;
	}
	public void displayDetails(){
		//System.out.println("title= "+title);
		//System.out.println("author= "+author);
		//System.out.println("price= "+price);or
		super.displayDetails();
		System.out.println("file size= "+ filesizeMB);
	}
}
class PrintedBook extends Book{
	int numberofpages;
	PrintedBook(String title, String author,double price, int numberofpages){
		super(title,author,price);
		this.numberofpages=numberofpages;
	}
	public void displayDetails(){
		super.displayDetails();
		System.out.println("numberofpages= "+ numberofpages);
	}
}
public class Sub {
	public static void main(String [] args) {
		EBook ebook=new EBook("Jave","unknown",325,22.28);
		ebook.displayDetails();
		PrintedBook print=new PrintedBook("JAVA","Dennis",800,328);
		print.displayDetails();
	}
}
