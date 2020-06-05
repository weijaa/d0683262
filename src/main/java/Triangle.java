
public class Triangle {
	
//    public static void main(String[] args) {
//        double a = 100, b = 4, c = 5; 
//        try { 
//        	checkTriangle(a, b, c);
//        } catch (WrongTriangleException e) {
//        	e.printStackTrace();
//		}
//	}
    public String checkTriangle( double a, double b, double c)  { //throws WrongTriangleException {
		if (a <= 0 || b <= 0 || c <= 0) {
//			throw new WrongTriangleException();
			return "不是三角形";
		}
		else if (a + b < c || a + c < b || b + c < a) {
//			throw new WrongTriangleException();
			return "不是三角形";
		}
		else if (a * a + b * b == c * c || a * a + c * c == b * b || c * c + b * b == a * a) {
//			System.out.println("直角三角形");
			return "直角三角形";
		}
		else if (a == b && a == c) {
//			System.out.println("正三角形");
			return "正三角形";
		} 
		else if (a == b || a == c || b == c) 
		{
//			System.out.println("等腰三角形");
			return "等腰三角形";
		}
		else {
//			System.out.println("三角形");
			return "三角形";
		}
    }
}

class WrongTriangleException extends Exception {
	WrongTriangleException(final String title) {
		super(title);
	}

	public WrongTriangleException() {
		super("Not a triangle!!!");
	}
}