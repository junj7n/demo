package com.example.entity;

import java.io.Serializable;

public class HrRole implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_role.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_role.hrid
     *
     * @mbg.generated
     */
    private Integer hrid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hr_role.rid
     *
     * @mbg.generated
     */
    private Integer rid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hr_role
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr_role.id
     *
     * @return the value of hr_role.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr_role.id
     *
     * @param id the value for hr_role.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr_role.hrid
     *
     * @return the value of hr_role.hrid
     *
     * @mbg.generated
     */
    public Integer getHrid() {
        return hrid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr_role.hrid
     *
     * @param hrid the value for hr_role.hrid
     *
     * @mbg.generated
     */
    public void setHrid(Integer hrid) {
        this.hrid = hrid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hr_role.rid
     *
     * @return the value of hr_role.rid
     *
     * @mbg.generated
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hr_role.rid
     *
     * @param rid the value for hr_role.rid
     *
     * @mbg.generated
     */
    public void setRid(Integer rid) {
        this.rid = rid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_role
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hrid=").append(hrid);
        sb.append(", rid=").append(rid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}