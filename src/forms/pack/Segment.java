package forms.pack;
public class Segment extends Form {
    private Point p1;
    private Point p2;

    public Point getPoint1() {return p1;}
    public Point getPoint2() {return p2;}

    public void setPoint1(Point p1) {this.p1 = p1;}
    public void setPoint2(Point p2) {this.p2 = p2;}
    
    public Segment(boolean visible, String color, int lineWidth, Point p1, Point p2) {
        super(visible, color, lineWidth);
 	    this.p1 = p1;
 	    this.p2 = p2;
    }
}
