<!DOCTYPE html>
<html lang="zh">
<head>
<meta charset="UTF-8">
<title>Document</title>
<link href="/css/index.css" rel="stylesheet" />
</head>
<body>
	<div class="container">
		<#list listUser as item>
		   ${item.username},${item.password}
		</#list>
	</div>
</body>
</html>
