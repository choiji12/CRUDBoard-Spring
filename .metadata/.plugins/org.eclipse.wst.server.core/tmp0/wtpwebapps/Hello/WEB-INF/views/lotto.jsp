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
  
  // �ζ� ��ȣ ����
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
  
  // ������ �ζ� ��ȣ ���
  out.print("������ �ζ� ��ȣ: ");
  for (int num : lottoNumbers) {
    out.print(num + " ");
  }
%>
</body>
</html>