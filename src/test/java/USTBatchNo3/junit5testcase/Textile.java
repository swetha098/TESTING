package USTBatchNo3.junit5testcase;

public class Textile {
	private String item;
	private int count;
	private double price;
	
	public double getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count=count;
	}
	
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Textile [item=" + item + ", count=" + count + ", price=" + price + "]";
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Textile( String item, int count, double price) {
		super();
		this.item=item;
		this.count = count;
		this.price = price;
		
	}
	
	}



