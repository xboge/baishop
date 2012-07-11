package com.baishop.entity.goods;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Goods implements Serializable {
    
	private static final long serialVersionUID = -7728041493555620169L;

	/**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.goods_id
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private Long goodsId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.cate_id
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private Integer cateId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.brand_id
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private Integer brandId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.type_id
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private Integer typeId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.goods_sn
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private String goodsSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.goods_name
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private String goodsName;
    
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.goods_image
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private String goodsImage;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.goods_number
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private Integer goodsNumber;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.click_count
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private Long clickCount;
    
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.sell_count
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private Long sellCount;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.weight
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private BigDecimal weight;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.market_price
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private BigDecimal marketPrice;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.shop_price
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private BigDecimal shopPrice;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.goods_brief
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private String goodsBrief;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.create_time
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private Date createTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.update_time
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private Date updateTime;
    
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.publishTime
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private Date publishTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.seller_note
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private String sellerNote;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.is_real
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private Byte isReal;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.is_on_sale
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private Byte isOnSale;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.has_invoice
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private Byte hasInvoice;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.has_warranty
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private Byte hasWarranty;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.is_delete
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private Byte isDelete;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_goods.goods_desc
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    private String goodsDesc;
    
    /**
     * 产品属性列表
     */
    private List<GoodsProps> properties;
    
    /**
     * 产品图片列表
     */
    private List<GoodsImgs> imageGroups;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_goods.goods_id
     *
     * @return the value of bai_goods.goods_id
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_goods.goods_id
     *
     * @param goodsId the value for bai_goods.goods_id
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_goods.cate_id
     *
     * @return the value of bai_goods.cate_id
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public Integer getCateId() {
        return cateId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_goods.cate_id
     *
     * @param cateId the value for bai_goods.cate_id
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_goods.brand_id
     *
     * @return the value of bai_goods.brand_id
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_goods.brand_id
     *
     * @param brandId the value for bai_goods.brand_id
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_goods.type_id
     *
     * @return the value of bai_goods.type_id
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_goods.type_id
     *
     * @param typeId the value for bai_goods.type_id
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_goods.goods_sn
     *
     * @return the value of bai_goods.goods_sn
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public String getGoodsSn() {
        return goodsSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_goods.goods_sn
     *
     * @param goodsSn the value for bai_goods.goods_sn
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_goods.goods_name
     *
     * @return the value of bai_goods.goods_name
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_goods.goods_name
     *
     * @param goodsName the value for bai_goods.goods_name
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsImage() {
		return goodsImage;
	}

	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}

	/**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_goods.goods_number
     *
     * @return the value of bai_goods.goods_number
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_goods.goods_number
     *
     * @param goodsNumber the value for bai_goods.goods_number
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_goods.click_count
     *
     * @return the value of bai_goods.click_count
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public Long getClickCount() {
        return clickCount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_goods.click_count
     *
     * @param clickCount the value for bai_goods.click_count
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public void setClickCount(Long clickCount) {
        this.clickCount = clickCount;
    }

    public Long getSellCount() {
		return sellCount;
	}

	public void setSellCount(Long sellCount) {
		this.sellCount = sellCount;
	}

	/**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_goods.weight
     *
     * @return the value of bai_goods.weight
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_goods.weight
     *
     * @param weight the value for bai_goods.weight
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_goods.market_price
     *
     * @return the value of bai_goods.market_price
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_goods.market_price
     *
     * @param marketPrice the value for bai_goods.market_price
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_goods.shop_price
     *
     * @return the value of bai_goods.shop_price
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public BigDecimal getShopPrice() {
        return shopPrice;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_goods.shop_price
     *
     * @param shopPrice the value for bai_goods.shop_price
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public void setShopPrice(BigDecimal shopPrice) {
        this.shopPrice = shopPrice;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_goods.goods_brief
     *
     * @return the value of bai_goods.goods_brief
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public String getGoodsBrief() {
        return goodsBrief;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_goods.goods_brief
     *
     * @param goodsBrief the value for bai_goods.goods_brief
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public void setGoodsBrief(String goodsBrief) {
        this.goodsBrief = goodsBrief;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_goods.create_time
     *
     * @return the value of bai_goods.create_time
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_goods.create_time
     *
     * @param createTime the value for bai_goods.create_time
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_goods.update_time
     *
     * @return the value of bai_goods.update_time
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_goods.update_time
     *
     * @param updateTime the value for bai_goods.update_time
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	/**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_goods.seller_note
     *
     * @return the value of bai_goods.seller_note
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public String getSellerNote() {
        return sellerNote;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_goods.seller_note
     *
     * @param sellerNote the value for bai_goods.seller_note
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public void setSellerNote(String sellerNote) {
        this.sellerNote = sellerNote;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_goods.is_real
     *
     * @return the value of bai_goods.is_real
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public Byte getIsReal() {
        return isReal;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_goods.is_real
     *
     * @param isReal the value for bai_goods.is_real
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public void setIsReal(Byte isReal) {
        this.isReal = isReal;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_goods.is_on_sale
     *
     * @return the value of bai_goods.is_on_sale
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public Byte getIsOnSale() {
        return isOnSale;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_goods.is_on_sale
     *
     * @param isOnSale the value for bai_goods.is_on_sale
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public void setIsOnSale(Byte isOnSale) {
        this.isOnSale = isOnSale;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_goods.has_invoice
     *
     * @return the value of bai_goods.has_invoice
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public Byte getHasInvoice() {
        return hasInvoice;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_goods.has_invoice
     *
     * @param hasInvoice the value for bai_goods.has_invoice
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public void setHasInvoice(Byte hasInvoice) {
        this.hasInvoice = hasInvoice;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_goods.has_warranty
     *
     * @return the value of bai_goods.has_warranty
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public Byte getHasWarranty() {
        return hasWarranty;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_goods.has_warranty
     *
     * @param hasWarranty the value for bai_goods.has_warranty
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public void setHasWarranty(Byte hasWarranty) {
        this.hasWarranty = hasWarranty;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_goods.is_delete
     *
     * @return the value of bai_goods.is_delete
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_goods.is_delete
     *
     * @param isDelete the value for bai_goods.is_delete
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_goods.goods_desc
     *
     * @return the value of bai_goods.goods_desc
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public String getGoodsDesc() {
        return goodsDesc;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_goods.goods_desc
     *
     * @param goodsDesc the value for bai_goods.goods_desc
     *
     * @ibatorgenerated Thu Oct 13 18:37:07 CST 2011
     */
    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

	public List<GoodsProps> getProperties() {
		return properties;
	}

	public void setProperties(List<GoodsProps> properties) {
		this.properties = properties;
	}

	public List<GoodsImgs> getImageGroups() {
		return imageGroups;
	}

	public void setImageGroups(List<GoodsImgs> imageGroups) {
		this.imageGroups = imageGroups;
	}
}