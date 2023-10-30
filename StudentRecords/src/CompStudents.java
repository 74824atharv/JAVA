
public class CompStudents extends Students {
	private int cid;
	private String cmarks;
	private String csubjects;
	public CompStudents() {
		super();
	}
	public CompStudents(int pid,String pname,int sid, int marks, String sname,int cid, String cmarks, String csubjects) {
		super(pid,pname,sid,marks,sname);
		this.cid = cid;
		this.cmarks = cmarks;
		this.csubjects = csubjects;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCmarks() {
		return cmarks;
	}
	public void setCmarks(String cmarks) {
		this.cmarks = cmarks;
	}
	public String getCsubjects() {
		return csubjects;
	}
	public void setCsubjects(String csubjects) {
		this.csubjects = csubjects;
	}
	public String toString() {
		return super.toString()+ "CompStudents [cid=" + cid + ", cmarks=" + cmarks
				+ ", csubjects=" + csubjects + "]";
	}

}
