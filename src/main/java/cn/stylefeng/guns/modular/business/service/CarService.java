package cn.stylefeng.guns.modular.business.service;

import cn.stylefeng.guns.modular.business.entity.Car;
import cn.stylefeng.guns.modular.business.pojo.CarRequest;
import cn.stylefeng.roses.kernel.db.api.pojo.page.PageResult;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 车辆管理业务层
 *
 * @author stylefeng
 * @date 2020/3/25 14:00
 */
public interface CarService extends IService<Car> {

    /**
     * 添加车辆
     *
     * @param carRequest 添加参数
     * @author stylefeng
     * @date 2020/3/25 14:00
     */
    void add(CarRequest carRequest);

    /**
     * 删除车辆
     *
     * @param carRequest 删除参数
     * @author stylefeng
     * @date 2020/3/25 14:00
     */
    void del(CarRequest carRequest);

    /**
     * 编辑车辆
     *
     * @param carRequest 编辑参数
     * @author stylefeng
     * @date 2020/3/25 14:00
     */
    void edit(CarRequest carRequest);

    /**
     * 查看车辆详情
     *
     * @param carRequest 查看参数
     * @author stylefeng
     * @date 2020/3/25 14:00
     */
    Car detail(CarRequest carRequest);

    /**
     * 分页查询车辆
     *
     * @param carRequest 查询参数
     * @return 查询分页结果
     * @author stylefeng
     * @date 2020/3/25 14:00
     */
    PageResult<Car> findPage(CarRequest carRequest);

    /**
     * 查询所有车辆
     *
     * @param carRequest 查询参数
     * @return 查询分页结果
     * @author stylefeng
     * @date 2020/3/25 14:00
     */
    List<Car> findList(CarRequest carRequest);

}