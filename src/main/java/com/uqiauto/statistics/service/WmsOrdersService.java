package com.uqiauto.statistics.service;

import com.uqiauto.statistics.config.DS;
import com.uqiauto.statistics.dao.WmsOrdersMapper;
import com.uqiauto.statistics.model.WmsOrders;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author huzhiting
 * @version 1.0
 * <p>
 * <p>
 * History:
 * <p>
 * Date                 Author         Version     Description
 * ---------------------------------------------------------------------------------
 * 2018/5/12 15:54         huzhiting          1.0         To create
 * </p>
 * @see
 * @since
 */
@Service
public class WmsOrdersService {

    @Resource
    private WmsOrdersMapper wmsOrdersMapper;

    public List<WmsOrders> selectErpOrders(){
        return wmsOrdersMapper.selectAllOrders();
    }

    /**
     * 使用数据源2查询
     * @return
     */
    @DS("datasource2")
    public List<WmsOrders> selectUnionOrders(){
        return wmsOrdersMapper.selectAllOrders();
    }

}
