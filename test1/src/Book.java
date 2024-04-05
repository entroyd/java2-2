
public class Book {
	String title;
	String author;
	String bo;
	
	void show() { System.out.println(title+" "+author+" "+ bo);}
	
	public Book() {
		this("", "");
		System.out.println("생성자 호출됨");
		
	}
	public Book(String title, String author) {
		this(title, author, "작자미상");
		
	}
	public Book(String title, String author, String bo) {
		this.title = title;
		this.author = author;
		this.bo = bo;
		
	}
	
	public static void main(String [] agrs) {
		
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전","응" ,"응애");
		Book emptyBook = new Book();
		loveStory.show();
		
		
	}
	
}
