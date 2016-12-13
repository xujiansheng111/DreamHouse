<%--
  Created by IntelliJ IDEA.
  User: xujiansheng
  Date: 2016/12/13
  Time: 上午11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:plugin type="applet" codebase="dirname" code="MyApplet.class"
            width="60" height="80">
    <jsp:params>
        <jsp:param name="fontcolor" value="red"/>
        <jsp:param name="background" value="black"/>
    </jsp:params>

    <jsp:fallback>
        Unable to initialize Java Plugin
    </jsp:fallback>

</jsp:plugin>

</body>
</html>
