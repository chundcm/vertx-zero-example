/*
 * This up.god.file is generated by jOOQ.
 */
package com.htl.domain.tables.pojos;


import com.htl.domain.tables.interfaces.ILctState;

import javax.annotation.Generated;
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
public class LctState implements ILctState {

    private static final long serialVersionUID = -1688719859;

    private String pkId;
    private String sName;
    private String sCode;
    private String sAlias;
    private String jConfig;
    private Integer iOrder;
    private String rCountryId;
    private Boolean isActive;
    private String zSigma;
    private String zLanguage;
    private String zCreateBy;
    private LocalDateTime zCreateTime;
    private String zUpdateBy;
    private LocalDateTime zUpdateTime;

    public LctState() {
    }

    public LctState(LctState value) {
        this.pkId = value.pkId;
        this.sName = value.sName;
        this.sCode = value.sCode;
        this.sAlias = value.sAlias;
        this.jConfig = value.jConfig;
        this.iOrder = value.iOrder;
        this.rCountryId = value.rCountryId;
        this.isActive = value.isActive;
        this.zSigma = value.zSigma;
        this.zLanguage = value.zLanguage;
        this.zCreateBy = value.zCreateBy;
        this.zCreateTime = value.zCreateTime;
        this.zUpdateBy = value.zUpdateBy;
        this.zUpdateTime = value.zUpdateTime;
    }

    public LctState(
            String pkId,
            String sName,
            String sCode,
            String sAlias,
            String jConfig,
            Integer iOrder,
            String rCountryId,
            Boolean isActive,
            String zSigma,
            String zLanguage,
            String zCreateBy,
            LocalDateTime zCreateTime,
            String zUpdateBy,
            LocalDateTime zUpdateTime
    ) {
        this.pkId = pkId;
        this.sName = sName;
        this.sCode = sCode;
        this.sAlias = sAlias;
        this.jConfig = jConfig;
        this.iOrder = iOrder;
        this.rCountryId = rCountryId;
        this.isActive = isActive;
        this.zSigma = zSigma;
        this.zLanguage = zLanguage;
        this.zCreateBy = zCreateBy;
        this.zCreateTime = zCreateTime;
        this.zUpdateBy = zUpdateBy;
        this.zUpdateTime = zUpdateTime;
    }

    public LctState(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }

    @Override
    public String getPkId() {
        return this.pkId;
    }

    @Override
    public LctState setPkId(String pkId) {
        this.pkId = pkId;
        return this;
    }

    @Override
    public String getSName() {
        return this.sName;
    }

    @Override
    public LctState setSName(String sName) {
        this.sName = sName;
        return this;
    }

    @Override
    public String getSCode() {
        return this.sCode;
    }

    @Override
    public LctState setSCode(String sCode) {
        this.sCode = sCode;
        return this;
    }

    @Override
    public String getSAlias() {
        return this.sAlias;
    }

    @Override
    public LctState setSAlias(String sAlias) {
        this.sAlias = sAlias;
        return this;
    }

    @Override
    public String getJConfig() {
        return this.jConfig;
    }

    @Override
    public LctState setJConfig(String jConfig) {
        this.jConfig = jConfig;
        return this;
    }

    @Override
    public Integer getIOrder() {
        return this.iOrder;
    }

    @Override
    public LctState setIOrder(Integer iOrder) {
        this.iOrder = iOrder;
        return this;
    }

    @Override
    public String getRCountryId() {
        return this.rCountryId;
    }

    @Override
    public LctState setRCountryId(String rCountryId) {
        this.rCountryId = rCountryId;
        return this;
    }

    @Override
    public Boolean getIsActive() {
        return this.isActive;
    }

    @Override
    public LctState setIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    @Override
    public String getZSigma() {
        return this.zSigma;
    }

    @Override
    public LctState setZSigma(String zSigma) {
        this.zSigma = zSigma;
        return this;
    }

    @Override
    public String getZLanguage() {
        return this.zLanguage;
    }

    @Override
    public LctState setZLanguage(String zLanguage) {
        this.zLanguage = zLanguage;
        return this;
    }

    @Override
    public String getZCreateBy() {
        return this.zCreateBy;
    }

    @Override
    public LctState setZCreateBy(String zCreateBy) {
        this.zCreateBy = zCreateBy;
        return this;
    }

    @Override
    public LocalDateTime getZCreateTime() {
        return this.zCreateTime;
    }

    @Override
    public LctState setZCreateTime(LocalDateTime zCreateTime) {
        this.zCreateTime = zCreateTime;
        return this;
    }

    @Override
    public String getZUpdateBy() {
        return this.zUpdateBy;
    }

    @Override
    public LctState setZUpdateBy(String zUpdateBy) {
        this.zUpdateBy = zUpdateBy;
        return this;
    }

    @Override
    public LocalDateTime getZUpdateTime() {
        return this.zUpdateTime;
    }

    @Override
    public LctState setZUpdateTime(LocalDateTime zUpdateTime) {
        this.zUpdateTime = zUpdateTime;
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LctState (");

        sb.append(pkId);
        sb.append(", ").append(sName);
        sb.append(", ").append(sCode);
        sb.append(", ").append(sAlias);
        sb.append(", ").append(jConfig);
        sb.append(", ").append(iOrder);
        sb.append(", ").append(rCountryId);
        sb.append(", ").append(isActive);
        sb.append(", ").append(zSigma);
        sb.append(", ").append(zLanguage);
        sb.append(", ").append(zCreateBy);
        sb.append(", ").append(zCreateTime);
        sb.append(", ").append(zUpdateBy);
        sb.append(", ").append(zUpdateTime);

        sb.append(")");
        return sb.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ILctState from) {
        setPkId(from.getPkId());
        setSName(from.getSName());
        setSCode(from.getSCode());
        setSAlias(from.getSAlias());
        setJConfig(from.getJConfig());
        setIOrder(from.getIOrder());
        setRCountryId(from.getRCountryId());
        setIsActive(from.getIsActive());
        setZSigma(from.getZSigma());
        setZLanguage(from.getZLanguage());
        setZCreateBy(from.getZCreateBy());
        setZCreateTime(from.getZCreateTime());
        setZUpdateBy(from.getZUpdateBy());
        setZUpdateTime(from.getZUpdateTime());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ILctState> E into(E into) {
        into.from(this);
        return into;
    }
}