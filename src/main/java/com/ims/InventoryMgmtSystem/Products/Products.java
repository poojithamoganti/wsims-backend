package com.ims.InventoryMgmtSystem.Products;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Products {


    @Id
    private String id;
    @Column
    private String item_no;
    @Column
    private String model_no;
    @Column
    private String supplier_name;
    @Column
    private int quantity;

    public Products() {
    }
    
    public Products(String id, String item_no, String model_no, String supplier_name, int quantity) {
        this.id = id;
        this.item_no = item_no;
        this.model_no = model_no;
        this.supplier_name = supplier_name;
        this.quantity = quantity;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItem_no() {
		return item_no;
	}

	public void setItem_no(String item_no) {
		this.item_no = item_no;
	}

	public String getModel_no() {
		return model_no;
	}

	public void setModel_no(String model_no) {
		this.model_no = model_no;
	}

	public String getSupplier_name() {
		return supplier_name;
	}

	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

   
}