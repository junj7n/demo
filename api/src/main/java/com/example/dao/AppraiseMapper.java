package com.example.dao;

import com.example.entity.Appraise;
import java.util.List;

public interface AppraiseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appraise
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appraise
     *
     * @mbg.generated
     */
    int insert(Appraise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appraise
     *
     * @mbg.generated
     */
    Appraise selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appraise
     *
     * @mbg.generated
     */
    List<Appraise> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appraise
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Appraise record);
}