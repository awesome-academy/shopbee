package app.model;
// Generated Feb 21, 2019 7:34:52 PM by Hibernate Tools 3.5.0.Final

import java.util.Date;
import java.util.List;

/**
 * Products generated by hbm2java
 */
public class Product implements java.io.Serializable {

	private Integer id;
	private Category category;
	private String productName;
	private float priceIn;
	private float priceOut;
	private Integer discount;
	private String images;
	private String description;
	private Date createDate;
	private int quantity;
	private Integer coutView;
	private Integer countBuy;
	private Boolean status;
	private List<OrderDetail> orderDetails;
	private List<Category> categories;

	public Product() {
	}

	public Product(Category category, String productName, float priceIn, float priceOut, int quantity) {
		this.category = category;
		this.productName = productName;
		this.priceIn = priceIn;
		this.priceOut = priceOut;
		this.quantity = quantity;
	}

	

	public Product(Integer id, Category category, String productName, float priceIn, float priceOut, Integer discount,
			String images, String description, Date createDate, int quantity, Integer coutView, Integer countBuy,
			Boolean status, List<OrderDetail> orderDetails, List<Category> categories) {
		super();
		this.id = id;
		this.category = category;
		this.productName = productName;
		this.priceIn = priceIn;
		this.priceOut = priceOut;
		this.discount = discount;
		this.images = images;
		this.description = description;
		this.createDate = createDate;
		this.quantity = quantity;
		this.coutView = coutView;
		this.countBuy = countBuy;
		this.status = status;
		this.orderDetails = orderDetails;
		this.categories = categories;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPriceIn() {
		return this.priceIn;
	}

	public void setPriceIn(float priceIn) {
		this.priceIn = priceIn;
	}

	public float getPriceOut() {
		return this.priceOut;
	}

	public void setPriceOut(float priceOut) {
		this.priceOut = priceOut;
	}

	public Integer getDiscount() {
		return this.discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public String getImages() {
		return this.images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Integer getCoutView() {
		return this.coutView;
	}

	public void setCoutView(Integer coutView) {
		this.coutView = coutView;
	}

	public Integer getCountBuy() {
		return this.countBuy;
	}

	public void setCountBuy(Integer countBuy) {
		this.countBuy = countBuy;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	
}
