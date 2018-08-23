import java.util.Scanner;
class SecondL{
	public static void main(String args[]){
		Scanner n=new Scanner(System.in);
        	System.out.print("Enter number of elements in array: ");
        	int num=n.nextInt();
        	int arr[]=new int[num];
		int temp,nume;
		System.out.print("Enter elements : ");
		for(int k=0;k<num;k++){
			nume=n.nextInt();
			arr[k]=nume;
		}
		for(int i=0;i<(num-1);i++){
			for(int j=0; j<num-i -1;j++){
				if(arr[j]>arr[j+1])
						swap(arr,j,j+1);
			}
		}
		
			System.out.print("Second Largest is: "+arr[num-2]);
	
	}

	static int[] swap(int ar[],int m,int n){
		int temp;
		temp=ar[m];
		ar[m]=ar[n];
		ar[n]=temp;
		return ar;
	}
}



