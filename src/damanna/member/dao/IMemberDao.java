package damanna.member.dao;

import damanna.vo.MemberVO;

/**
 * 실제 DB와 연결해서 SQL문을 수행하여 결과를 작성해서 Service에게 전달하는
 * DAO의 interface
 */
public interface IMemberDao {
	/**
	 * MemberVO에 담겨진 데이터를 DB에 insert하는 메서드
	 * @param memVo DB에 insert할 자료가 저장될 MemberVO객체
	 * @return 작업 성공 : 1이상, 작업실패 : 0
	 */
	public int insertMember(MemberVO memVo);
	
	/**
	 * 회원ID를 매개변수로 받아서 해당 회원ID의 정보를 가져오는 메서드
	 * @param memId 가져올 회원ID
	 * @return 조건에 맞는 회원정보가 저장된 MemberVO객체
	 */
	public MemberVO getMember(String memId);
	
	/**
	 * Member ID를 이용해 Login하는 메서드
	 * @param memId 로그인할 회원 ID
	 * @return 일치하는 회원 존재시 1, 미존재시 0
	 */
	public int loginMember(String memId);
}








