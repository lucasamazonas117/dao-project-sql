package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// Project SQL
		
		Department d = new Department(117, "Books");
		Seller s = new Seller(21, "Gian", "lucasamazonas@gmail.com", new Date(), 5000.0, d);
		System.out.println(s);

	}

}
