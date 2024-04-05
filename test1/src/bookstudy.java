import java.util.Scanner;
public class bookstudy{
	String title;
	String author;
	String bo;
    int u;

     void show(){
        if (u!=1)
            System.out.println("책이름은 "+title+"이며 장르는 "+author+"이고 작자는 "+ bo +" 입니다.");
        }


        
    
	public bookstudy() {
		this("", "");
		u = 1;
        System.out.println("책이름과 장르는 필수로 입력해야 합니다 !");
        
	}
	public bookstudy(String title, String author) {
		this(title, author, "미상");
		
	}
	public bookstudy(String title, String author, String bo) {
		this.title = title;
		this.author = author;
		this.bo = bo;
		
	}
	
	public static void main(String [] agrs) {
		Scanner scanner =new Scanner(System.in);
		String a;
		String b;
		String c;
        System.out.print("책이름을 입력하세요. >");
		a = scanner.nextLine();
        System.out.print("장르를 입력하세요. >");
        b = scanner.nextLine();
        System.out.print("작자를 입력하세요 (모르면 모름 입력). >");
        c = scanner.nextLine();
        if(a.equals("")){
            bookstudy book = new bookstudy();
		    book.show();
        }else if(b.equals("")){
            bookstudy book = new bookstudy();
		    book.show();
        }else{
            if (c.equals("모름")){
                bookstudy book = new bookstudy(a ,b);
		        book.show();
            }else{
                bookstudy book = new bookstudy(a ,b ,c);
		        book.show();
            }
    }
		
		
	}
	
}
