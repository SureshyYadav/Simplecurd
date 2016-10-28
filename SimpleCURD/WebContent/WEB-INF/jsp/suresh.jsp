
<%@page import="com.slokam.curd.pojo.GeoHirePojo"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<script type="text/javascript">

function gotoAction(actionPath){
	
	document.forms[0].action=actionPath;
	document.forms[0].submit();
}
</script>


<%-- <%GeoHirePojo geo=(GeoHirePojo) request.getAttribute("pojo"); --%>
<%--          GeoHirePojo pojo=new GeoHirePojo(); %> --%>


<body>

	<form:form action="savePan.do" method="post" commandName="pancard">
	PanId:<form:input type="text" path="panId" />
		<br>
		PanName:<form:input type="text" path="pancardName" />
		<br />
		 PanAddress:<form:input type="text" path="pancardAddress" />
		<br />
		<%-- Entity Type:<form:input type="text" path="entity"/><br />
		Status<form:input type="text" path="status"/><br /> --%>

		<input type="button" value="save" onclick="gotoAction('savePan.do')" />
		<input type="button" value="getAll"
			onclick="gotoAction('displayGeoHire.do')" />
		<input type="button" value="update"
			onclick="gotoAction('updateGeoHire.do')" />
		<input type="button" value="delete"
			onclick="gotoAction('deleteGeoHire.do')" />
	</form:form>
</body>


