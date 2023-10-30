
public class Persons {
	private int pid;
	private String pname;

	public Persons() {
		super();
	}
	public Persons(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
		
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
	public String toString() {
		return "Persons [pid=" + pid + ", pname=" + pname ;
	}


}
