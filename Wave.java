import java.util.Scanner;
class Wave{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int arr[]=new int[10];
		int num;
		System.out.print("Enter elements: ");
		for(int i=0;i<10;i++){
			num=s.nextInt();
			arr[i]=num;		
		
		}
		System.out.print("\n Normal Form: \n");
		for(int y:arr){
			System.out.print(y+" ");
		}
	
		for(int i=0;i<=8;i+=2){
			swap(arr,i+1,i);
		}
		System.out.print("\n Wave Form: \n");
		for(int z:arr){
			System.out.print(z+" ");
		}
	}
	static int[] swap(int ar[],int j,int k){
		int temp;
		temp=ar[j];
		ar[j]=ar[k];
		ar[k]=temp;
		return ar;

	}


}

