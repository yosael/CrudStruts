<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<s:form action="addUser">
		<s:textfield name="id" label="Id" />
		<s:textfield name="name" label="User Name" />
		<s:textfield name="email" label="Email" />
		<s:textfield name="age" label="Age" />
		
		<!-- 
		<s:radio name="gender" label="Gender" list="{'Male','Female'}" />
		
		<s:select name="country" list="{'India','USA','UK'}" headerKey=""
			headerValue="Country" label="Select a country" />
		<s:textarea name="aboutYou" label="About You" /> 
		<s:checkbox name="mailingList"
			label="Would you like to join our mailing list?" />-->
		<s:submit />
	</s:form>

	<s:if test="userList.size() > 0">
		<div class="content">
		<table class="userTable" cellpadding="5px">
			<tr class="even">
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Edad</th>
			</tr>
			<s:iterator value="userList" status="userStatus">
				<tr
					class="<s:if test="#userStatus.odd == true ">odd</s:if><s:else>even</s:else>">
					<td><s:property value="id" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="email" /></td>
					<td><s:property value="age" /></td>
				</tr>
			</s:iterator>
		</table>
		</div>
	</s:if>

</body>
</html>