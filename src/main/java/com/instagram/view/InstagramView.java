package com.instagram.view;
import java.util.Scanner;

import com.instagram.controller.InstagramController;
import com.instagram.controller.InstagramControllerInterface;

public class InstagramView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("***********Main Menu*********");
	       System.out.println("press 1 to create ptofile");
	       System.out.println("press 2 to view profile");
	       System.out.println("press 3 to delete profile");
	       System.out.println("press 4 to edit profile");
	       System.out.println("press 5 to search profile");
	       System.out.println("press 7 to login profile");
	       
	       Scanner sc=new Scanner(System.in);
	       
	       int v=sc.nextInt();
	       
	       InstagramControllerInterface ic=new InstagramController();
	       
	       switch(v) {
	       case 1:
	    	   ic.viewLoginpage();
	    	   break;
	       }
	}

}
