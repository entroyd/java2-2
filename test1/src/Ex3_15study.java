import java.util.Scanner;
public class Ex3_15study {
    int radius;
    String name;
    

public Ex3_15study() {
    radius = 1; name = "";

    
}
public Ex3_15study(int r, String n){
    radius = r; name = n;
}
public double getArea(){
    return 3.14*radius*radius;

}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a ;
    String q;
    System.out.print("원의 반지름을 입력하세요.>");
    a = scanner.nextInt();
    System.out.print("이름을 입력하세요.>");
    q = scanner.next();
    Ex3_15study pizza = new Ex3_15study(a , q);
    double area = pizza.getArea();
    System.out.println(pizza.name+"면적은"+area);
    }
}