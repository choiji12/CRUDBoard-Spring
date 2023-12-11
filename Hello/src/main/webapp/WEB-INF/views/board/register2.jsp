<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>

<html>
    <head>
        <title>게시물 등록</title>
        <style>
            body {
                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                margin: 0;
                padding: 0;
                background-color: #f0f0f0;
            }

            .container {
                width: 60%;
                margin: 30px auto;
                background-color: #fff;
                border-radius: 5px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                padding: 30px;
            }

            h1 {
                text-align: center;
                color: #333;
            }

            form {
                width: 100%;
                margin-top: 20px;
            }

            label {
                font-weight: bold;
                margin-bottom: 8px;
                display: block;
                color: #555;
            }

            input[type="text"],
            textarea {
                width: calc(100% - 18px);
                padding: 10px;
                margin-bottom: 15px;
                border: 1px solid #ccc;
                border-radius: 3px;
                box-sizing: border-box;
            }

            button[type="submit"] {
                background-color: #3498db;
                color: white;
                border: none;
                padding: 12px 24px;
                border-radius: 3px;
                cursor: pointer;
                font-size: 16px;
            }

            button[type="submit"]:hover {
                background-color: #2980b9;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h1>게시물 등록</h1>
            <form role="form" method="post">
                <div>
                    <label>제목</label>
                    <input type="text" name="title">
                </div>
                
                <div>
                    <label>내용</label>
                    <textarea name="content" rows="5"></textarea>
                </div>
                
                <div>
                    <label>글쓴이</label>
                    <input type="text" name="writer">
                </div>
                
                <div>
                    <button type="submit">저장</button>
                </div>
            </form>
        </div>
    </body>
</html>

<%@include file="../include/footer.jsp"%>
