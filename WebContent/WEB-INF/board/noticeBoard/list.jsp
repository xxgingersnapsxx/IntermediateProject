<%@page import="damanna.vo.NoticeBoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Damanna Board List</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#noticeListBtn").on("click", function(){
		location.href="<%=request.getContextPath()%>/noticeInsert.do";
	});
});
</script>
</head>
<body>
<%
	List<NoticeBoardVO> noticeList =
		(List<NoticeBoardVO>) request.getAttribute("noticeList");
%>
	<table width="100%" cellpadding="0" cellspacing="0" border="0">
  <tr height="5"><td width="5"></td></tr>
 <tr style="background:url('img/table_mid.gif') repeat-x; text-align:center;">
<!--    <td width="5"><img src="img/table_left.gif" width="5" height="30" /></td> -->
   <td width="5"><width="5" height="30" /></td>
   <td width="73">번호</td>
   <td width="379">제목</td>
   <td width="73">작성자</td>
   <td width="164">작성일</td>
   <td width="58">조회수</td>
<!--    <td width="7"><img src="img/table_right.gif" width="5" height="30" /></td> -->
   <td width="7"><width="5" height="30" /></td>
  </tr>
<%
 	if(noticeList==null || noticeList.size()==0) {
%>	
	<tr><td colspan="5">등록된 게시글이 없습니다.</td></tr>
<%
 	}else {
 		for(NoticeBoardVO noticeVo : noticeList) {
%>
<tr style="background:url('img/table_mid.gif') repeat-x; text-align:center;">
<!--    <td width="5"><img src="img/table_left.gif" width="5" height="30" /></td> -->
   <td width="5"><width="5" height="30" /></td>
	<td><%=noticeVo.getNotice_id() %></td>
	<td><a href="<%=request.getContextPath()%>/noticeSelect.do?idx=<%=noticeVo.getNotice_id() %>"><%=noticeVo.getNotice_title() %></td>
	<td><%=noticeVo.getAdmin_id() %></td>
	<td><%=noticeVo.getNotice_date() %></td>
	<td><%=noticeVo.getNotice_count() %></td>
<!-- 	<td width="7"><img src="img/table_right.gif" width="5" height="30" /></td> -->
	<td width="7"><width="5" height="30" /></td>
</tr>
<% 			
 		}
 	}
%>

<tr height="25" align="center">
</tr>
  <tr height="1" bgcolor="#D2D2D2"><td colspan="6"></td></tr>

 <tr height="1" bgcolor="#82B5DF"><td colspan="6" width="752"></td></tr>
 </table>
 
<table width="100%" cellpadding="0" cellspacing="0" border="0">
  <tr><td colspan="4" height="5"></td></tr>
  <tr align="center">
   <td><input type=button value="글쓰기" id="noticeListBtn"></td>
  </tr>
</table>

</body>
</html>