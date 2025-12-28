package com.example.jp_order_management.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.jp_order_management.dto.ProductRankDTO;
import com.example.jp_order_management.dto.SalesReportDTO;
import com.example.jp_order_management.entity.Order;
import org.apache.ibatis.annotations.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * 订单 Mapper
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

        @Select("SELECT * FROM orders WHERE order_no = #{orderNo}")
        Optional<Order> findByOrderNo(String orderNo);

        @Select("SELECT * FROM orders WHERE user_id = #{userId} ORDER BY created_at DESC")
        List<Order> findByUserId(Long userId);

        // @Select("")
}
