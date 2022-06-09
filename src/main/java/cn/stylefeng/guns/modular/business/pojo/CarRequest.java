package cn.stylefeng.guns.modular.business.pojo;

import cn.stylefeng.roses.kernel.rule.pojo.request.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * 车辆管理请求
 *
 * @author stylefeng
 * @date 2020/3/25 14:00
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CarRequest extends BaseRequest {

    /**
     * 车辆id
     */
    @NotNull(message = "车辆id不能为空", groups = {edit.class, delete.class, detail.class})
    private Long carId;

    /**
     * 车辆名称
     */
    @NotBlank(message = "车辆名称不能为空", groups = {add.class, edit.class})
    private String carName;

    /**
     * 车辆种类：1-轿车，2-货车
     */
    @NotNull(message = "车辆种类不能为空", groups = {add.class, edit.class})
    private Integer carType;

    /**
     * 车辆颜色
     */
    private String carColor;

    /**
     * 车辆价格
     */
    private BigDecimal carPrice;

    /**
     * 制造商
     */
    private String manufacturer;

}