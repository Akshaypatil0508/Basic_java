package que3;


public class Testdate {

	public static void main(String[] args) {
		date d1 = new date();
		d1.setDd(11);
		d1.setMm(11);
		d1.setYy(2011);
		System.out.print("My BirthDate using mutators ans accessors:\t");
		System.out.println(d1.getDd()+"—"+d1.getMm()+"—"+d1.getYy());
		
		System.out.println("");
		date d2 = new date();
		
		System.out.println("");
		date d3 = new date(22,12,2022);
	}

}
/*output
My Birthdate using No argument Constructor:	9—1—1996
My BirthDate using mutators ans accessors:	11—11—2011

My Birthdate using No argument Constructor:	9—1—1996

My Birthdate using Parameterized Constructor:	22—12—2022
*/
