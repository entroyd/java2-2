import javax.swing.*;


public class Myframe extends JPrame {
    public Myframe(){
        setTitle("300x300 Frame");
        setSize(300,300);
        setVisble(true);
    }
    
    public static void main(String[] args) {
        Myframe frame =new Myframe();
    }
}
