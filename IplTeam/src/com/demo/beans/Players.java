package com.demo.beans;

public class Players {
	
		private int pno;
		private String pname;
		private String Skill;
		public Players() {
			super();
		}
		public Players(int pno, String pname, String Skill) {
			super();
			this.pno = pno;
			this.pname = pname;
			this.Skill = Skill;
		}
		public int getPno() {
			return pno;
		}
		public void setPno(int pno) {
			this.pno = pno;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public String getSkill() {
			return Skill;
		}
		public void setSkill(String skill) {
			Skill = skill;
		}
		@Override
		public String toString() {
			return "Players [pno=" + pno + ", pname=" + pname + ", Skill=" + Skill + "]";
		}
		
	}


