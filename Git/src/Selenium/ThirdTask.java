package Selenium;

import java.util.Scanner;

public class ThirdTask{

		    public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("enter a string");
		        String str=sc.nextLine();

		        str=str.replaceAll("s", "");
		        System.out.println(str);

		    } 

	}


