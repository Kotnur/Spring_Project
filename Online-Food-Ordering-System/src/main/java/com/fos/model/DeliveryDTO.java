package com.fos.model;

import java.time.LocalDateTime;

public class DeliveryDTO {

	private Long deliveryId;
    private String deliveryAddress;
    private LocalDateTime deliveryDate;
    private String deliveryStatus;
    private Long orderId;
    
    public Long getDeliveryId() {
        return deliveryId;
    }
    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }
    public String getDeliveryStatus() {
        return deliveryStatus;
    }
    public Long getOrder() {
        return orderId;
    }
    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
    public void setOrder(Long order) {
        this.orderId = order;
    }
}
