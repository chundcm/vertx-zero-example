/*
 * This file is generated by jOOQ.
*/
package up.god.domain;


import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;

import up.god.domain.tables.SysTabular;


/**
 * A class modelling indexes of tables of the <code>DB_JOOQ</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index SYS_TABULAR_PRIMARY = Indexes0.SYS_TABULAR_PRIMARY;
    public static final Index SYS_TABULAR_UK_SYS_TABULAR_S_CODE_S_TYPE_Z_SIGMA_Z_LANGUAGE = Indexes0.SYS_TABULAR_UK_SYS_TABULAR_S_CODE_S_TYPE_Z_SIGMA_Z_LANGUAGE;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index SYS_TABULAR_PRIMARY = Internal.createIndex("PRIMARY", SysTabular.SYS_TABULAR, new OrderField[] { SysTabular.SYS_TABULAR.PK_ID }, true);
        public static Index SYS_TABULAR_UK_SYS_TABULAR_S_CODE_S_TYPE_Z_SIGMA_Z_LANGUAGE = Internal.createIndex("UK_SYS_TABULAR_S_CODE_S_TYPE_Z_SIGMA_Z_LANGUAGE", SysTabular.SYS_TABULAR, new OrderField[] { SysTabular.SYS_TABULAR.S_CODE, SysTabular.SYS_TABULAR.S_TYPE, SysTabular.SYS_TABULAR.Z_SIGMA, SysTabular.SYS_TABULAR.Z_LANGUAGE }, true);
    }
}