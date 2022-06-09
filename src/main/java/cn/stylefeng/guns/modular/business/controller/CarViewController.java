package cn.stylefeng.guns.modular.business.controller;

import cn.stylefeng.roses.kernel.scanner.api.annotation.ApiResource;
import cn.stylefeng.roses.kernel.scanner.api.annotation.GetResource;
import org.springframework.stereotype.Controller;

/**
 * 车辆管理界面
 *
 * @author fengshuonan
 * @date 2020/3/25 14:00
 */
@Controller
@ApiResource(name = "车辆管理界面")
public class CarViewController {

    /**
     * 车辆管理首页
     *
     * @author fengshuonan
     * @date 2020/3/25 14:00
     */
    @GetResource(name = "车辆管理首页", path = "/view/car")
    public String carIndex() {
        return "/modular/business/car/car.html";
    }

    /**
     * 车辆管理-新增
     *
     * @author fengshuonan
     * @date 2020/3/25 14:00
     */
    @GetResource(name = "车辆管理-新增", path = "/view/car/add")
    public String carAdd() {
        return "/modular/business/car/car_add.html";
    }

    /**
     * 车辆管理-编辑
     *
     * @author fengshuonan
     * @date 2020/3/25 14:00
     */
    @GetResource(name = "车辆管理-编辑", path = "/view/car/edit")
    public String carEdit() {
        return "/modular/business/car/car_edit.html";
    }

}