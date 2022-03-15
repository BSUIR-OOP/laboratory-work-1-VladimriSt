package forms.pack;
public class Rectangle extends Form{
	private Point startPoint;
    private Point endPoint;
    
    public Point getStartPoint() {return startPoint;}  
    public Point getEndPoint() {return endPoint;}

    public void setStartPoint(Point startPoint) { this.startPoint = startPoint;}
    public void setEndPoint(Point endPoint) { this.endPoint = endPoint;}
    
    public Rectangle(boolean visible, String color, int lineWidth, Point startPoint, Point endPoint) {
		super(visible, color, lineWidth);
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
}
