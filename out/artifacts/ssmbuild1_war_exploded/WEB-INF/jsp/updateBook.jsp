<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022/2/20
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <%--BootStrap美化界面--%>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <%--出现的问题，我们提交了修改的SQL请求，但是修改失败--初次考虑，是事务问题，配置完毕，依旧失败！--%>
        <%--看一下SQL语句，能否执行成功，SQL执行失败，修改未完成--%>
            <%--传递隐藏域--%>
            <input type="hidden" name="bookID" value="${QBbooks.bookID}">
        书籍名称：<input type="text" name="bookName" value="${QBbooks.bookName}"><br><br><br>
        书籍数量：<input type="text" name="bookCounts" value="${QBbooks.bookCounts}"><br><br><br>
        书籍详情：<input type="text" name="detail" value="${QBbooks.detail}"><br><br><br>
        <input type="submit" value="提交修改">
    </form>
</div>

</body>
</html>
