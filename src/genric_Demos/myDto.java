package genric_Demos;





public class myDto
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