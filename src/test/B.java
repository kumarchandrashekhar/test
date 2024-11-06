package test;

public final class B {
	
	
	private final int id;
	
	private final String name;

	public B(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
	public static void main(String[] args) {
		 B b1= new B(1,"shekhar");
		 
		 System.out.println(b1.getId());
		 System.out.println(b1.getName());
		 
		 System.out.println(b1);
	}
	
	
	
	
	
	

	
	

}
