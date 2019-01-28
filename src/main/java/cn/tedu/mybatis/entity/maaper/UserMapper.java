package cn.tedu.mybatis.entity.maaper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.User;
import vo.UserVO;

public interface UserMapper {
	Integer addnew(User user);
	User findById(Integer id);
	List<User> findAll();
	Integer getCount();
	Integer updatePassword(
			@Param("id")Integer id,
			@Param("password")String password);
	Integer deleteByIds(Integer[] ids);
	List<UserVO> findAll2();
}
