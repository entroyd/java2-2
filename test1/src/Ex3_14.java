import java.util.Scanner;
class Rectangle {
    int width;
    int height;
    public int getArea() {
    return width*height;
}
}
public class Ex3_14{
    public static void main(String[] args) {
        Rectangle rect= new Rectangle(); // 객체 생성
        Scanner scanner = new Scanner (System.in);
        System.out.print("밑변>> ");
        rect.width = scanner.nextInt();
        System.out.print("높이>> ");
        rect.height = scanner.nextInt();
        System.out.println("사각형의 면적은 "+ rect.getArea());
        scanner.close();
    }
}

