package br.com.anymarket.sdk.freight.dto;

import br.com.anymarket.sdk.freight.FreightType;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class FreightQuote {

    @JsonProperty("carrierName")
    private String carrierName;

    @JsonProperty("serviceName")
    private String serviceName;

    @JsonProperty("deliveryTime")
    private Integer deliveryTime;

    @JsonProperty("freightType")
    private FreightType freightType;

    @JsonProperty("price")
    private BigDecimal price;

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Integer getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Integer deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public FreightType getFreightType() {
        return freightType;
    }

    public void setFreightType(FreightType freightType) {
        this.freightType = freightType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
