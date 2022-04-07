package forms.pack;

import set_print_props.pack.PrintPropeties;

public class Forms_List {
	Forms_List next;
	Object lst_el;
	
    private Forms_List head;  
    private Forms_List tail;   
    public void addFront(Object lst_el)
    {
    	Forms_List a = new Forms_List();  
    	a.lst_el = lst_el;          
       
        if(head == null)        
        {                      
            head = a;            
            tail = a;
        }
        else {
            a.next = head;    
            head = a;    
        }
    }

    public void printList()             
    {
    	PrintPropeties x = new PrintPropeties();
    	Forms_List t = this.head;       
        while (t != null)           
        	{
        	x.foo(t.lst_el);
            t = t.next;                   
        }
        System.out.println();
    }

    public void delEl(Object lst_el)       
    {
        if(head == null)     
            return;           

        if (head == tail) {  
            head = null;      
            tail = null;
            return;            
        }

        if (head.lst_el == lst_el) {
            head = head.next;      
            return;              
        }

        Forms_List t = head;    
        while (t.next != null) {  
            if (t.next.lst_el == lst_el) { 
                if(tail == t.next)     
                {
                    tail = t;      
                }
                t.next = t.next.next;  
                return;                
            }
            t = t.next;              
        }
    }

	
}