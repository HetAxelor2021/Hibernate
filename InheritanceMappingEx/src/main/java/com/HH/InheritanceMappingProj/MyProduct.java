package com.HH.InheritanceMappingProj;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance
(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="product_type",discriminatorType = DiscriminatorType.INTEGER)
public class MyProduct {
	@Id
	private long  productId;
	private String name;
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "MyProduct [productId=" + productId + ", name=" + name + "]";
	}
	
}
