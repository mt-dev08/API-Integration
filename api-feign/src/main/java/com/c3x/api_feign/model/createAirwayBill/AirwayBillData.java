package com.c3x.api_feign.model.createAirwayBill;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AirwayBillData {

    @JsonProperty("CODAmount")
    private double codAmount;

    @JsonProperty("CODCurrency")
    private String codCurrency;

    @JsonProperty("Destination")
    private String destination;

    @JsonProperty("DutyConsigneePay")
    private String dutyConsigneePay;

    @JsonProperty("GoodsDescription")
    private String goodsDescription;

    @JsonProperty("NumberofPeices")
    private int numberOfPieces;

    @JsonProperty("Origin")
    private String origin;

    @JsonProperty("ProductType")
    private String productType;

    @JsonProperty("ReceiversAddress1")
    private String receiversAddress1;

    @JsonProperty("ReceiversAddress2")
    private String receiversAddress2;

    @JsonProperty("ReceiversCity")
    private String receiversCity;

    @JsonProperty("ReceiversSubCity")
    private String receiversSubCity;

    @JsonProperty("ReceiversCountry")
    private String receiversCountry;

    @JsonProperty("ReceiversCompany")
    private String receiversCompany;

    @JsonProperty("ReceiversContactPerson")
    private String receiversContactPerson;

    @JsonProperty("ReceiversEmail")
    private String receiversEmail;

    @JsonProperty("ReceiversGeoLocation")
    private String receiversGeoLocation;

    @JsonProperty("ReceiversMobile")
    private String receiversMobile;

    @JsonProperty("ReceiversPhone")
    private String receiversPhone;

    @JsonProperty("ReceiversPinCode")
    private String receiversPinCode;

    @JsonProperty("SendersAddress1")
    private String sendersAddress1;

    @JsonProperty("SendersAddress2")
    private String sendersAddress2;

    @JsonProperty("SendersCity")
    private String sendersCity;

    @JsonProperty("SendersCountry")
    private String sendersCountry;

    @JsonProperty("SendersCompany")
    private String sendersCompany;

    @JsonProperty("SendersContactPerson")
    private String sendersContactPerson;

    @JsonProperty("SendersEmail")
    private String sendersEmail;

    @JsonProperty("SendersMobile")
    private String sendersMobile;

    @JsonProperty("SendersPhone")
    private String sendersPhone;

    @JsonProperty("SendersPinCode")
    private String sendersPinCode;

    @JsonProperty("ServiceType")
    private String serviceType;

    @JsonProperty("ShipmentDimension")
    private String shipmentDimension;

    @JsonProperty("ShipmentInvoiceCurrency")
    private String shipmentInvoiceCurrency;

    @JsonProperty("ShipmentInvoiceValue")
    private double shipmentInvoiceValue;

    @JsonProperty("ShipperReference")
    private String shipperReference;

    @JsonProperty("ShipperVatAccount")
    private String shipperVatAccount;

    @JsonProperty("SpecialInstruction")
    private String specialInstruction;

    @JsonProperty("Weight")
    private double weight;


}
