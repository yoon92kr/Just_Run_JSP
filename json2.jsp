<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html>
<head>
<title>JSON 테스트2</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
	$(function test() {
		$("#checkJson").click(function test() {
			var jsonStr = '{"age": [22, 33, 44] }';
			var jsonInfo = JSON.parse(jsonStr);
			var output = "회원나이<br>";
			output += "--------<br>";
			for (var i in jsonInfo.age) {
				output += jsonInfo.age[i] + "<br>";
			}
			$("#output").html(output);
		});
	});
</script>
</head>
<body>
	<a id="checkJson">출력</a>
	<br>
	<div id="output"></div>
</body>
</html>
