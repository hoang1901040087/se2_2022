package se2.tut10.act2;

public class GoldenEditionBook extends Book{

	public GoldenEditionBook(String author, String title, double price) {
		super(author, title, price);
	}
	
	@Override
	public double getPrice() {
		return super.getPrice() + super.getPrice()*0.3;
	}

//	@Override
//	public String toString() {
//		return "Golden edition book [author=" + this.getAuthor() + ", title=" + this.getTitle() + ", price=" + this.getPrice() + "]";
//	}
	
}
