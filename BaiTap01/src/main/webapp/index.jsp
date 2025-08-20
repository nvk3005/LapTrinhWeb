<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
  <meta charset="UTF-8">
  <title>Đăng nhập</title>
</head>
<body>
  <form action="login-cookie" method="post">
    <div>
      <label for="username">Tên người dùng (Username):</label><br>
      <input type="text" id="username" name="username" required>
    </div>
    <div>
      <label for="password">Mật khẩu (Password):</label><br>
      <input type="password" id="password" name="pass" required>
    </div>
    <div>
      <input type="submit" value="Đăng nhập">
    </div>
  </form>
</body>
</html>
    