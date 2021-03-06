/*
 * This up.god.file is generated by jOOQ.
 */
package com.htl.domain.tables;


import com.htl.domain.DbHtl;
import com.htl.domain.Indexes;
import com.htl.domain.Keys;
import com.htl.domain.tables.records.LctFloorRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class LctFloor extends TableImpl<LctFloorRecord> {

    /**
     * The reference instance of <code>DB_HTL.LCT_FLOOR</code>
     */
    public static final LctFloor LCT_FLOOR = new LctFloor();
    private static final long serialVersionUID = -144415076;
    /**
     * The column <code>DB_HTL.LCT_FLOOR.PK_ID</code>. uniqueId,PK_ID
     */
    public final TableField<LctFloorRecord, String> PK_ID = createField("PK_ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "uniqueId,PK_ID");
    /**
     * The column <code>DB_HTL.LCT_FLOOR.S_NAME</code>. name,S_NAME
     */
    public final TableField<LctFloorRecord, String> S_NAME = createField("S_NAME", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "name,S_NAME");
    /**
     * The column <code>DB_HTL.LCT_FLOOR.S_CODE</code>. code,S_CODE
     */
    public final TableField<LctFloorRecord, String> S_CODE = createField("S_CODE", org.jooq.impl.SQLDataType.VARCHAR(36), this, "code,S_CODE");
    /**
     * The column <code>DB_HTL.LCT_FLOOR.J_CONFIG</code>. config,J_CONFIG
     */
    public final TableField<LctFloorRecord, String> J_CONFIG = createField("J_CONFIG", org.jooq.impl.SQLDataType.CLOB, this, "config,J_CONFIG");
    /**
     * The column <code>DB_HTL.LCT_FLOOR.I_ORDER</code>. order,I_ORDER
     */
    public final TableField<LctFloorRecord, Integer> I_ORDER = createField("I_ORDER", org.jooq.impl.SQLDataType.INTEGER, this, "order,I_ORDER");
    /**
     * The column <code>DB_HTL.LCT_FLOOR.R_TENT_ID</code>. tentId,R_TENT_ID
     */
    public final TableField<LctFloorRecord, String> R_TENT_ID = createField("R_TENT_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "tentId,R_TENT_ID");
    /**
     * The column <code>DB_HTL.LCT_FLOOR.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    public final TableField<LctFloorRecord, Boolean> IS_ACTIVE = createField("IS_ACTIVE", org.jooq.impl.SQLDataType.BOOLEAN, this, "active,IS_ACTIVE");
    /**
     * The column <code>DB_HTL.LCT_FLOOR.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    public final TableField<LctFloorRecord, String> Z_SIGMA = createField("Z_SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "sigma,Z_SIGMA");
    /**
     * The column <code>DB_HTL.LCT_FLOOR.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    public final TableField<LctFloorRecord, String> Z_LANGUAGE = createField("Z_LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(8), this, "language,Z_LANGUAGE");
    /**
     * The column <code>DB_HTL.LCT_FLOOR.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    public final TableField<LctFloorRecord, String> Z_CREATE_BY = createField("Z_CREATE_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "createBy,Z_CREATE_BY");
    /**
     * The column <code>DB_HTL.LCT_FLOOR.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    public final TableField<LctFloorRecord, LocalDateTime> Z_CREATE_TIME = createField("Z_CREATE_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "createTime,Z_CREATE_TIME");
    /**
     * The column <code>DB_HTL.LCT_FLOOR.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    public final TableField<LctFloorRecord, String> Z_UPDATE_BY = createField("Z_UPDATE_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "updateBy,Z_UPDATE_BY");
    /**
     * The column <code>DB_HTL.LCT_FLOOR.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    public final TableField<LctFloorRecord, LocalDateTime> Z_UPDATE_TIME = createField("Z_UPDATE_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "updateTime,Z_UPDATE_TIME");

    /**
     * Create a <code>DB_HTL.LCT_FLOOR</code> table reference
     */
    public LctFloor() {
        this(DSL.name("LCT_FLOOR"), null);
    }

    /**
     * Create an aliased <code>DB_HTL.LCT_FLOOR</code> table reference
     */
    public LctFloor(String alias) {
        this(DSL.name(alias), LCT_FLOOR);
    }

    /**
     * Create an aliased <code>DB_HTL.LCT_FLOOR</code> table reference
     */
    public LctFloor(Name alias) {
        this(alias, LCT_FLOOR);
    }

    private LctFloor(Name alias, Table<LctFloorRecord> aliased) {
        this(alias, aliased, null);
    }

    private LctFloor(Name alias, Table<LctFloorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LctFloorRecord> getRecordType() {
        return LctFloorRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DbHtl.DB_HTL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.LCT_FLOOR_FK_LCT_FLOOR_R_TENT_ID, Indexes.LCT_FLOOR_PRIMARY, Indexes.LCT_FLOOR_UK_LCT_FLOOR_S_CODE_Z_SIGMA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LctFloorRecord> getPrimaryKey() {
        return Keys.KEY_LCT_FLOOR_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LctFloorRecord>> getKeys() {
        return Arrays.<UniqueKey<LctFloorRecord>>asList(Keys.KEY_LCT_FLOOR_PRIMARY, Keys.KEY_LCT_FLOOR_UK_LCT_FLOOR_S_CODE_Z_SIGMA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctFloor as(String alias) {
        return new LctFloor(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LctFloor as(Name alias) {
        return new LctFloor(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LctFloor rename(String name) {
        return new LctFloor(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LctFloor rename(Name name) {
        return new LctFloor(name, null);
    }
}
