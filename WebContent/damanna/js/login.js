$(document).ready(function(){
	
});

function validateCheck(){
	//아이디,패스워드 빈칸 처리
	var memId = $("#memId").val();
	if(isEmpty(memId)){
		alert("ID를 입력해주세요🤔.");
		$("#memId").focus();
		return false;
	}
	var memPass = $("#memPass").val();
	if(isEmpty(memPass)) {
		alert("패스워드를 입력해주세요🤔");
		$("#memPass").focus();
		return false;
	}
	return true;
}