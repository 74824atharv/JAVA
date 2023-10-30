
public class IndianPlayers {
	private int pno;
	private String pname;
	private String Skill;
	public IndianPlayers() {
		super();
	}
	public IndianPlayers(int pno, String pname, String skill) {
		super();
		this.pno = pno;
		this.pname = pname;
		Skill = skill;
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
	public String toString() {
		return "IndianPlayers [pno=" + pno + ", pname=" + pname + ", Skill="
				+ Skill + "]";
	}

}
