package damanna.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import damanna.member.service.IMemberService;
import damanna.member.service.MemberServiceImpl;
import damanna.vo.MemberVO;

/**
 * Servlet implementation class MemberLoginServlet
 */
@WebServlet("/memberLogin.do")
public class MemberLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IMemberService service = MemberServiceImpl.getInstance();

		String MemberId = request.getParameter("login_id");

		int cnt = service.loginMember(MemberId);

		request.setAttribute("loginRst", cnt);

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/JS-Test/loginTest.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
