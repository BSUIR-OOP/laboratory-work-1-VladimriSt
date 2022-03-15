package forms.pack;
    public class Form {
       private boolean visible;
       private String color;
       private int lineWidth;
       
       public int getLineWidth() {return lineWidth;}
       public boolean getVisible() {return visible;}
       public String getColor() {return color;}

       public void setVisible(boolean visible) {this.visible = visible;}
       public void setColor(String color) { this.color = color;}
       public void setLineWidth(int lineWidth) { this.lineWidth = lineWidth;}
       
       public Form(boolean visible, String color, int lineWidth) {
    	    this.visible = visible;
    	    this.color = color;
    	    this.lineWidth = lineWidth;
       }
    }