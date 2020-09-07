package com.kalaivananraja.Springboot.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Kalaivanan Raja
 *
 */
/**
 * @author Kalaivanan Raja
 *
 */
/**
 * @author Kalaivanan Raja
 *
 */
@Entity
@Table(name = "business_partner")
public class BusinessPartner {

	@Column(name = "business_partner_id")
	private int business_partner_id;

	@Column(name = "business_partner_name")
	private String business_partner_name;

	@Column(name = "business_partner_code")
	private String business_partner_code;

	@Column(name = "contact_name")
	private String contact_name;

	@Column(name = "address1")
	private String address1;

	@Column(name = "address2")
	private String address2;

	@Column(name = "city")
	private String city;

	@Column(name = "province")
	private String province;

	@Column(name = "country")
	private String country;

	@Column(name = "postal_code")
	private String postal_code;

	@Column(name = "parent_company")
	private String parent_company;

	@Column(name = "toll_free_number")
	private String toll_free_number;

	@Column(name = "phone")
	private String phone;

	@Column(name = "phone_extension")
	private String phone_extension;

	@Column(name = "fax")
	private String fax;

	@Column(name = "website_url")
	private String website_url;

	@Column(name = "payment_condition")
	private int payment_condition;

	@Column(name = "gl_number")
	private String gl_number;

	@Column(name = "driver_min_age")
	private int driver_min_age;

	@Column(name = "api_enabled")
	private int api_enabled;

	@Column(name = "status")
	private int status;

	@Column(name = "one_way_fee_paid_by")
	private String one_way_fee_paid_by;

	@Column(name = "country_code")
	private String country_code;

	public BusinessPartner() {
	}

	/**
	 * @param business_partner_id
	 */
	public void setBusinessPartnerId(int business_partner_id) {
		this.business_partner_id = business_partner_id;
	}

	/**
	 * @return
	 */
	public int getBusinessPartnerId() {
		return business_partner_id;
	}

	/**
	 * @param business_partner_name
	 */
	public void setBusinessPartnerName(String business_partner_name) {
		this.business_partner_name = business_partner_name;
	}

	/**
	 * @return
	 */
	public String getBusinessPartnerName() {
		return business_partner_name;
	}

	/**
	 * @param business_partner_code
	 */
	public void setBusinessPartnerCode(String business_partner_code) {
		this.business_partner_code = business_partner_code;
	}

	/**
	 * @return
	 */
	public String getBusinessPartnerCode() {
		return business_partner_code;
	}

	/**
	 * @param contact_name
	 */
	public void setContactNumber(String contact_name) {
		this.contact_name = contact_name;
	}

	/**
	 * @return
	 */
	public String getContactNumber() {
		return contact_name;
	}

	/**
	 * @param address1
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * @return
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * @param address2
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	 * @return
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param province
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * @return
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param postal_code
	 */
	public void setPostalCode(String postal_code) {
		this.postal_code = postal_code;
	}

	/**
	 * @return
	 */
	public String getPostalCode() {
		return postal_code;
	}

	/**
	 * @param parent_company
	 */
	public void setParentCompany(String parent_company) {
		this.parent_company = parent_company;
	}

	/**
	 * @return
	 */
	public String getParentCompany() {
		return parent_company;
	}

	/**
	 * @param toll_free_number
	 */
	public void setTollFreeNumber(String toll_free_number) {
		this.toll_free_number = toll_free_number;
	}

	/**
	 * @return
	 */
	public String getTollFreeNumber() {
		return toll_free_number;
	}

	/**
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone_extension
	 */
	public void setPhoneExtension(String phone_extension) {
		this.phone_extension = phone_extension;
	}

	/**
	 * @return
	 */
	public String getPhoneExtension() {
		return phone_extension;
	}

	/**
	 * @param fax
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * @return
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * @param website_url
	 */
	public void setWebsiteUrl(String website_url) {
		this.website_url = website_url;
	}

	/**
	 * @return
	 */
	public String getWebsiteUrl() {
		return website_url;
	}

	/**
	 * @param payment_condition
	 */
	public void setPaymentCondition(int payment_condition) {
		this.payment_condition = payment_condition;
	}

	/**
	 * @return
	 */
	public int getPaymentCondition() {
		return payment_condition;
	}

	/**
	 * @param gl_number
	 */
	public void setGlNumber(String gl_number) {
		this.gl_number = gl_number;
	}

	/**
	 * @return
	 */
	public String getGlNumber() {
		return gl_number;
	}

	/**
	 * @param driver_min_age
	 */
	public void setDriverMinAge(int driver_min_age) {
		this.driver_min_age = driver_min_age;
	}

	/**
	 * @return
	 */
	public int setDriverMinAge() {
		return driver_min_age;
	}

	/**
	 * @param api_enabled
	 */
	public void setApiEnabled(int api_enabled) {
		this.api_enabled = api_enabled;
	}

	/**
	 * @return
	 */
	public int getApiEnabled() {
		return api_enabled;
	}

	/**
	 * @param status
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param one_way_fee_paid_by
	 */
	public void setOneWayFeePaidBy(String one_way_fee_paid_by) {
		this.one_way_fee_paid_by = one_way_fee_paid_by;
	}

	/**
	 * @return
	 */
	public String getOneWayFeePaidBy() {
		return one_way_fee_paid_by;
	}

	/**
	 * @param country_code
	 */
	public void setCountryCode(String country_code) {
		this.country_code = country_code;
	}
	
	/**
	 * @return
	 */
	public String getCountryCode() {
		return country_code;
	}
}
