package entity;

public class Item {
    
	
	
    private	String ItemName;//��Ʒ��
    private int ItemPrice;//��Ʒ�۸�
    private String location;//��Ʒ����
    private String picture;//��ƷͼƬ
    private String comments;//��Ʒ����
    
    
    public Item(){}
    
    
    
    
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public int getItemPrice() {
		return ItemPrice;
	}
	public void setItemPrice(int itemPrice) {
		ItemPrice = itemPrice;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
}
