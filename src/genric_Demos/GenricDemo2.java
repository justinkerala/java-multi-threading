package genric_Demos;

public class GenricDemo2 {

	public static void main(String[] args) {
      //object of my DTO
		myDto myDtoObj=new myDto(12,"Thomas","Edison");
		
		 
      //passed to genric class
		Gen_Class<myDto> gClass=new Gen_Class<myDto>(myDtoObj);
		
		gClass.showType();
	
		//caste
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

