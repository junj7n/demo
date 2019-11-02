package com.example.dao;

import com.example.entity.Nation;
import java.util.List;

public interface NationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nation
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nation
     *
     * @mbg.generated
     */
    int insert(Nation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nation
     *
     * @mbg.generated
     */
    Nation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nation
     *
     * @mbg.generated
     */
    List<Nation> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nation
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Nation record);
}