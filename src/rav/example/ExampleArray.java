package rav.example;

public class ExampleArray {

	public static void main(String[] args) {
		/*int a = 10;
		int b = 20;
		int c, d ,e;
		c = 20; d = 50; e = 62;*/
		int[] a = {10,20,20,50,45};
		
		System.out.println(a[1] + " " +a[4]);
		
		for(int temp : a){
			System.out.println(temp);
			
		}
	}

}
