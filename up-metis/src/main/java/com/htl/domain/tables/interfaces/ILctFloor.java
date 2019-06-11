/*
 * This up.god.file is generated by jOOQ.
 */
package com.htl.domain.tables.interfaces;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;


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
public interface ILctFloor extends Serializable {

    /**
     * Getter for <code>DB_HTL.LCT_FLOOR.PK_ID</code>. uniqueId,PK_ID
     */
    public String getPkId();

    /**
     * Setter for <code>DB_HTL.LCT_FLOOR.PK_ID</code>. uniqueId,PK_ID
     */
    public ILctFloor setPkId(String value);

    /**
     * Getter for <code>DB_HTL.LCT_FLOOR.S_NAME</code>. name,S_NAME
     */
    public String getSName();

    /**
     * Setter for <code>DB_HTL.LCT_FLOOR.S_NAME</code>. name,S_NAME
     */
    public ILctFloor setSName(String value);

    /**
     * Getter for <code>DB_HTL.LCT_FLOOR.S_CODE</code>. code,S_CODE
     */
    public String getSCode();

    /**
     * Setter for <code>DB_HTL.LCT_FLOOR.S_CODE</code>. code,S_CODE
     */
    public ILctFloor setSCode(String value);

    /**
     * Getter for <code>DB_HTL.LCT_FLOOR.J_CONFIG</code>. config,J_CONFIG
     */
    public String getJConfig();

    /**
     * Setter for <code>DB_HTL.LCT_FLOOR.J_CONFIG</code>. config,J_CONFIG
     */
    public ILctFloor setJConfig(String value);

    /**
     * Getter for <code>DB_HTL.LCT_FLOOR.I_ORDER</code>. order,I_ORDER
     */
    public Integer getIOrder();

    /**
     * Setter for <code>DB_HTL.LCT_FLOOR.I_ORDER</code>. order,I_ORDER
     */
    public ILctFloor setIOrder(Integer value);

    /**
     * Getter for <code>DB_HTL.LCT_FLOOR.R_TENT_ID</code>. tentId,R_TENT_ID
     */
    public String getRTentId();

    /**
     * Setter for <code>DB_HTL.LCT_FLOOR.R_TENT_ID</code>. tentId,R_TENT_ID
     */
    public ILctFloor setRTentId(String value);

    /**
     * Getter for <code>DB_HTL.LCT_FLOOR.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public Boolean getIsActive();

    /**
     * Setter for <code>DB_HTL.LCT_FLOOR.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public ILctFloor setIsActive(Boolean value);

    /**
     * Getter for <code>DB_HTL.LCT_FLOOR.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public String getZSigma();

    /**
     * Setter for <code>DB_HTL.LCT_FLOOR.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public ILctFloor setZSigma(String value);

    /**
     * Getter for <code>DB_HTL.LCT_FLOOR.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    public String getZLanguage();

    /**
     * Setter for <code>DB_HTL.LCT_FLOOR.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    public ILctFloor setZLanguage(String value);

    /**
     * Getter for <code>DB_HTL.LCT_FLOOR.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    public String getZCreateBy();

    /**
     * Setter for <code>DB_HTL.LCT_FLOOR.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    public ILctFloor setZCreateBy(String value);

    /**
     * Getter for <code>DB_HTL.LCT_FLOOR.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    public LocalDateTime getZCreateTime();

    /**
     * Setter for <code>DB_HTL.LCT_FLOOR.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    public ILctFloor setZCreateTime(LocalDateTime value);

    /**
     * Getter for <code>DB_HTL.LCT_FLOOR.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    public String getZUpdateBy();

    /**
     * Setter for <code>DB_HTL.LCT_FLOOR.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    public ILctFloor setZUpdateBy(String value);

    /**
     * Getter for <code>DB_HTL.LCT_FLOOR.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    public LocalDateTime getZUpdateTime();

    /**
     * Setter for <code>DB_HTL.LCT_FLOOR.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    public ILctFloor setZUpdateTime(LocalDateTime value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ILctFloor
     */
    public void from(com.htl.domain.tables.interfaces.ILctFloor from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ILctFloor
     */
    public <E extends com.htl.domain.tables.interfaces.ILctFloor> E into(E into);

    default ILctFloor fromJson(io.vertx.core.json.JsonObject json) {
        setPkId(json.getString("PK_ID"));
        setSName(json.getString("S_NAME"));
        setSCode(json.getString("S_CODE"));
        setJConfig(json.getString("J_CONFIG"));
        setIOrder(json.getInteger("I_ORDER"));
        setRTentId(json.getString("R_TENT_ID"));
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
        json.put("J_CONFIG", getJConfig());
        json.put("I_ORDER", getIOrder());
        json.put("R_TENT_ID", getRTentId());
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