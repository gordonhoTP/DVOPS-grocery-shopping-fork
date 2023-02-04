package com.dvops.maven.eclipse;

import java.util.Comparator;
import java.util.Objects;

public class Product {
	private String id;
	private String image;
	private String title;
	private String subTitle;
	private double price;

	/**
	 * @param id
	 * @param image
	 * @param title
	 * @param subTitle
	 * @param price
	 */
	public Product(String id, String image, String title, String subTitle, double price) {
		super();
		this.id = id;
		this.title = title;
		this.image = image;
		this.subTitle = subTitle;
		this.price = price;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param artiste the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}
	
	/**
	 * @return the subTitle
	 */
	public String getsubTitle() {
		return subTitle;
	}

	/**
	 * @param artiste the image to set
	 */
	public void setsubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(subTitle, id, image, title, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Product))
			return false;
		Product other = (Product) obj;
		return Objects.equals(subTitle, other.subTitle) && Objects.equals(id, other.id)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title)&& Objects.equals(image, other.image);
	}

	public static Comparator<Product> titleComparator = new Comparator<Product>() {
		@Override
		public int compare(Product p1, Product p2) {
			return (int) (p1.getTitle().compareTo(p2.getTitle()));
		}
	};

	public static Comparator<Product> productPriceComparator = new Comparator<Product>() {
		@Override         
	    public int compare(Product p1, Product p2) {             
	      return (p2.getPrice() < p1.getPrice() ? -1 :                     
	              (p2.getPrice() == p1.getPrice() ? 0 : 1));           
	    }     
	};
}
