package it.unibo.oop.lab05.ex4;

import java.util.Set;
import java.util.TreeSet;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.WarehouseImpl;

public class OrderedWarehouse extends WarehouseImpl{

	public OrderedWarehouse() {
		super();
	}
	
	public Set<Product> allProducts() {
		Set <Product> orderedProducts = new TreeSet <Product>(); //crea una copia del Set di prodotti, ma utilizza TreeSet
		for(Product p : super.allProducts()) { //Perchè esso permette un ordine tra gli elementi e utilizza il CompareTo dentro a ComparableProduct
			orderedProducts.add(p);
		}
		return orderedProducts;
	}
}
