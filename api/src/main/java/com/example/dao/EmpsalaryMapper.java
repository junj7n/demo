package com.example.dao;

import com.example.entity.Empsalary;
import java.util.List;

public interface EmpsalaryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table empsalary
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table empsalary
     *
     * @mbg.generated
     */
    int insert(Empsalary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table empsalary
     *
     * @mbg.generated
     */
    Empsalary selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table empsalary
     *
     * @mbg.generated
     */
    List<Empsalary> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table empsalary
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Empsalary record);
}