<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script src="/js/jquery.min.js"></script>
<body>
<div>

    <table border="1" cellspacing="0">
        <thead>
            <tr>
                <td>名称</td>
                <td>操作</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${users}" var="user" >
                <tr>
                    <td>${user.name}</td>
                    <td>
                        <a href="javascript:void(0);" onclick="updateUser('${user.id}')">修改</a>
                        <a href="javascript:void(0);" onclick="deleteUser('${user.id}')">删除</a>
                    </td>
                </tr>e
            </c:forEach>
        </tbody>
    </table>


    <br/><br/><br/><br/><br/><br/><br/><hr>

    <input type="text" id="uname">
    <a href="javascript:void(0);" onclick="addUser()">添加</a>


</div>
</body>
<script>
    function addUser(){
        var name = $('#uname').val();
        window.open('/add?name=' + name);
    }

    function deleteUser(id){
        window.open('/delete?id=' + id);
    }

    function updateUser(id){
        window.open('/update?id=' + id);
    }
</script>
</html>