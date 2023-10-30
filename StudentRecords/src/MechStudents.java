
public class MechStudents extends Students {
   private int mid;
   private int mmarks;
   private String suname;
public MechStudents() {
	super();
}
public MechStudents(int pid,String pname,int sid, int marks, String sname,int mid, int mmarks, String suname) {
	super(pid,pname,sid,marks,sname);
	this.mid = mid;
	this.mmarks = mmarks;
	this.suname = suname;
}
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public int getMmarks() {
	return mmarks;
}
public void setMmarks(int mmarks) {
	this.mmarks = mmarks;
}
public String getSname() {
	return suname;
}
public void setSname(String sname) {
	this.suname = sname;
}
public String toString() {
	return super.toString()+"MechStudents [mid=" + mid + ", mmarks=" + mmarks + ", sname="
			+ suname + "]";
}
}
