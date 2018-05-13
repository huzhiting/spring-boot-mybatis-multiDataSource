package com.uqiauto.statistics.model;

import java.math.BigDecimal;
import java.util.Date;

public class WmsOrders {
    private Integer id;

    private Date createTime;

    private String orderSn;

    private BigDecimal transferMoney;

    private BigDecimal orderMoney;

    private String buyerAddress;

    private Integer buyerId;

    private String storeName;

    private String orderStatus;

    private String buyerName;

    private String buyerPhone;

    private Integer orderShopCnt;

    private String paymentCode;

    private Integer compId;

    private Integer storeId;

    private String billState;

    private String paySn;

    private BigDecimal goodsMoney;

    private String buyerAccount;

    private BigDecimal peferentialAmount;

    private Integer customerAddressId;

    private String account;

    private String accountName;

    private String inquiryNum;

    private Long askId;

    private String viewAccount;

    private Date viewDate;

    private Integer checkStatus;

    private String taxmoney;

    private String back;

    private String iftaxes;

    private Long requireId;

    private Integer orderFrom;

    private Long answerGoodsId;

    private String lskyPaper;

    private String lskyPaperStatus;

    private String businessAuditBack;

    private String financeAuditBack;

    private String cancelBack;

    private String hopeArriveDate;

    private String storeAuditBack;

    private String lskyno;

    private String transportway;

    private String transportcompany;

    private Integer cancel;

    private String cancelRemark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public BigDecimal getTransferMoney() {
        return transferMoney;
    }

    public void setTransferMoney(BigDecimal transferMoney) {
        this.transferMoney = transferMoney;
    }

    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress == null ? null : buyerAddress.trim();
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone == null ? null : buyerPhone.trim();
    }

    public Integer getOrderShopCnt() {
        return orderShopCnt;
    }

    public void setOrderShopCnt(Integer orderShopCnt) {
        this.orderShopCnt = orderShopCnt;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode == null ? null : paymentCode.trim();
    }

    public Integer getCompId() {
        return compId;
    }

    public void setCompId(Integer compId) {
        this.compId = compId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getBillState() {
        return billState;
    }

    public void setBillState(String billState) {
        this.billState = billState == null ? null : billState.trim();
    }

    public String getPaySn() {
        return paySn;
    }

    public void setPaySn(String paySn) {
        this.paySn = paySn == null ? null : paySn.trim();
    }

    public BigDecimal getGoodsMoney() {
        return goodsMoney;
    }

    public void setGoodsMoney(BigDecimal goodsMoney) {
        this.goodsMoney = goodsMoney;
    }

    public String getBuyerAccount() {
        return buyerAccount;
    }

    public void setBuyerAccount(String buyerAccount) {
        this.buyerAccount = buyerAccount == null ? null : buyerAccount.trim();
    }

    public BigDecimal getPeferentialAmount() {
        return peferentialAmount;
    }

    public void setPeferentialAmount(BigDecimal peferentialAmount) {
        this.peferentialAmount = peferentialAmount;
    }

    public Integer getCustomerAddressId() {
        return customerAddressId;
    }

    public void setCustomerAddressId(Integer customerAddressId) {
        this.customerAddressId = customerAddressId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getInquiryNum() {
        return inquiryNum;
    }

    public void setInquiryNum(String inquiryNum) {
        this.inquiryNum = inquiryNum == null ? null : inquiryNum.trim();
    }

    public Long getAskId() {
        return askId;
    }

    public void setAskId(Long askId) {
        this.askId = askId;
    }

    public String getViewAccount() {
        return viewAccount;
    }

    public void setViewAccount(String viewAccount) {
        this.viewAccount = viewAccount == null ? null : viewAccount.trim();
    }

    public Date getViewDate() {
        return viewDate;
    }

    public void setViewDate(Date viewDate) {
        this.viewDate = viewDate;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getTaxmoney() {
        return taxmoney;
    }

    public void setTaxmoney(String taxmoney) {
        this.taxmoney = taxmoney == null ? null : taxmoney.trim();
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back == null ? null : back.trim();
    }

    public String getIftaxes() {
        return iftaxes;
    }

    public void setIftaxes(String iftaxes) {
        this.iftaxes = iftaxes == null ? null : iftaxes.trim();
    }

    public Long getRequireId() {
        return requireId;
    }

    public void setRequireId(Long requireId) {
        this.requireId = requireId;
    }

    public Integer getOrderFrom() {
        return orderFrom;
    }

    public void setOrderFrom(Integer orderFrom) {
        this.orderFrom = orderFrom;
    }

    public Long getAnswerGoodsId() {
        return answerGoodsId;
    }

    public void setAnswerGoodsId(Long answerGoodsId) {
        this.answerGoodsId = answerGoodsId;
    }

    public String getLskyPaper() {
        return lskyPaper;
    }

    public void setLskyPaper(String lskyPaper) {
        this.lskyPaper = lskyPaper == null ? null : lskyPaper.trim();
    }

    public String getLskyPaperStatus() {
        return lskyPaperStatus;
    }

    public void setLskyPaperStatus(String lskyPaperStatus) {
        this.lskyPaperStatus = lskyPaperStatus == null ? null : lskyPaperStatus.trim();
    }

    public String getBusinessAuditBack() {
        return businessAuditBack;
    }

    public void setBusinessAuditBack(String businessAuditBack) {
        this.businessAuditBack = businessAuditBack == null ? null : businessAuditBack.trim();
    }

    public String getFinanceAuditBack() {
        return financeAuditBack;
    }

    public void setFinanceAuditBack(String financeAuditBack) {
        this.financeAuditBack = financeAuditBack == null ? null : financeAuditBack.trim();
    }

    public String getCancelBack() {
        return cancelBack;
    }

    public void setCancelBack(String cancelBack) {
        this.cancelBack = cancelBack == null ? null : cancelBack.trim();
    }

    public String getHopeArriveDate() {
        return hopeArriveDate;
    }

    public void setHopeArriveDate(String hopeArriveDate) {
        this.hopeArriveDate = hopeArriveDate == null ? null : hopeArriveDate.trim();
    }

    public String getStoreAuditBack() {
        return storeAuditBack;
    }

    public void setStoreAuditBack(String storeAuditBack) {
        this.storeAuditBack = storeAuditBack == null ? null : storeAuditBack.trim();
    }

    public String getLskyno() {
        return lskyno;
    }

    public void setLskyno(String lskyno) {
        this.lskyno = lskyno == null ? null : lskyno.trim();
    }

    public String getTransportway() {
        return transportway;
    }

    public void setTransportway(String transportway) {
        this.transportway = transportway == null ? null : transportway.trim();
    }

    public String getTransportcompany() {
        return transportcompany;
    }

    public void setTransportcompany(String transportcompany) {
        this.transportcompany = transportcompany == null ? null : transportcompany.trim();
    }

    public Integer getCancel() {
        return cancel;
    }

    public void setCancel(Integer cancel) {
        this.cancel = cancel;
    }

    public String getCancelRemark() {
        return cancelRemark;
    }

    public void setCancelRemark(String cancelRemark) {
        this.cancelRemark = cancelRemark == null ? null : cancelRemark.trim();
    }
}