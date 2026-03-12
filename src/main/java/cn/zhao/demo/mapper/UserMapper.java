package cn.zhao.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.zhao.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * User 表 Mapper，继承 BaseMapper 后自带 CRUD 方法
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
