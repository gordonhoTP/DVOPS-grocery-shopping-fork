package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class ProductCollectionTest {
	
	private ProductCollection pc;
	private Product p1;
	private Product p2;
	private Product p3;
	private Product p4;
	private final int PRODUCT_COLLECTION_SIZE = 4;

	@BeforeEach
	void setUp() throws Exception {
		// Arrange
		pc = new ProductCollection();
		p1 = new Product("0001", "apple.png", "Apple","China Fuji apples have bright red stripes over its creamy yellow flesh.", 4.00);
		p2 = new Product("0002", "banana.png", "Banana","These bananas have a smooth bright yellow skin.", 3.18);
		p3 = new Product("0003", "orange.png", "Orange", "The mandarin is reddish-orange and oblate in shape with a soft, thin skin, which makes it easy to peel.", 2.3);
		p4 = new Product("0004", "pear.png", "Pear", "A fruit with a wide bottom, the Packham pear is green with dark spots on the skin.", 3.14);
		pc.addProduct(p1);
		pc.addProduct(p2);
		pc.addProduct(p3);
		pc.addProduct(p4);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetProducts() {
		
	}

	@Test
	void testAddProduct() {
		// fail("Not yet implemented");
				List<Product> testPc = pc.getProducts();
				// Assert that Song Collection is equals to song collection size 4
				assertEquals(testPc.size(), PRODUCT_COLLECTION_SIZE);
				// Act
				pc.addProduct(p1);
				// Assert that Song Collection is equals to song collection size 4 + 1
				assertEquals(pc.getProducts().size(), PRODUCT_COLLECTION_SIZE + 1);
	}

	@Test
	void testSortProductsByTitle() {
		fail("Not yet implemented");
	}

	@Test
	void testSortProductsByPrice() {
		fail("Not yet implemented");
	}

	@Test
	void testFindProductsById() {
		fail("Not yet implemented");
	}

	@Test
	void testFindProductByTitle() {
		fail("Not yet implemented");
	}

}
