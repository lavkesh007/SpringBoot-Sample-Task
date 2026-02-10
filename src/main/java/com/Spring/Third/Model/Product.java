package com.Spring.Third.Model;




public class Product {
	private int id;
	private String Name;
	private String Description;
	public Product(int id, String name, String description) {
		super();
		this.id = id;
		Name = name;
		Description = description;
	}
	public Product(String name, String description) {
		super();
		Name = name;
		Description = description;
	}
	public Product() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", Name=" + Name + ", Description=" + Description + "]";
	}
	
	
}
