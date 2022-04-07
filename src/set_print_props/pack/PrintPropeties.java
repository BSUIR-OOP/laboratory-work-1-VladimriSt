package set_print_props.pack;

import forms.pack.Circle;
import forms.pack.Ellipse;
import forms.pack.Form;
import forms.pack.Point;
import forms.pack.Rectangle;
import forms.pack.Segment;
import forms.pack.Square;
public class PrintPropeties {
	String checkVisibility(boolean visible) {
		if(visible == true)	return "Visible";
		else return "invisible";
	}
	
	int countLength(int p1, int p2) {		
		return Math.abs(p1 - p2);
	}
	
	public void foo(Object o) {
		  if(o instanceof Ellipse) {
			  if(((Ellipse)o).getVerticRadius() != ((Ellipse)o).getHorizRadius())
				  printType((Ellipse)o);
			  else
				  printType((Circle)o);	  
			  }else
				  if(o instanceof Rectangle) {
					  if(countLength(((Rectangle)o).getStartPoint().getX(), ((Rectangle)o).getEndPoint().getX()) != countLength(((Rectangle)o).getStartPoint().getY(), ((Rectangle)o).getEndPoint().getY()))
						  printType((Rectangle)o);
					  else printType((Square)o);
				  }else 
					  if(o instanceof Segment) {
						  printType((Segment)o);
					  }else
						  if(o instanceof Point) {
							  printType((Point)o);
						  }else
							  if(o instanceof Form) {
								  printType((Form)o);
							  }				  
	}
	
    void printType(Form x) {
        System.out.println("Form " + checkVisibility(x.getVisible()) + " | " + x.getLineWidth() + " | " + x.getColor());
    }
    void printType(Point x) {
        System.out.println("Point: " + checkVisibility(x.getVisible()) + " | " + x.getLineWidth() + " | " + x.getColor() + " | " + x.getX() + " | " + x.getY());
    }
    void printType(Segment x) {
        System.out.println("Segment: " + checkVisibility(x.getVisible()) + " | " + x.getLineWidth() + " | " + x.getColor() + " | " + x.getPoint1().getX() + " | " + x.getPoint1().getY()+ " | " + x.getPoint2().getX() + " | " + x.getPoint2().getY());
    }
    void printType(Rectangle x) {
        System.out.println("Rectangle: " + checkVisibility(x.getVisible()) + " | " + x.getLineWidth() + " | " + x.getColor() + " | " + countLength(x.getStartPoint().getX(), x.getEndPoint().getX())+ " | " + countLength(x.getStartPoint().getY(), x.getEndPoint().getY()));
    }
    void printType(Square x) {
        System.out.println("Square: " + checkVisibility(x.getVisible()) + " | " + x.getLineWidth() + " | " + x.getColor() + " | " + countLength(x.getStartPoint().getX(), x.getEndPoint().getX())+ " | " + countLength(x.getStartPoint().getY(), x.getEndPoint().getY()));
    }
    void printType(Ellipse x) {
        System.out.println("Ellipse: " + checkVisibility(x.getVisible()) + " | " + x.getLineWidth() + " | " + x.getColor()+ " | (" + x.getCenter().getX() + ", " + x.getCenter().getY() + ") | " + x.getVerticRadius() + " | " + x.getHorizRadius());
    }
    void printType(Circle x) {
    	System.out.println("Circle: " + checkVisibility(x.getVisible()) + " | " + x.getLineWidth() + " | " + x.getColor()+ " | (" + x.getCenter().getX() + ", " + x.getCenter().getY() + ") | " + x.getVerticRadius() + " | " + x.getHorizRadius());
    }
}