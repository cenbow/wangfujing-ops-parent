/**
 * @Probject Name: shopin-back-demo
 * @Path: com.wangfj.back.viewProductsVO.java
 * @Create By chengsj
 * @Create In 2013-5-10 下午3:25:10
 * TODO
 */
package com.wangfj.back.view;

import java.io.Serializable;

/**
 * @Class Name ProductsVO
 * @Author chengsj
 * @Create In 2013-5-10
 * 
 * 这个是给选品系统返回的VO对象
 * 
 */
public class ProductResultVO implements Serializable{
	//==========modify by chengsj start
	private String shopName;//所在门店
	private String totalSumMoney;//已销售金额
	private String totalSaleSum;//已销售数量
	private String updatePriceTime;//变价时间
	//=========modify by chengsj end
	
	private String brandSid;       //品牌id
    private String bannerId; //栏目id
    private String proSku;
    private String proDesc;
    private String productName;
    private String proCurPrice;
    private String proOldPrice;
    private String proPmtPrice;
    private String proStock;
    private String brandName;
    private String offValue; //商品折扣
    private Boolean dgSelected=false;
    private String productImages;  //商品图片
    private String proClass;  //商品网站分类
    private String sexSid;  //性别
    private String orderNumber;  //顺序号
    private String proSellingTime;  //上架时间
    private String saleCode;
    private String sid;
    
    
    
    

    public String getSid() {
		return sid;
	}

	public void setSid(Long sid) {
		this.sid = sid.toString();
	}

	public String getProPmtPrice() {
		return proPmtPrice;
	}

	public void setProPmtPrice(String proPmtPrice) {
		this.proPmtPrice = proPmtPrice;
	}

	public String getSaleCode() {
		return saleCode;
	}

	public void setSaleCode(String saleCode) {
		this.saleCode = saleCode;
	}

	public String getProSellingTime() {
        return proSellingTime;
    }

    public void setProSellingTime(String proSellingTime) {
        this.proSellingTime = proSellingTime;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getSexSid() {
        return sexSid;
    }

    public void setSexSid(String sexSid) {
        this.sexSid = sexSid;
    }

    public String getProClass() {
        return proClass;
    }

    public void setProClass(String proClass) {
        this.proClass = proClass;
    }

    public String getProductImages() {
        return productImages;
    }

    public void setProductImages(String productImages) {
        this.productImages = productImages;
    }

    public String getOffValue() {
        return offValue;
    }

    public void setOffValue(String offValue) {
        this.offValue = offValue;
    }

  
    

    public void setDgSelected(Boolean dgSelected) {
		this.dgSelected = dgSelected;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getProStock() {
        return proStock;
    }

    public void setProStock(String proStock) {
        this.proStock = proStock;
    }

    public String getProCurPrice() {
        return proCurPrice;
    }

    public void setProCurPrice(String proCurPrice) {
        this.proCurPrice = proCurPrice;
    }

    public String getProOldPrice() {
        return proOldPrice;
    }

    public void setProOldPrice(String proOldPrice) {
        this.proOldPrice = proOldPrice;
    }

    public String getBannerId() {
        return bannerId;
    }

    public void setBannerId(String bannerId) {
        this.bannerId = bannerId;
    }

    public String getProSku() {
        return proSku;
    }

    public void setProSku(String proSku) {
        this.proSku = proSku;
    }

    public String getProDesc() {
        return proDesc;
    }

    public void setProDesc(String proDesc) {
        this.proDesc = proDesc;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getTotalSumMoney() {
		return totalSumMoney;
	}

	public void setTotalSumMoney(String totalSumMoney) {
		this.totalSumMoney = totalSumMoney;
	}

	public String getTotalSaleSum() {
		return totalSaleSum;
	}

	public void setTotalSaleSum(String totalSaleSum) {
		this.totalSaleSum = totalSaleSum;
	}

	public String getUpdatePriceTime() {
		return updatePriceTime;
	}

	public void setUpdatePriceTime(String updatePriceTime) {
		this.updatePriceTime = updatePriceTime;
	}

	public String getBrandSid() {
		return brandSid;
	}

	public void setBrandSid(String brandSid) {
		this.brandSid = brandSid;
	}
	public Boolean getDgSelected() {
		return dgSelected;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	public String toString() {
		return "ProductResultVO :{shopName:'" + shopName + "', totalSumMoney:'"
				+ totalSumMoney + "', totalSaleSum:'" + totalSaleSum
				+ "', updatePriceTime:'" + updatePriceTime + "', brandSid:'"
				+ brandSid + "', bannerId:'" + bannerId + "', proSku:'"
				+ proSku + "', proDesc:'" + proDesc + "', productName:'"
				+ productName + "', proCurPrice:'" + proCurPrice
				+ "', proOldPrice:'" + proOldPrice + "', proPmtPrice:'"
				+ proPmtPrice + "', proStock:'" + proStock + "', brandName:'"
				+ brandName + "', offValue:'" + offValue + "', dgSelected:'"
				+ dgSelected + "', productImages:'" + productImages
				+ "', proClass:'" + proClass + "', sexSid:'" + sexSid
				+ "', orderNumber:'" + orderNumber + "', proSellingTime:'"
				+ proSellingTime + "', saleCode:'" + saleCode + "', sid:'"
				+ sid + "}";
	}
	
	
	
	


}
