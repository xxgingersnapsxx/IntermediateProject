package damanna.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import damanna.member.service.IMemberService;
import damanna.member.service.MemberServiceImpl;
import damanna.vo.MemberVO;

@WebServlet("/member/memberInsert.do")
public class MemberInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		// form에서 입력한 데이터 받아오기
		String memberId = request.getParameter("memberId");
		String memberPw = request.getParameter("memberPw");
		int cityCode = Integer.valueOf(request.getParameter("cityCode"));
		String memberNm = request.getParameter("memberNm");
		String memberBir = request.getParameter("memberBir");
		String membmerMail = request.getParameter("membmerMail");
		String memberHp = request.getParameter("memberHp");
		String memberGen = request.getParameter("memberGen");
		String memberImg1 = request.getParameter("memberImg1");
		String memberImg2 = request.getParameter("memberImg2");
		String profileIntro = request.getParameter("profileIntro");
		String memberInsta = request.getParameter("memberInsta");
		String profileMusic = request.getParameter("profileMusic");
		String matchType = request.getParameter("matchType");
		
		// 받아온 데이터를 VO객체에 담기
		MemberVO memvo = new MemberVO();
		memvo.setMemberId(memberId);
		memvo.setMemberPw(memberPw);
		memvo.setCityCode(cityCode);
		memvo.setMemberNm(memberNm);
		memvo.setMemberBir(memberBir);
		memvo.setMemberNm(memberNm);
		memvo.setMemberBir(memberBir);
		memvo.setMembmerMail(membmerMail);
		memvo.setMemberHp(memberHp);
		memvo.setMemberGen(memberGen);
		memvo.setMemberImg1(memberImg1);
		memvo.setMemberImg2(memberImg2);
		memvo.setProfileIntro(profileIntro);
		memvo.setMemberInsta(memberInsta);
		memvo.setProfileMusic(profileMusic);
		memvo.setMatchType(matchType);
		
		IMemberService service = MemberServiceImpl.getInstance();
		service.insertMember(memvo);  // DB에 insert하기
		
		// 회원 목록으로 이동하기
		response.sendRedirect(request.getContextPath() + "/member/memberList.do");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
