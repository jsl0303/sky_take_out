package com.sky.service;

import com.sky.annotation.AutoFill;
import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.enumeration.OperationType;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

/**
 * @program: sky-take-out
 * @description:
 * @author: PZP
 * @create: 2023-09-07 20:13
 **/

public interface DishService {
    @AutoFill(value = OperationType.INSERT)
    void addDish(DishDTO dishDTO);

    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    void delete(List<Long> ids);

    DishVO selectById(Long id);

    @AutoFill(value = OperationType.UPDATE)
    void updateDish(DishDTO dishDTO);

    void startOrStop(Integer status, Long id);

    List<Dish> selectBycatId(Long catId);
}
