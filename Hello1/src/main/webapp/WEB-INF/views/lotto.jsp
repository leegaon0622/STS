<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" %>

<%@ page import = "java.util.*" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	HOME !
</h1>

<%
	Random ran = new Random(); //난수 생성을 위한 Random class 생성
	int nLottoNum = 6; //임의의 6개 숫자
	int arrLotto[] = new int[nLottoNum]; //6개의 난수를 저장할 버퍼
	
	//초기화..
	//곱셈과 나눗셈의 초기화는 1
	//덧셈과 뺄셈의 초기화는 0
	//class의 초기화는 Null 
	for(int i=0; i<=nLottoNum-1; i++){
		arrLotto[i] = 0;
	}
	
	int nCurrentCnt = 0; //생성딘 난수의 현재 갯수
	int nCurrentVal = 0; //생성된 현재 난수의 값
	boolean bExistVal = false;
	
	for(;;){//무한반복
		nCurrentVal = ran.nextInt(45)+1; //45로 나눈 나머지이므로 0~44니까 +1을 한다. 
		bExistVal = false;
		
		//생성한 난수 중복체크
		for(int j=0; j<=nCurrentCnt; j++){
			if(arrLotto[j]==nCurrentVal){ //중복이 있는지?
					out.print("중복발생<br>");
					bExistVal = true;
					continue;
			}
		}
		if(!bExistVal) {
			arrLotto[nCurrentCnt] = nCurrentVal;
			nCurrentCnt ++; //배열의 index를 추가
		}
		if(nCurrentCnt == 6)
			break;
	}
	for(int i=0; i<=nLottoNum-1; i++){
		out.print(i+1+"번째 숫자:" + arrLotto[i] + "<br>");
	}
%>

</body>
</html>