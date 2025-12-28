package com.example.jp_order_management.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.jp_order_management.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 分类 Mapper
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

    @Select("SELECT * FROM categories WHERE parent_id = #{parentId} ORDER BY sort_order")
    List<Category> findByParentId(Long parentId);
}
