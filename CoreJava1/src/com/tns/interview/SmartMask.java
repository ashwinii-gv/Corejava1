package com.tns.interview;
import java.util.Scanner;
public class SmartMask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int totalorder=0;
		for(int i=1;i<=10;i++)
		{
			System.out.println("enter the pincode"+i+"");
			int pincode=scanner.nextInt();
			if(pincode%2==0)
			{
				totalorder+=100;
			}
		}
		System.out.println("total order placed for mask:"+totalorder);
			}
	
}
