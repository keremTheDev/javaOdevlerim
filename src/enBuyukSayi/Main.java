package enBuyukSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int enBuyuk = 0;
		int first;
		int second;
		int third;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1. sayıyı giriniz: ");
		first = input.nextInt();
		
		System.out.print("2. sayıyı giriniz: ");
		second = input.nextInt();
		
		System.out.print("3. sayıyı giriniz: ");
		third = input.nextInt();
		
		if(first>second && first > third) 
		{
			enBuyuk = first;
		}
		else if(first<second && second > third) 
		{
			enBuyuk = second;
		}
		else if(third>second && second < third) 
		{
			enBuyuk = third;
		}
		
		System.out.println("En buyuk sayi = " + enBuyuk);
		
	}

}
