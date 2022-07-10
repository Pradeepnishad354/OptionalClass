package com.ref;

import java.util.Optional;

public class OptionalExample {
	
	//method
	public static Optional<String> getName(){
		
		String name="pradeep";
		return Optional.ofNullable(name);
	}
	
	
	
	public static void main(String[] args) {
		
		String str="This is optinal class";
		
//		if(str==null) {
//			System.out.println("this is null");
//		}else 
//		{
//			
//			System.out.println(str.length());
//		}
//	}
	Optional<String> optional=Optional.ofNullable(str);	
	
	System.out.println(optional.isPresent());
	
	System.out.println(optional.get());
	
	System.out.println(optional.orElse("no value in this object"));
	
	
	// method 
	
	
	Optional<String> nameOptional =getName();
	
	System.out.println(nameOptional.orElse("null return"));
	
	
	}

}
