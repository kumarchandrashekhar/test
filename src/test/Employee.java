package test;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public final class Employee {
	
    private final String name;
    private final List<String> skills;
    

    public Employee(String name, List<String> skills) {
        this.name = name;
        // Make a defensive copy of the mutable List to ensure immutability
        this.skills = Collections.unmodifiableList(skills);
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        // Return an unmodifiable view of the skills list to ensure immutability
        return skills;
    }
    
  
   
   
   
    
    
    public static void main(String[] args) {
    	
    	 List<String> skills=new ArrayList<String>();
    	 skills.add("English");
    	 skills.add("maths");
    	 skills.add("English");
    	 
    	 
		Employee e1= new Employee("kumar",skills);
		Employee e2= new Employee("shekhar",skills);
		Employee e3= new Employee("kumar",skills);
//		System.out.println(e1.getSkills());
//		System.out.println(e2.getSkills());
//		
//		System.out.println(e1.getSkills().equals(e3.getSkills()));
		
		System.out.println(e1==e3);
		
		
	}
}
