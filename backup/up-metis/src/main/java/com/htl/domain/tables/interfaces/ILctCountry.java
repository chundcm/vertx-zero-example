/*
 * This up.god.file is generated by jOOQ.
 */
package com.htl.domain.tables.interfaces;


import javax.annotation.Generated;
import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.7"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface ILctCountry extends Serializable {

    /**
     * Getter for <code>DB_HTL.LCT_COUNTRY.PK_ID</code>. uniqueId,PK_ID
     */
    public String getPkId();

    /**
     * Setter for <code>DB_HTL.LCT_COUNTRY.PK_ID</code>. uniqueId,PK_ID
     */
    public ILctCountry setPkId(String value);

    /**
     * Getter for <code>DB_HTL.LCT_COUNTRY.S_NAME</code>. 国家名称,name,S_NAME
     */
    public String getSName();

    /**
     * Setter for <code>DB_HTL.LCT_COUNTRY.S_NAME</code>. 国家名称,name,S_NAME
     */
    public ILctCountry setSName(String value);

    /**
     * Getter for <code>DB_HTL.LCT_COUNTRY.S_CODE</code>. code,S_CODE
     */
    public String getSCode();

    /**
     * Setter for <code>DB_HTL.LCT_COUNTRY.S_CODE</code>. code,S_CODE
     */
    public ILctCountry setSCode(String value);

    /**
     * Getter for <code>DB_HTL.LCT_COUNTRY.S_FLAG</code>. 国旗,flag,S_FLAG
     */
    public String getSFlag();

    /**
     * Setter for <code>DB_HTL.LCT_COUNTRY.S_FLAG</code>. 国旗,flag,S_FLAG
     */
    public ILctCountry setSFlag(String value);

    /**
     * Getter for <code>DB_HTL.LCT_COUNTRY.S_PHONE_PREFIX</code>. 电话前缀,phonePrefix,S_PHONE_PREFIX
     */
    public String getSPhonePrefix();

    /**
     * Setter for <code>DB_HTL.LCT_COUNTRY.S_PHONE_PREFIX</code>. 电话前缀,phonePrefix,S_PHONE_PREFIX
     */
    public ILctCountry setSPhonePrefix(String value);

    /**
     * Getter for <code>DB_HTL.LCT_COUNTRY.J_CONFIG</code>. config,J_CONFIG
     */
    public String getJConfig();

    /**
     * Setter for <code>DB_HTL.LCT_COUNTRY.J_CONFIG</code>. config,J_CONFIG
     */
    public ILctCountry setJConfig(String value);

    /**
     * Getter for <code>DB_HTL.LCT_COUNTRY.I_ORDER</code>. 排序,order,I_ORDER
     */
    public Integer getIOrder();

    /**
     * Setter for <code>DB_HTL.LCT_COUNTRY.I_ORDER</code>. 排序,order,I_ORDER
     */
    public ILctCountry setIOrder(Integer value);

    /**
     * Getter for <code>DB_HTL.LCT_COUNTRY.R_CURRENCY_ID</code>. 使用货币,currencyId,R_CURRENCY_ID
     */
    public String getRCurrencyId();

    /**
     * Setter for <code>DB_HTL.LCT_COUNTRY.R_CURRENCY_ID</code>. 使用货币,currencyId,R_CURRENCY_ID
     */
    public ILctCountry setRCurrencyId(String value);

    /**
     * Getter for <code>DB_HTL.LCT_COUNTRY.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public Boolean getIsActive();

    /**
     * Setter for <code>DB_HTL.LCT_COUNTRY.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public ILctCountry setIsActive(Boolean value);

    /**
     * Getter for <code>DB_HTL.LCT_COUNTRY.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public String getZSigma();

    /**
     * Setter for <code>DB_HTL.LCT_COUNTRY.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public ILctCountry setZSigma(String value);

    /**
     * Getter for <code>DB_HTL.LCT_COUNTRY.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    public String getZLanguage();

    /**
     * Setter for <code>DB_HTL.LCT_COUNTRY.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    public ILctCountry setZLanguage(String value);

    /**
     * Getter for <code>DB_HTL.LCT_COUNTRY.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    public String getZCreateBy();

    /**
     * Setter for <code>DB_HTL.LCT_COUNTRY.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    public ILctCountry setZCreateBy(String value);

    /**
     * Getter for <code>DB_HTL.LCT_COUNTRY.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    public LocalDateTime getZCreateTime();

    /**
     * Setter for <code>DB_HTL.LCT_COUNTRY.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    public ILctCountry setZCreateTime(LocalDateTime value);

    /**
     * Getter for <code>DB_HTL.LCT_COUNTRY.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    public String getZUpdateBy();

    /**
     * Setter for <code>DB_HTL.LCT_COUNTRY.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    public ILctCountry setZUpdateBy(String value);

    /**
     * Getter for <code>DB_HTL.LCT_COUNTRY.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    public LocalDateTime getZUpdateTime();

    /**
     * Setter for <code>DB_HTL.LCT_COUNTRY.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    public ILctCountry setZUpdateTime(LocalDateTime value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ILctCountry
     */
    public void from(com.htl.domain.tables.interfaces.ILctCountry from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ILctCountry
     */
    public <E extends com.htl.domain.tables.interfaces.ILctCountry> E into(E into);

    default ILctCountry fromJson(io.vertx.core.json.JsonObject json) {
        setPkId(json.getString("PK_ID"));
        setSName(json.getString("S_NAME"));
        setSCode(json.getString("S_CODE"));
        setSFlag(json.getString("S_FLAG"));
        setSPhonePrefix(json.getString("S_PHONE_PREFIX"));
        setJConfig(json.getString("J_CONFIG"));
        setIOrder(json.getInteger("I_ORDER"));
        setRCurrencyId(json.getString("R_CURRENCY_ID"));
        setIsActive(json.getBoolean("IS_ACTIVE"));
        setZSigma(json.getString("Z_SIGMA"));
        setZLanguage(json.getString("Z_LANGUAGE"));
        setZCreateBy(json.getString("Z_CREATE_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column Z_CREATE_TIME!
        setZUpdateBy(json.getString("Z_UPDATE_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column Z_UPDATE_TIME!
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("PK_ID", getPkId());
        json.put("S_NAME", getSName());
        json.put("S_CODE", getSCode());
        json.put("S_FLAG", getSFlag());
        json.put("S_PHONE_PREFIX", getSPhonePrefix());
        json.put("J_CONFIG", getJConfig());
        json.put("I_ORDER", getIOrder());
        json.put("R_CURRENCY_ID", getRCurrencyId());
        json.put("IS_ACTIVE", getIsActive());
        json.put("Z_SIGMA", getZSigma());
        json.put("Z_LANGUAGE", getZLanguage());
        json.put("Z_CREATE_BY", getZCreateBy());
        // Omitting unrecognized type java.time.LocalDateTime for column Z_CREATE_TIME!
        json.put("Z_UPDATE_BY", getZUpdateBy());
        // Omitting unrecognized type java.time.LocalDateTime for column Z_UPDATE_TIME!
        return json;
    }

}
