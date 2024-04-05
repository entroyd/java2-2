public class Ex3_15 {
    int radius;
    String name;
    

public Ex3_15() {
    radius = 1; name = "";

    
}
public Ex3_15(int r, String n){
    radius = r; name = n;
}
public double getArea(){
    return 3.14*radius*radius;

}
public static void main(String[] args) {
    Ex3_15 pizza = new Ex3_15(10, "자바 피자");
    double area = pizza.getArea();
    System.out.println(pizza.name+"면적은"+area);
    
    
    Ex3_15 donut = new Ex3_15();
    donut.name="도넛피자";
    area = donut.getArea();
    System.out.println(donut.name + "의면적은"+area);

    }
}