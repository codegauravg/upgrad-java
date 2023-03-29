class RectangleOne{
	//old method
	@Deprecated
	public void showNameOfClass(){
		System.out.println("Rect");
	}
	
	public void printNameOfClass(){
		System.out.println("Rectangle");
	}
}


public class AnnotationDemo{
	public static void main(String[] args){
		RectangleOne r = new RectangleOne();
		r.showNameOfClass();
		r.printNameOfClass();
	}	
}