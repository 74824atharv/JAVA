
public class Students extends Persons{
	private int sid;
	private int marks;
	private String sname;
	public Students() {
		super();
	}
	public Students(int pid,String pname,int sid, int marks, String sname) {
		super(pid,pname);
		this.sid = sid;
		this.marks = marks;
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String toString() {
		return super.toString()+"Students [sid=" + sid + ", marks=" + marks + ", sname=" + sname
				+ "]";
	}

}
