package com.gong.illidan.dao.mapper;

import com.gong.illidan.dao.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.mapping.StatementType;

public interface UserMapper {

    @Select("SELECT * FROM user WHERE id = #{userId}")
    public User getUser(long userId);

    @Insert("insert into user (email, userName) values(#{email}, #{userName})")
    @SelectKey(keyProperty = "id", statementType = StatementType.STATEMENT, statement = "SELECT LAST_INSERT_ID() AS id", before = false, resultType = int.class)
    public int addUser(User user);
}
