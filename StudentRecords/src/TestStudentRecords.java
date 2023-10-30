
public class TestStudentRecords {

	public static void main(String[] args) {
		Students s1=new Students(23,"Atharva\n",37,80,"Rutvik");
	   System.out.println(s1);
	   MechStudents m1=new MechStudents(24,"Rutvik\n",38,90,"Omkar\n",55,98,"DOM");
	   System.out.println(m1);
	   CompStudents c=new CompStudents(25,"Adwait\n",37,92,"Devesh\n",55,"98","ML");
	   System.out.println(c);
	   Students s2=new MechStudents(); //implicit upcasting
       ((MechStudents)s2).getMid();
       
	}

}
