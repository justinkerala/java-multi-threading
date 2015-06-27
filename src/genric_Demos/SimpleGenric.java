package genric_Demos;

 

public class SimpleGenric {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gen<Integer>iOb;
		//used auto boxing to insert an Integer
		//cant use primitive types. use of primitive is illegal
		iOb=new Gen<Integer>(123);
		//iOb=new Gen(89);-->can also be used
		iOb.showType();
		
		int v=iOb.getob();
		System.out.println("value: "+v);
		
		//creating gen object for string 
		
		Gen<String>strObj=new Gen<String>("My first genric example");
		strObj.showType();
		
		String str=strObj.getob();
	
		System.out.println("value :"+str);
		
		
	iOb= new Gen<Integer>(21);
	Gen<Integer>iOb2=new Gen<Integer>(54);	
	strObj.add(iOb, iOb2);
		
	}

	
	
}

 
class Gen<T>
{
T ob;
public Gen(T o) {
	// TODO Auto-generated constructor stub
ob=o;
}
//Return object
 T getob()
 {
	 
	 return ob;
 }
//show type of T
 
 void showType()
 {
	 System.out.println("Type of T is "+ ob.getClass().getName());
	 
 }
 
 void add(Gen<Integer> iOb,Gen<Integer> iOb2)
 {
 //A method which uses Genric type	  
		 int a=   iOb.getob()+iOb2.getob();
		 System.out.println(a);
	   
 }

  
//Book Refered:Java Complete Reference
 
}


  