package forms.pack;
public class Point extends Form {
    private int x;
    private int y;
	
    public int getX() {return x;}  
    public int getY() {return y;}

    public void setX(int x) { this.x = x;}
    public void setY(int y) { this.y = y;}
    
	public Point(boolean visible, String color, int lineWidth, int x, int y) {
		super(visible, color, lineWidth);
	    this.x = x;
	    this.y = y;
	}

}
