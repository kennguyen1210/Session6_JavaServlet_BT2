<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<form action="/DiscountServlet" method="post">
    <div>
        <lable for="productDescription">Product Description</lable>
        <textarea name="productDescription" id="productDescription"></textarea>
    </div>
    <div>
        <lable for="listPrice">List Price</lable>
        <input type="text" name="listPrice" id="listPrice">
    </div>
    <div>
        <lable for="discountPercent">Discount Percent</lable>
        <input type="number" name="discountPercent" id="discountPercent">
    </div>

    <input type="submit" value="Calculate Discount" name="action">

</form>
</body>
</html>