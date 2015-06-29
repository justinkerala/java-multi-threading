package lambda_Expression_Demos;

import java.util.ArrayList;
import java.util.function.Consumer;

import genric_Demos.myDto;

public class lambdaFirst {
public static void main(String[] args) {
	
	ArrayList<myDto>md=new ArrayList<myDto>();
	
	md.add(new myDto(1, "prakash", "kumar"));
	md.add(new myDto(2, "sam", "manohar"));
	md.add(new myDto(3, "kaushik", "mano"));
	md.add(new myDto(4, "prabhu", "babu"));
	md.add(new myDto(5, "nila", "manus"));
	
 	md.forEach((myDto val)->System.out.println(val.getFname()));
    md.forEach(value -> System.out.println(value));
 
    md.forEach(System.out::println);
    
    
    
    
    
    
    
    
    
}
}
