package com.example.dao;

import com.example.entity.Employeeremove;
import java.util.List;

public interface EmployeeremoveMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeeremove
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeeremove
     *
     * @mbg.generated
     */
    int insert(Employeeremove record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeeremove
     *
     * @mbg.generated
     */
    Employeeremove selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeeremove
     *
     * @mbg.generated
     */
    List<Employeeremove> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employeeremove
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Employeeremove record);
}