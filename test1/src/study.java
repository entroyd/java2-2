import java.util.Scanner;
public class study {
    public static int sum(int a , int b, int c){
        return a*b*c;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3개의 곱을 하기위해 수를 입력해주세요");
        System.out.print("첫번째 수 :");
        int a = scanner.nextInt();
        System.out.print("두번쨰수 :");
        int b = scanner.nextInt();
        System.out.print("세번쨰 수 : ");
        int c = scanner.nextInt();
        System.out.print("3개의 수 "+ a +"/"+ b+"/"+ c+"곱은 =");
        System.out.println(sum(a, b, c)+"입니다");

        scanner.close();



    }
    
}
