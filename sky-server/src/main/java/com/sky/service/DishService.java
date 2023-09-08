package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;

/**
 * @program: sky-take-out
 * @description:
 * @author: PZP
 * @create: 2023-09-07 20:13
 **/

public interface DishService {
    void addDish(DishDTO dishDTO);

    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);
}
