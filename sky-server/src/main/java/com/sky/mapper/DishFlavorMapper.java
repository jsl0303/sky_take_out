package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface DishFlavorMapper {


    void insertBatch(List<DishFlavor> dishFlavors);

    @Delete("delete from dish_flavor where id = #{id}")
    void deleteByDishId(Long id);

    @Select("select * from dish_flavor where dish_id = #{id}")
    List<DishFlavor> getById(Long id);

}
