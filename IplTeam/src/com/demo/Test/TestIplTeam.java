//Write a program to store information about IPL teams in ArrayList
//Create Team class to store teamid, tname, coachname, and list of players.
//and perform following operations
//1. add new Team
//2. delete a team
//3. delete a player from team(accept player id to delete)
//4. display all batsman
//5. display all player with a speciality(accept speciality from user)
//6. add a new player in a team
//7. modify coach of a team
//8. exit
package com.demo.Test;

import java.util.Scanner;

import com.demo.TeamServices.IplTeamServicesImp;

public class TestIplTeam {

	public static void main(String[] args) 
	{ 
	IplTeamServicesImp t=new IplTeamServicesImp();
	int choice;
	Scanner sc =new Scanner(System.in);
	do {
	  System.out.println("1.Add new team\n 2.delete a team\n 3.delete player by id");
	  System.out.println("4.display all batsman\n5. display player by skill\n6.add new player in a team");
	  System.out.println("7.update coach of a team\n 8.Exit");
	  System.out.println("Enter your choice\n");
	  choice=sc.nextInt();
	  switch(choice)
	  {
	  case 1:
		t.addNewTeam();
		break;
	  case 2:
		 t.displayTeam();
		 break;
	  
	  
	  
	  
	  
	  }
	}
	while(choice!=9);
	
	

	}

}
