package com.uqiauto.statistics.dao;

import com.uqiauto.statistics.model.WmsOrders;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WmsOrdersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WmsOrders record);

    int insertSelective(WmsOrders record);

    WmsOrders selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WmsOrders record);

    int updateByPrimaryKey(WmsOrders record);

    List<WmsOrders> selectAllOrders();
}