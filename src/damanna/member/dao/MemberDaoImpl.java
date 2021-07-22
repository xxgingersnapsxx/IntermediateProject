package damanna.member.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import damanna.util.SqlMapClientFactory;
import damanna.vo.MemberVO;

public class MemberDaoImpl implements IMemberDao {
	// 1번
	private static MemberDaoImpl dao;
	private SqlMapClient smc; // iBatis객체가 저장될 변수 선언

	// 2번
	private MemberDaoImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}

	// 3번
	public static MemberDaoImpl getInstance() {
		if (dao == null)
			dao = new MemberDaoImpl();

		return dao;
	}

	@Override
	public int insertMember(MemberVO memVo) {
		int cnt = 0;
		try {
			Object obj = smc.insert("member.insertMember", memVo);
			if (obj == null)
				cnt = 1;

		} catch (SQLException e) {
			cnt = 0;
			e.printStackTrace();
		}

		return cnt;
	}

	@Override
	public MemberVO getMember(String memId) {
		MemberVO memVo = null;
		try {
			memVo = (MemberVO) smc.queryForObject("member.getMember", memId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memVo;
	}

	@Override
	public int loginMember(String memId) {
		int cnt = 0;

		try {
			cnt = (int) smc.queryForObject("member.loginMember", memId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
}
