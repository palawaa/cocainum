package ro.medii.beans;

public class Employee extends Person{

	@Override
	public void sayHi(){
		System.out.println("EMP::sayHi()");
	}
	
	// @Override
	public void sayHi(String elem){
		System.out.println("EMP::sayHi(String)");
	}
	
	@Override
	public void sayHi(int x){
		super.sayHi(32);
		System.out.println("Saying hi with an int :: Employee " + x);
	}

	@Override
	public void procMeth() {
		System.out.println("LOL");
	}
	
	@Override
	public void penis(){
		System.out.println("**************");
	}
	
	
}
