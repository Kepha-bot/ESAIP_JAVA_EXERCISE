
public class Point {
	private int x;
	private int y;
	
	public Point(int _x, int _y) {
		this.x=_x;
		this.y=_y;
	}
	
	public void affiche() {
		System.out.println("X="+this.x+" Y="+this.y);
	}
	
	public static void main(String[] args) {
		Point p1=new Point(10,20);
		p1.affiche();
	}
}

