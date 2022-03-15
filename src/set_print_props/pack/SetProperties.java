package set_print_props.pack;
import java.util.Scanner;

import forms.pack.Circle;
import forms.pack.Ellipse;
import forms.pack.Form;
import forms.pack.Point;
import forms.pack.Rectangle;
import forms.pack.Segment;
import forms.pack.Square;

public class SetProperties {
	 public int choseType(){
	     try (Scanner sc = new Scanner(System.in)) {
		     System.out.println(" 1.Form \n 2.Point \n 3.Segment \n 4.Rectangle \n 5.Square \n 6.Ellipse \n 7.Circle \n 8.All \n 9.Exit ");
			 System.out.println("Введите число:");
			 int number = sc.nextInt();
			 PrintPropeties prt = new PrintPropeties();
			 
			 switch(number) {
				 case(1):
					 prt.printType(SetFormProps());
				 	 return choseType();	
				 case(2):
					 prt.printType(SetPointProps());
				 	 return choseType();	
				 case(3):
					 prt.printType(SetSegmentProps());
				 	 return choseType();	
				 case(4):
					 prt.printType(SetRectangleProps());
				  	 return choseType();	
				 case(5):
					 prt.printType(SetSquareProps());
				 	 return choseType();	
				 case(6):
					 prt.printType(SetEllipseProps());
				 	 return choseType();	
				 case(7):
					 prt.printType(SetCircleProps());
				 	 return choseType();	
				 case(8):
					 prt.printType(SetFormProps());
					 prt.printType(SetPointProps());
					 prt.printType(SetSegmentProps());
					 prt.printType(SetRectangleProps());
					 prt.printType(SetSquareProps());
					 prt.printType(SetEllipseProps());
					 prt.printType(SetCircleProps());
				 	 return choseType();	
				 case(9):
					 return 1;	
				 default:				
					 System.out.println("Такого варианта нет. Попробуйте еще раз.");
				     return choseType();			    
			 }
		 }	   
	 }
	 Form SetFormProps(){
		 Form x = new Form(false,"",0);
		 x.setLineWidth(10);
		 x.setVisible(true);
		 x.setColor("Black");
		 return x;
	 }
	 Point SetPointProps(){
		 Point x = new Point(false,"",0, 50, 80);
		 x.setLineWidth(10);
		 x.setVisible(true);
		 x.setColor("Black");
		 x.setX(100);
		 x.setY(200);
		 return x;
	 }
	 Segment SetSegmentProps(){
		 Point p1 = new Point(true,"White",10, 60, 90);
		 Point p2 = new Point(false,"White",10, 50, 80);
		 Segment x = new Segment(true,"White",0, p1, p2);
		 return x;
	 }
	 Rectangle SetRectangleProps() {
		 Point p1 = new Point(true,"White",20, 160, 190);
		 Point p2 = new Point(false,"White",30, 70, 100);
		 Rectangle x = new Rectangle(true,"Red",5, p1, p2);
		 return x;
	 }
	 Square SetSquareProps() {
		 Point p1 = new Point(true,"White",20, 55, 65);
		 Point p2 = new Point(false,"White",30, 70, 100);
		 Square x = new Square(true,"Red",5, p1, p2);
		 return x;
	 }
	 Ellipse SetEllipseProps(){
		 Point p = new Point(true,"White",20, 160, 190);
		 Ellipse x = new Ellipse(false, "Green", 2, p, 30, 40);
		 return x;
	 }
	 Circle SetCircleProps() {
		 Point p = new Point(true,"White",20, 160, 190);
		 Circle x = new Circle(false, "Green", 2, p, 30, 40);
		 return x;
	 }
}
