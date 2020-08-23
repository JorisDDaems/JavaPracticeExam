package be.intecbrussel.MerkProducten;

import java.util.List;

public class TestApp {
	public static void main(String[] args) {

		Bestelling bestelling = new Bestelling();
		List<Product> lijst = Data.getData();

		for (Product artikel : lijst) {
			bestelling.voegProductToe(artikel);
		}
		bestelling.sorteerOpMerk();

		/*
		bestelling.toonList();

		System.out.println("\nVan het merk Georgio Aramni:");
		bestelling.toonPerMerk("Georgio Armani");

		System.out.println("\nAlle Parfums:");
		bestelling.toonParfums();

		Product product = bestelling.zoekDuursteProduct();
		System.out.println("\nDuurste product:\n" + product);

		 */

		System.out.printf("\nTotale prijs: %.2f", bestelling.totalePrijs());
	}

}
