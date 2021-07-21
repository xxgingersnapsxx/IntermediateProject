<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath() %>/joinIn.do">
		<table border="none">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="memberId" id="memberId"></td>
				<td colspan="2"><input type="button" name="verificationBtn" id="verificationBtn" value="verification"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td colspan="3"><input type="password" name="memberPw" id="memberPw"></td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td colspan="3"><input type="password" name="memberPwCk" id="memberPwCk"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td colspan="3"><input type="text" name="memberName" id="memberName"></td>
			</tr>
			<tr>
				<td>생년월일</td>
				<td colspan="3"><input type="date" id="memBir" name="memBir"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="email" name="memberEmail" id="memberEmail"></td>
				<td colspan="2"><input type="button" name="verificationBtn" id="verificationBtn" value="verification"></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td colspan="3"><input type="text" name="memberName" id="memberName"></td>
			</tr>
			<tr>
				<td>성별</td>
				<td>남<input type="radio" id="m" name="memberGen"></td>
				<td colspan="2">여<input type="radio" id="f" name="memberGen"></td>
			</tr>
			<tr>
				<td>프로필 사진</td>
				<td><input type="file" name="memImg1"></td>
				<td colspan="2"><input type="file" name="memImg2"></td>
			</tr>
			<tr>
				<td>거주도시</td>
				<td colspan="3">
					<select name="memberCity">
						<option value="2">서울특별시</option>
						<option value="31">경기도</option>
						<option value="32">인천광역시</option>
						<option value="33">강원도</option>
						<option value="41">충청남도</option>
						<option value="42">대전광역시</option>
						<option value="43">충청북도</option>
						<option value="44">세종특별자치시</option>
						<option value="51">부산광역시</option>
						<option value="52">울산광역시</option>
						<option value="53">대구광역시</option>
						<option value="54">경상북도</option>
						<option value="55">경상남도</option>
						<option value="61">전라남도</option>
						<option value="62">광주광역시</option>
						<option value="63">전라북도</option>
						<option value="64">제주특별자치도</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>매치 타입</td>
				<td>남<input type="radio" id="mm" name="matchType"></td>
				<td>여<input type="radio" id="ff" name="matchType"></td>
				<td>둘다<input type="radio" id="bb" name="matchType"></td>
			</tr>
			<tr>
				<td>취미</td>
				<td colspan="3"></td>
			</tr>
			<tr>
				<td>프로필</td>
				<td colspan="3"></td>
			</tr>
			<tr>
				<td>insta ID</td>
				<td colspan="3"><input type="text" name="instaId" id="instaId"></td>
			</tr>
			<tr>
				<td>music</td>
				<td colspan="3"><input type="text" name="music" id="music"></td>
			</tr>
		</table>
	</form>
</body>
</html>