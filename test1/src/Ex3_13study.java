import java.util.Scanner;
public class Ex3_13study {


public static void main(String[] args) {


Scanner scanner = new Scanner (System.in);
int dividend; // 나뉨수
int divisor; // 나눗수
System.out.print ("나뉨수를 입력하시오:");
dividend = scanner.nextInt(); 
System.out .print("나눗수를 입력하시오:");
divisor = scanner.nextInt(); // 나눗수 입력
if(divisor == 0){
    
    System.out.println("0으로 나눌 수 없습니다!");
    scanner.close(); 
}
else {
    System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
    scanner.close(); 
}   
}

    }   