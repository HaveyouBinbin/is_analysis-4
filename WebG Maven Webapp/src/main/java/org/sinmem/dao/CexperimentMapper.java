package org.sinmem.dao;

import org.sinmem.bean.Cexperiment;

public interface CexperimentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cexperiment
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String experimentno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cexperiment
     *
     * @mbggenerated
     */
    int insert(Cexperiment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cexperiment
     *
     * @mbggenerated
     */
    int insertSelective(Cexperiment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cexperiment
     *
     * @mbggenerated
     */
    Cexperiment selectByPrimaryKey(String experimentno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cexperiment
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Cexperiment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cexperiment
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Cexperiment record);
}