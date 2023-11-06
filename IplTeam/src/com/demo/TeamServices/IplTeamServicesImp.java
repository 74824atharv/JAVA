package com.demo.TeamServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Players;
import com.demo.beans.Team;

public class IplTeamServicesImp implements IplTeamServices
{  
	//static int cnt;
    static List<Team> lst=new ArrayList<Team>();
    
    @SuppressWarnings("unchecked")
	public void addNewTeam() 
	{  Scanner sc=new Scanner(System.in);
	   System.out.println("Enter team no");
	   int tno=sc.nextInt();
	   sc.nextLine();
	   System.out.println("Enter team name");
	   String tname=sc.next();
	   System.out.println("Enter Coach name");
	   String coachname=sc.next();
	   
	   List<Players>elist=new ArrayList<Players>(2);
	   for(int i=0;i<2;i++)
	   {
		  System.out.println("Enter player no");
	      int pno=sc.nextInt();
	      sc.nextLine();
	      System.out.println("Enter player name");
	      String pname=sc.next();
	      System.out.println("Enter player Skill");
	      String Skill=sc.next();
	      elist.add(new Players(pno,pname,Skill)) ;
	     }
	  lst.add(new Team(tno,tname,coachname,elist));
	 
    }
    public void displayTeam() 
    {
    System.out.println(lst);
    
 }
}
	
