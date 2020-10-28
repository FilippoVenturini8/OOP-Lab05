package it.unibo.oop.lab05.ex3;

import java.util.LinkedHashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse{
	private Set <Product> products;
	
    public WarehouseImpl () {
    	this.products = new LinkedHashSet <Product>();
    }

	public void addProduct(Product p) {
		this.products.add(p);
	}

	public Set<String> allNames() {
		Set<String> names = new LinkedHashSet <String>();
		for(Product p : this.products) {
			names.add(p.getName());
		}
		return names;
	}

	public Set<Product> allProducts() {
		return Set.copyOf(this.products);
	}

	public boolean containsProduct(Product p) {
		return this.products.contains(p);
	}

	public double getQuantity(String name) {
		for(Product p : this.products) {
			if(p.getName() == name) {
				return p.getQuantity();
			}
		}
		return 0;
	}
}
