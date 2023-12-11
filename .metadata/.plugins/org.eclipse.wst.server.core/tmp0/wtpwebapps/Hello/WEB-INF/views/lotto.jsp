<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
  Random random = new Random();
  int[] lottoNumbers = new int[6];
  int maxNumber = 45;
  int i = 0;
  
  // 로또 번호 생성
  while (i < lottoNumbers.length) {
    int num = random.nextInt(maxNumber) + 1;
    boolean isDuplicated = false;
    for (int j = 0; j < i; j++) {
      if (num == lottoNumbers[j]) {
        isDuplicated = true;
        break;
      }
    }
    if (!isDuplicated) {
      lottoNumbers[i] = num;
      i++;
    }
  }
  
  // 생성된 로또 번호 출력
  out.print("생성된 로또 번호: ");
  for (int num : lottoNumbers) {
    out.print(num + " ");
  }
%>
</body>
</html>