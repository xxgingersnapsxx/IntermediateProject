package damanna.member.service;

import damanna.member.dao.IMemberDao;
import damanna.member.dao.MemberDaoImpl;
import damanna.vo.MemberVO;

public class MemberServiceImpl implements IMemberService {
	private IMemberDao memDao;
	
	private static MemberServiceImpl service;
	
	private MemberServiceImpl() {
		//memDao = new MemberDaoImpl();
		memDao = MemberDaoImpl.getInstance();
	}
	
	public static MemberServiceImpl getInstance() {
		if(service==null) service = new MemberServiceImpl();
		return service;
	}
	
	@Override
	public int insertMember(MemberVO memVo) {
		return memDao.insertMember(memVo);
	}
}
