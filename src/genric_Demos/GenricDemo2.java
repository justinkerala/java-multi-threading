package genric_Demos;

public class GenricDemo2 {

	public static void main(String[] args) {
      //object of my DTO
		myDto myDtoObj=new myDto(12,"Thomas","Edison");
		
		 
      //passed to genric class
		Gen_Class gClass=new Gen_Class<myDto>(myDtoObj);
		
		gClass.showType();
		
		myDto m=(myDto) gClass.getT();
		System.out.println(m.getFname()+"  "+m.getLname()+" "+m.getRollNo());
		
		
	}
	
}

 class Gen_Class<T>
{

	T ob;
public Gen_Class(T t) {
	// TODO Auto-generated constructor stub
ob=t;

}
T getT()
{
return ob;	
}


void showType()
{
	
	System.out.println(ob.getClass().getName());
 
}


}





class myDto
{
int rollNo;
String fname;
public myDto(int rollNo, String fname, String lname) {
	super();
	this.rollNo = rollNo;
	this.fname = fname;
	this.lname = lname;
}
String lname;
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}



}