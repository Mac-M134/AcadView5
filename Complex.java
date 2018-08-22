import java.util.Scanner;
class Complex{
	public static void main(String args[]){
		Num N=new Num();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter real part: ");
		int rea=s.nextInt();
		System.out.print("Enter imaginary part: ");
		int ima=s.nextInt();
		N.getData(rea,ima);
		N.Display();
	}
}

class Num{
	
		int real,imag;
	
	void getData(int r,int i){
		real=r;
		imag=i;
	}
	void Display(){
		System.out.printf(" %d + %d i",real,imag);

	}
}






