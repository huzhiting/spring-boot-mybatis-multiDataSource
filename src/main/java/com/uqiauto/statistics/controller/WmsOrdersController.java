package com.uqiauto.statistics.controller;

import com.uqiauto.statistics.model.WmsOrders;
import com.uqiauto.statistics.service.WmsOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
 * 2018/5/12 15:58         huzhiting          1.0         To create
 * </p>
 * @see
 * @since
 */
@RestController
@RequestMapping("/statistics")
public class WmsOrdersController {

    @Autowired
    private WmsOrdersService wmsOrdersService;

    @RequestMapping(value = "/getErpOrders",method= RequestMethod.GET)
    public List<WmsOrders> getErpOrders() {
        List<WmsOrders> list = wmsOrdersService.selectErpOrders();
        return list;
    }

    @RequestMapping(value = "/getUnionOrders",method=RequestMethod.GET)
    public List<WmsOrders> getUnionOrders() {
        List<WmsOrders> list = wmsOrdersService.selectUnionOrders();
        return list;
    }
}
