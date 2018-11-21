package com.leyou.item.mapper;

import com.leyou.item.pojo.Category;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;

import java.util.Arrays;
import java.util.List;

/**
 * < 接口的描述 >
 * <  >
 *
 * @author Aki
 * @create 2018-11-13 9:53
 */
@org.apache.ibatis.annotations.Mapper
public interface CategoryMapper extends Mapper<Category> ,SelectByIdListMapper<Category, Long> {


}
