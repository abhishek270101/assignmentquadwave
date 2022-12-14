/**
 * This class is generated by jOOQ
 */
package tech.codingclub.helix.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Assignment1 extends org.jooq.impl.TableImpl<tech.codingclub.helix.tables.records.Assignment1Record> {

	private static final long serialVersionUID = 709137953;

	/**
	 * The singleton instance of <code>public.assignment1</code>
	 */
	public static final tech.codingclub.helix.tables.Assignment1 ASSIGNMENT1 = new tech.codingclub.helix.tables.Assignment1();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<tech.codingclub.helix.tables.records.Assignment1Record> getRecordType() {
		return tech.codingclub.helix.tables.records.Assignment1Record.class;
	}

	/**
	 * The column <code>public.assignment1.Eid</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.Assignment1Record, java.lang.Long> EID = createField("Eid", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.assignment1.EName</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.Assignment1Record, java.lang.String> ENAME = createField("EName", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>public.assignment1.DOJ</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.Assignment1Record, java.lang.String> DOJ = createField("DOJ", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>public.assignment1.YOE</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.Assignment1Record, java.lang.Long> YOE = createField("YOE", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.assignment1.Designation</code>.
	 */
	public final org.jooq.TableField<tech.codingclub.helix.tables.records.Assignment1Record, java.lang.String> DESIGNATION = createField("Designation", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * Create a <code>public.assignment1</code> table reference
	 */
	public Assignment1() {
		this("assignment1", null);
	}

	/**
	 * Create an aliased <code>public.assignment1</code> table reference
	 */
	public Assignment1(java.lang.String alias) {
		this(alias, tech.codingclub.helix.tables.Assignment1.ASSIGNMENT1);
	}

	private Assignment1(java.lang.String alias, org.jooq.Table<tech.codingclub.helix.tables.records.Assignment1Record> aliased) {
		this(alias, aliased, null);
	}

	private Assignment1(java.lang.String alias, org.jooq.Table<tech.codingclub.helix.tables.records.Assignment1Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, tech.codingclub.helix.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public tech.codingclub.helix.tables.Assignment1 as(java.lang.String alias) {
		return new tech.codingclub.helix.tables.Assignment1(alias, this);
	}

	/**
	 * Rename this table
	 */
	public tech.codingclub.helix.tables.Assignment1 rename(java.lang.String name) {
		return new tech.codingclub.helix.tables.Assignment1(name, null);
	}
}
