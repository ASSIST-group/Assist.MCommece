package ru.assisttech.sdk;

public class AssistAddress {

    public static final String DEFAULT_SERVER = "https://payments.t.paysecure.ru";

    public static final String REGISTRATION_SERVICE = "/registration/mobileregistration.cfm";
    public static final String WEB_SERVICE = "/pay/order.cfm";

    public static final String GET_ORDER_STATUS_SERVICE = "/orderresult/mobileorderresult.cfm";
    public static final String CANCEL_SERVICE = "/cancel/wscancel.cfm";
    public static final String DECLINE_BY_NUMBER_SERVICE = "/api/v1/order/cancel.cfm";
    public static final String AUTH_TOKEN_SERVICE = "/api/v1/auth/login.cfm";

    public static final String SILENTPAY_SERVICE = "/pay/silentpay.cfm";
    public static final String TOKENPAY_SERVICE = "/pay/tokenpay.cfm";
    public static final String TOKENPAY_ORDER_SERVICE = "/pay/tokenpay_order.cfm";
    public static final String RECURRENT_URL = "/recurrent/rp.cfm";
}
