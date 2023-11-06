package com.demo.beans;

import java.util.ArrayList;
import java.util.List;

public class Team 
{ private int tno;
  private String tname;
  private String coachname;
  static List<Players> elist;

public Team(int tno, String tname, String coachname, List<Players> elist) 
{
	super();
	this.tno = tno;
	this.tname = tname;
	this.coachname = coachname;
	this.elist=elist;
}
public int getTno() {
	return tno;
}
public void setTno(int tno) {
	this.tno = tno;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String getCoachname() {
	return coachname;
}
public void setCoachname(String coachname) {
	this.coachname = coachname;
}
public static List<Players> getElist() {
	return elist;
}
public static void setElist(List<Players> elist) {
	Team.elist = elist;
}
@Override
public String toString() {
	return "Team [tno=" + tno + ", tname=" + tname + ", coachname=" + coachname + "]";
}

}
