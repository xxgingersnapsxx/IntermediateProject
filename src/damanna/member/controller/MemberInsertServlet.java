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
		memvo.setMember_id(memberId);
		memvo.setMember_pw(memberPw);
		memvo.setCity_code(cityCode);
		memvo.setMember_nm(memberNm);
		memvo.setMember_bir(memberBir);
		memvo.setMember_nm(memberNm);
		memvo.setMember_bir(memberBir);
		memvo.setMembmer_mail(membmerMail);
		memvo.setMember_hp(memberHp);
		memvo.setMember_gen(memberGen);
		memvo.setMember_img1(memberImg1);
		memvo.setMember_img2(memberImg2);
		memvo.setProfile_intro(profileIntro);
		memvo.setMember_insta(memberInsta);
		memvo.setProfile_music(profileMusic);
		memvo.setMatch_type(matchType);
		
		IMemberService service = MemberServiceImpl.getInstance();
		service.insertMember(memvo);  // DB에 insert하기
		
		// 메인페이지로 이동하기
		// TODO JISU : 아직 메인 페이지 없음
		response.sendRedirect(request.getContextPath() + "/member/memberList.do");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
