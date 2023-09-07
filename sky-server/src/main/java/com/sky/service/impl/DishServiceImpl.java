package com.sky.service.impl;

import com.sky.constant.StatusConstant;
import com.sky.context.BaseContext;
import com.sky.dto.DishDTO;
import com.sky.entity.Dish;
import com.sky.mapper.DishMapper;
import com.sky.service.DishService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;

/**
 * @program: sky-take-out
 * @description:
 * @author: PZP
 * @create: 2023-09-07 20:14
 **/
@Service
public class DishServiceImpl implements DishService {
    @Autowired
    private DishMapper dishMapper;

    /**
     * 新增菜品
     * @param dishDTO
     */
    public void addDish(@RequestBody DishDTO dishDTO) {
        Dish dish = new Dish();
        BeanUtils.copyProperties(dishDTO,dish);

        dish.setStatus(StatusConstant.ENABLE);

        dish.setCreateTime(LocalDateTime.now());
        dish.setCreateUser(BaseContext.getCurrentId());

        dish.setUpdateTime(LocalDateTime.now());
        dish.setUpdateUser(BaseContext.getCurrentId());

        dishMapper.addDish(dishDTO);


    }
}