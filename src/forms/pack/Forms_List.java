package forms.pack;
public class Forms_List{	
	typedef struct FormLst{
		Form form;
		Point point;
		Segmet segment;
		Rectangle rectangle;
		Square square;
		Ellipse ellipse;
		Circle circle;
		struct FormLst* next;
	}
}
