package com.example.entity;

import java.io.Serializable;
import java.util.Date;

public class Joblevel implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column joblevel.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column joblevel.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column joblevel.titleLevel
     *
     * @mbg.generated
     */
    private String titlelevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column joblevel.createDate
     *
     * @mbg.generated
     */
    private Date createdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column joblevel.enabled
     *
     * @mbg.generated
     */
    private Boolean enabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table joblevel
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column joblevel.id
     *
     * @return the value of joblevel.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column joblevel.id
     *
     * @param id the value for joblevel.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column joblevel.name
     *
     * @return the value of joblevel.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column joblevel.name
     *
     * @param name the value for joblevel.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column joblevel.titleLevel
     *
     * @return the value of joblevel.titleLevel
     *
     * @mbg.generated
     */
    public String getTitlelevel() {
        return titlelevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column joblevel.titleLevel
     *
     * @param titlelevel the value for joblevel.titleLevel
     *
     * @mbg.generated
     */
    public void setTitlelevel(String titlelevel) {
        this.titlelevel = titlelevel == null ? null : titlelevel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column joblevel.createDate
     *
     * @return the value of joblevel.createDate
     *
     * @mbg.generated
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column joblevel.createDate
     *
     * @param createdate the value for joblevel.createDate
     *
     * @mbg.generated
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column joblevel.enabled
     *
     * @return the value of joblevel.enabled
     *
     * @mbg.generated
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column joblevel.enabled
     *
     * @param enabled the value for joblevel.enabled
     *
     * @mbg.generated
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table joblevel
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
        sb.append(", name=").append(name);
        sb.append(", titlelevel=").append(titlelevel);
        sb.append(", createdate=").append(createdate);
        sb.append(", enabled=").append(enabled);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}