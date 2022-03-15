package forms.pack;

public class Ellipse extends Form {
    private Point center;
	private int horizRadius;
	private int verticRadius;

	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public int getHorizRadius() {
		return horizRadius;
	}
	public void setHorizRadius(int horizRadius) {
		this.horizRadius = horizRadius;
	}

	public int getVerticRadius() {
		return verticRadius;
	}
	public void setVerticRadius(int verticRadius) {
		this.verticRadius = verticRadius;
	}


	public Ellipse(boolean visible, String color, int lineWidth, Point center, int horizRadius, int verticRadius) {
		super(visible, color, lineWidth);
		this.verticRadius = verticRadius;
		this.horizRadius = horizRadius;
		this.center = center;
	}

}
