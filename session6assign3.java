package acadgild.assignments;

class Square implements Shape{
	
		
	public void draw(){
		
		System.out.println("Draw shape of a square!");
		
			
	}
	
	public void getArea(double i){
		
		System.out.println("Area of a Square is :"+(i*i));
	}
	
	
}


class Circle implements Shape{
	
	double pi=3.14;
	
public void draw(){
	
	System.out.println("Draw shape of a Circle!");
	
		
	}

public void getArea(double i){
	
	System.out.println("Area of a Circle is :"+(pi*i*i));
	}
	
}


public class session6assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square shape1 = new Square();
		shape1.draw();
		shape1.getArea(12.5);
		System.out.println();
		
		Circle shape2=new Circle();
		shape2.draw();
		shape2.getArea(3.5);
		
		
		

	}

}
