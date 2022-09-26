package javaArrayProgrammes;

public class ThirdHighestNumberWithForLoop {

	
	public static int getThirdLargest(int[] a,int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}return a[total-3];
	}
	
	public static void main(String[] args) {
	
	int c[]= {1,3,6,9,10,15};
	int b[]= {55,10,66,15,23};
	
	System.out.println("Third Largest:"+ getThirdLargest(c, 6));
	System.out.println("Third Largest:" + getThirdLargest(b, 5));
	
	}

}
