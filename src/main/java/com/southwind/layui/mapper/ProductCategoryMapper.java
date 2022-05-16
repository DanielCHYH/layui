package com.southwind.layui.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.southwind.layui.entity.ProductCategory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ProductCategoryMapper extends BaseMapper<ProductCategory> {
}
