package ro.medii.beans;

public class Person {

	public void sayHi(){
		System.out.println("Person sez Allahu Akhbar!");
	}
	
	protected void sayHi(int x){
		
		System.out.println("saying hi with an int! :: Person " + x);
	}
	
	protected void procMeth(){
		System.out.println("PERSON.procMeth()");
	}
	
	public void penis(){
		System.out.println("---------");
	}
}
