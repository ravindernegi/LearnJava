package rav.example;

public class ExampleAndOr {

	public static void main(String[] args) {
		int x = 10;
		int y = -10;
		if(x > 0 && y > 0){
			System.out.println("Both Number are +ve");
		}else if(x > 0 || y > 0){
			System.out.println("at least one Number is +ve");
		}else {
			System.out.println("Both Number are -ve");
		}
	}

}
