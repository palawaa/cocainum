package ex1;

public class Main {

	public static void main(String[] args) {

		System.out.println("lol");
		
		Movie id = new Movie();
		Details idDetails = new Details();
		id.setDetails(idDetails);
		idDetails.title = "Independence Day";
//		id.title = "Independence Day"; // id.title = new String("Inde...
		
		
		
		Series ser1 = new Series();
		Details ser1Details = new Details();
		ser1Details.title = "True Detective";
		ser1.setDetails(ser1Details);
//		ser1.title = "True Detective";

		Details penis = ser1.getDetails();
		System.out.println(penis.title);
		System.out.println(ser1.getDetails().title);
		System.out.println(id.getDetails().title);
//		System.out.println(id.title);
		
		Animei a = new Animei();
//		a.title = "Buricho";
	}

}
