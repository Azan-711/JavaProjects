package movie;

public class Rental_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie m1,m2,m3;
		Customer c1;
		m1=new Movie("LOTR",2);
		m2=new Movie("RAID",1);
		c1 = new Customer("Rakesh");
		c1.addRental(new Rental(m1,4));
		c1.addRental(new Rental(m2,5));
		System.out.println(c1.statement());

	}

}
