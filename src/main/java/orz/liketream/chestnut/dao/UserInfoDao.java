package orz.liketream.chestnut.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import orz.liketream.chestnut.domain.UserInfo;

@Repository
public class UserInfoDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int countUserInfoByUserNumAndPassword(String userNum, String password){
		String sqlStr = "SELECT count(*) FROM t_user_info info,t_user_auth auth WHERE info.user_num = ? AND auth.password = ?"; 
		return jdbcTemplate.queryForInt(sqlStr, new Object []{userNum, password});
	}
	
	public UserInfo findUserInfoByUserName(String userNum){
		String sqlStr = "SELECT user_id, user_num, user_name FROM t_user_info WHERE user_num = ?";
		final UserInfo userInfo = new UserInfo();
		jdbcTemplate.query(sqlStr, new Object[]{userNum}, new RowCallbackHandler(){

			@Override
			public void processRow(ResultSet rs) throws SQLException {
				userInfo.setUid(rs.getString("user_id"));
				userInfo.setUserNum(rs.getString("user_num"));
				userInfo.setUserName(rs.getString("user_name"));
			}
			
		});
		return userInfo;
	}
	
}
