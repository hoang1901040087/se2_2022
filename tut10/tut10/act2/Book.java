package se2.tut10.act2;

public class Book {

	private String author, title;
	private double price;

//	constructor
	public Book(String author, String title, double price) {
		this.setAuthor(author);
		this.setTitle(title);
		this.setPrice(price);
	}

//	getter setter

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {		
		if(!validateAuthor(author)){
			throw new IllegalArgumentException("Author not valid!");
		}
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title.length() < 3) {
			throw new IllegalArgumentException("Title not valid!");
		}
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 1) {
			throw new IllegalArgumentException("Price not valid!");
		}
		this.price = price;
	}
	
//	validate
	private boolean validateAuthor(String author) {
		
		String[] authors = author.split(" ");
		for (String a : authors) {
			if(a.matches("^\\d.*")) return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "Book [author=" + this.getAuthor() + ", title=" + this.getTitle() + ", price=" + this.getPrice() + "]";
	}

}
