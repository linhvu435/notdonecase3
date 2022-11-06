
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

<form action="/createProduct" method="">
    <table>
        <h1>Create Product</h1>
        <tr>
            <td>Nhập Type</td>
            <td><input name="type" placeholder="nhậpType"></td>
        </tr>
        <tr>
            <td>Nhập img</td>
            <td><input name="img" placeholder="nhập img" ></td>
        </tr>
        <tr>
            <td>Nhập name</td>
            <td><input name="name" placeholder="nhập name"></td>
        </tr>
        <tr>
            <td>Nhập giá</td>
            <td><input name="price" placeholder="nhập price"></td>
        </tr>
        <tr>
            <td>Nhập Số Lượng</td>
            <td><input name="amount" placeholder="nhập số lượng"></td>
        </tr>
        <button type="submit">Submit</button>
    </table>
</form>

</body>
</html>
