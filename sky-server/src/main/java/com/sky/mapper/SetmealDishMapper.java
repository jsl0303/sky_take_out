package com.sky.mapper;

import com.sky.annotation.AutoFill;
import com.sky.entity.SetmealDish;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {
    List<Long> getSetmealIdsByDishIds(List<Long> ids);

    @Delete("delete from setmeal_dish where setmeal_id = #{setmealId};")
    void deleteBySetmealId(Long setmealId);

    @Select("select * from setmeal_dish where id = #{id};")
    List<SetmealDish> selectById(Long id);

    @AutoFill(value = OperationType.INSERT)
    void insert(List<SetmealDish> setmealDishes);
}
