import java.util.Scanner;
public class IndianServices {
	static IndianTeam[]tarr;
	static int cnt;
	static{
		tarr=new IndianTeam[10];

		cnt=0;
	}
	// creation of new team
	public static void addIndianTeam()
	{ Scanner sc=new Scanner(System.in);
	 System.out.println("enter the team no\n");
	 int tno=sc.nextInt();
	 sc.nextLine();
	 System.out.println("enter the team name\n");
	 String tname=sc.nextLine();
	 // now add captain details
	 System.out.println("enter the captain player no\n");
	 int pno=sc.nextInt();
	 sc.nextLine();
	 System.out.println("enter the captain name\n");
	 String pname=sc.nextLine();
	 System.out.println("enter the captain skill \n");
	 String skill=sc.nextLine();
	 IndianPlayers p=new IndianPlayers(pno,pname,skill);
	 // accepting other player details
	IndianPlayers[] plist=new IndianPlayers[2];
	for(int i=cnt;i<plist.length;i++)
	{
		System.out.println("enter the player no");
	    pno=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the player name");
		pname=sc.nextLine();
		System.out.println("enter the player skill");
		skill=sc.nextLine();
		plist[i]=new IndianPlayers(pno,pname,skill);
	}
	 tarr[cnt]=new IndianTeam(tno,tname,p,plist);
	 cnt++;
	 }
	public static void displayTeam()
	{
		for(int i=0;i<cnt;i++)
		{
			System.out.println(tarr[i]);
		}
	}
	public static IndianTeam searchByCname(String nm)
	{  for(int i=0;i<cnt;i++)
	{
		if(tarr[i].getCaptain().getPname().equals(nm))
		{
			return tarr[i];
		}
	}
	
   return null;
}
	public static void searchByPname(String nm)
	{
		for(int i=0;i<cnt;i++)
		{
			IndianPlayers[] parr=tarr[i].getPlist();
			for(int j=0;i<parr.length;j++)
			{
				if(parr[i].getPname().equals(nm)) {
					System.out.println(tarr[i]);
				}
			}
		
		}
		
		
	}
		
	}
