package com.boot.star.mapper;


import com.boot.star.model.OpensaleHouse;
import com.boot.star.model.OpensaleHouseExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface OpensaleHouseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OpenSale_House
     *
     * @mbggenerated Mon May 21 10:47:21 CST 2018
     */
    int countByExample(OpensaleHouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OpenSale_House
     *
     * @mbggenerated Mon May 21 10:47:21 CST 2018
     */
    int deleteByExample(OpensaleHouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OpenSale_House
     *
     * @mbggenerated Mon May 21 10:47:21 CST 2018
     */
    int deleteByPrimaryKey(Integer houseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OpenSale_House
     *
     * @mbggenerated Mon May 21 10:47:21 CST 2018
     */
    int insert(OpensaleHouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OpenSale_House
     *
     * @mbggenerated Mon May 21 10:47:21 CST 2018
     */
    int insertSelective(OpensaleHouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OpenSale_House
     *
     * @mbggenerated Mon May 21 10:47:21 CST 2018
     */
    List<OpensaleHouse> selectByExample(OpensaleHouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OpenSale_House
     *
     * @mbggenerated Mon May 21 10:47:21 CST 2018
     */
    OpensaleHouse selectByPrimaryKey(Integer houseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OpenSale_House
     *
     * @mbggenerated Mon May 21 10:47:21 CST 2018
     */
    int updateByExampleSelective(@Param("record") OpensaleHouse record, @Param("example") OpensaleHouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OpenSale_House
     *
     * @mbggenerated Mon May 21 10:47:21 CST 2018
     */
    int updateByExample(@Param("record") OpensaleHouse record, @Param("example") OpensaleHouseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OpenSale_House
     *
     * @mbggenerated Mon May 21 10:47:21 CST 2018
     */
    int updateByPrimaryKeySelective(OpensaleHouse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OpenSale_House
     *
     * @mbggenerated Mon May 21 10:47:21 CST 2018
     */
    int updateByPrimaryKey(OpensaleHouse record);
    


}