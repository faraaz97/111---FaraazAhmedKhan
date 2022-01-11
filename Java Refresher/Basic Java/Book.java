import java.util.Scanner;
public class Book {
	private String name;
	private int pages;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
		price=pages*10;
	}
	public double getPrice() {
		return price;
	}
	
	
}
	
	
	
	
	

