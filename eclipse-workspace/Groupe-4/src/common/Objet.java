package common;


public class Objet {
	int x;
	int y;
	String type;
	public Objet(int x,int y)   
		{	this.x=x;
			this.y=y;
			
		}
 public	int get_x () {return x;}
 public	int get_y() {return y;}
 public String getType() {
	 return type ;
 }
 public	void set_x (int x) {this.x=x;}
 public	void set_y (int y) {this.y=y;}
}