
class Point{
	private int x,y ;
	public Point(int x, int y){this.x = x; this.y = y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {this.x = x; this.y = y;}
	

}

public class ColorPoint2 extends Point {
	private String color;
	ColorPoint2(int x, int y, String color){
		super (x,y);
		this.color = color;
}
void setPoint(int x, int y) {
	move(x, y);
	
}
void setColor(String color) {this.color = color;}
void show() {
	System.out.println(color + "색으로" + "(" + getX() +  "," + getY()+")");
}
	public static void main(String[] args) {
		ColorPoint2 cp = new ColorPoint2(5,5,"YELLOW");
		cp.setPoint(10,20);
		cp.setColor("GREEN");
		cp.show();
		// TODO Auto-generated method stub

	}

}
