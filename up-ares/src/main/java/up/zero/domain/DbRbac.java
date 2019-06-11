/*
 * This file is generated by jOOQ.
*/
package up.zero.domain;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import up.zero.domain.tables.CiDept;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DbRbac extends SchemaImpl {

    private static final long serialVersionUID = 1818608575;

    /**
     * The reference instance of <code>DB_RBAC</code>
     */
    public static final DbRbac DB_RBAC = new DbRbac();

    /**
     * The table <code>DB_RBAC.CI_DEPT</code>.
     */
    public final CiDept CI_DEPT = up.zero.domain.tables.CiDept.CI_DEPT;

    /**
     * No further instances allowed
     */
    private DbRbac() {
        super("DB_RBAC", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            CiDept.CI_DEPT);
    }
}