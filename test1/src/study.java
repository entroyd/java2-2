import java.util.Scanner;
int a =0;
int b =0;
int c =0;
public class study {
    public static int sum(int a ,int b, int c){
        
        if (a>200){
            System.out.println("첫번쨰수가 200보다 크면 작동 하지 않습니다");
            
        }else {
            
            System.out.print("3개의 수 "+ a +"/"+ b+"/곱은 =");
            return a * b ;
            
            
        }
        return c;
        
        
    }
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
        if(a<200){
            
            
        }else{
        System.out.println(sum(a,b,c)+"입니다");
        }
        scanner.close();



    }
    

