package forms.pack;
public class Forms_List{
	
	Form form;
	Point point;
	Segment segment;
	Rectangle rectangle;
	Square square;
	Ellipse ellipse;
	Circle circle;
	
	private Form getForm() {
		return form;
	}
	private void setForm(Form form) {
		this.form = form;
	}
	private Point getPoint() {
		return point;
	}
	private void setPoint(Point point) {
		this.point = point;
	}
	private Segment getSegment() {
		return segment;
	}
	private void setSegment(Segment segment) {
		this.segment = segment;
	}
	private Rectangle getRectangle() {
		return rectangle;
	}
	private void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	private Square getSquare() {
		return square;
	}
	private void setSquare(Square square) {
		this.square = square;
	}
	private Ellipse getEllipse() {
		return ellipse;
	}
	private void setEllipse(Ellipse ellipse) {
		this.ellipse = ellipse;
	}
	private Circle getCircle() {
		return circle;
	}
	private void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	public Forms_List(Form form, Point point, Segment segment, Rectangle rectangle, Square square, Ellipse ellipse, Circle circle) {
		this.form = form;
		this.point = point;
		this.segment = segment;
		this.rectangle = rectangle;
		this.square = square;
		this.ellipse = ellipse;
		this.circle = circle;
	}

}
