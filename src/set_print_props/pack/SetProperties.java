package set_print_props.pack;

import java.util.Scanner;

import forms.pack.Circle;
import forms.pack.Ellipse;
import forms.pack.Form;
import forms.pack.Forms_List;
import forms.pack.Point;
import forms.pack.Rectangle;
import forms.pack.Segment;
import forms.pack.Square;

public class SetProperties {
	 public void choseType(){
	     try (Scanner sc = new Scanner(System.in)) {
			 PrintPropeties prt = new PrintPropeties();
			 Forms_List l = new Forms_List();
			 int number = 0;
			 while(number != 9) {
			     System.out.println(" 1.Form \n 2.Point \n 3.Segment \n 4.Rectangle \n 5.Square \n 6.Ellipse \n 7.Circle \n 8.All \n 9.Exit & Print List ");
				 System.out.println("Введите число:");
				 /*Object x = new Form(false,"abc",0);;
				 prt.foo(x);*/
				 /*Forms_List l = new Forms_List();
				 l.addFront((Form)o);*/
				 number = sc.nextInt();  
				 
				 switch(number) {
					 case(1):
					 	 l.addFront(SetFormProps());
						 prt.printType(SetFormProps());
					 break;
					 case(2):
					 	 l.addFront(SetPointProps());
						 prt.printType(SetPointProps());
				 	 break;
					 case(3):
					 	 l.addFront(SetSegmentProps());
						 prt.printType(SetSegmentProps());
				 	 break;
					 case(4):
					 	 l.addFront(SetRectangleProps());
						 prt.printType(SetRectangleProps());
				 	 break;
					 case(5):
					 	 l.addFront(SetSquareProps());
						 prt.printType(SetSquareProps());
				 	 break;
					 case(6):
					 	 l.addFront(SetEllipseProps());
						 prt.printType(SetEllipseProps());
				 	 break;
					 case(7):
					 	 l.addFront(SetCircleProps());
						 prt.printType(SetCircleProps());		
				 	 break;
					 case(8):
					 	 l.addFront(SetFormProps());
					 	 l.addFront(SetPointProps());
					 	 l.addFront(SetSegmentProps());
					 	 l.addFront(SetRectangleProps());
					 	 l.addFront(SetSquareProps());
					 	 l.addFront(SetEllipseProps());
					 	 l.addFront(SetCircleProps());						 
						 break;
					 case(9):
						 l.printList();		
				 	 break;
					 default:				
						 System.out.println("Такого варианта нет. Попробуйте еще раз.");	
						 break;
				 }
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
		 Point p1 = new Point(true,"White",20, 55, 65);
		 Point p2 = new Point(false,"White",30, 70, 100);
		 Rectangle x = new Rectangle(true,"Red",5, p1, p2);
		 
		 return x;
	 }
	 Square SetSquareProps() {
		 Point p1 = new Point(true,"White",20, 160, 190);
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
