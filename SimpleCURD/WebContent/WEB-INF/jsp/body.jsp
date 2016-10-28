
<%@page import="java.io.File"%>
<%@page import="com.slokam.curd.pojo.GeoHirePojo"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<script type="text/javascript">

function gotoAction(actionPath){
	
	document.forms[0].action=actionPath;
	document.forms[0].submit();
}
</script>


<%GeoHirePojo geo=(GeoHirePojo) request.getAttribute("pojo");
         GeoHirePojo pojo=new GeoHirePojo(); %>


<body>

	<form:form action="saveGeoHire.do" method="post" commandName="pojo"
		enctype="multipart/form-data">
		<form:input type="hidden" path="id" />
		Name:<form:input type="text" path="name" />
		<br />
		 Code:<form:input type="text" path="code" />
		<br />
		 Entity Type:<form:input type="text" path="entity" />
		<br />
		Status<form:input type="text" path="status" />
		<br />
		File Upload<form:input type="file" path="multipart" />
		<br>
		CountryList::<form:select path="countryId" onchange="gotoAction('getState.do')">
		<form:options items="${countryList}" itemLabel="name" itemValue="id" />
		</form:select><br>
		StateList::<form:select path="stateId">
		<form:options items="${stateList}" itemLabel="name" itemValue="id"/>
		</form:select><br>

		<input type="button" value="save"
			onclick="gotoAction('saveGeoHire.do')" />
		<input type="button" value="getAll"
			onclick="gotoAction('displayGeoHire.do')" />
		<input type="button" value="update"
			onclick="gotoAction('updateGeoHire.do')" />
		<input type="button" value="delete"
			onclick="gotoAction('deleteGeoHire.do')" />
	</form:form>
</body>
<%
	File file=new File("D:\\File Upload\\");
	String[] files=file.list();
	for(int i=1;i<files.length;i++){
		out.println("<a href=download.do?file="+files[i]+">"+files[i]+"</a><br>");
		
	}
		 
	%>

