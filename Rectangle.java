class Shape{
	public static void main(String args[]){
		Rectangle r=new Rectangle();
		int ret;
		ret=r.Area();
		System.out.println("Area of Rectangle is: "+ret);
	}
}
class Rectangle{
	int length=10,breadth=10;
	public int Area(){
		return (length*breadth);
	}
}

