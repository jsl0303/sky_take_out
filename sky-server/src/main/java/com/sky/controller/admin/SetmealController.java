package com.sky.controller.admin;

import com.sky.service.SetmealService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: sky-take-out
 * @description:
 * @author: PZP
 * @create: 2023-09-09 08:04
 **/

@RestController
@RequestMapping("/admin/setmeal")
@Slf4j
@Api("套餐相关")
public class SetmealController {

    @Autowired
    private SetmealService setmealService;

}
