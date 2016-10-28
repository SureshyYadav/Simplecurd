<html class="">
<head>
<title>SBI</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="css/sbi_css.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="script/sbi.js"></script>

</head>

<%-- <%@page import="com.slokam.curd.pojo.GeoHirePojo"%>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> --%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!-- <script type="text/javascript">

function gotoAction(actionPath){
	
	document.forms[0].action=actionPath;
	document.forms[0].submit();
}

/* function save(){
	alert("SAVE")
	document.forms[0].action="saveGeoHire.do";
	document.forms[0].submit();
}
function getAll(){
	alert("GetAll")
	document.forms[0].action="displayGeoHire.do";
	document.forms[0].submit();
}
function update(){
	alert("Update")
	document.forms[0].action="updateGeoHire.do";
	document.forms[0].submit();
}
function deletel(){
	alert("Delete")
	document.forms[0].action="deleteGeoHire.do";
	document.forms[0].submit();
}  */


</script> -->

<body>
	<table border="0" cellpadding="0" cellspacing="0" height="100%">

		<tbody>
			<tr>
				<tiles:insertAttribute name="header" />
			</tr>
			<tr>
				<tiles:insertAttribute name="topMenu" />
			</tr>
			<tr>
				<td class="div_bg">&nbsp;</td>
			</tr>
			<tr>
				<td class="con">
					<table id="container" class="con_table" border="0" cellpadding="0"
						cellspacing="0">
						<tbody>
							<tr>
								<td class="con_left"><tiles:insertAttribute name="leftSide" />

								</td>

								<%-- <td class="con_right">
				<tiles:insertAttribute name="body1"/>
  			</td> --%>
								<td class="con_right"><tiles:insertAttribute name="body" />
								</td>
							</tr>
						</tbody>
					</table>
				</td>
			</tr>
			<tr>
				<td class="footer"><tiles:insertAttribute name="footer" /></td>
			</tr>
		</tbody>

		<%-- <%GeoHirePojo geo=(GeoHirePojo) request.getAttribute("pojo");
         GeoHirePojo pojo=new GeoHirePojo();
         %> --%>
		<%--  <tiles:insertAttribute name="header"/>
         <tiles:insertAttribute name="topMenu"/>
         <tiles:insertAttribute name="body"/>
         <tiles:insertAttribute name="leftSide"/>
         <tiles:insertAttribute name="footer"/> --%>

		<%-- <%@ include file="/WEB-INF/jsp/header.jsp" %>
<%@ include file="/WEB-INF/jsp/topMenu.jsp" %>
<%@ include file="/WEB-INF/jsp/leftSide.jsp" %>
<%@include file="/WEB-INF/jsp/footer.jsp"%> --%>


		<%-- <form:form action="saveGeoHire.do" method="post" commandName="pojo">
	<form:input type="hidden" path="id"/>
		Name:<form:input type="text" path="name"/><br />
		 Code:<form:input type="text" path="code"/><br />
		 Entity Type:<form:input type="text" path="entity"/><br />
		Status<form:input type="text" path="status"/><br />
		
		 <input type="button" value="save" onclick="gotoAction('saveGeoHire.do')"/>
		 <input type="button" value="getAll" onclick="gotoAction('displayGeoHire.do')"/>
		 <input type="button" value="update" onclick="gotoAction('updateGeoHire.do')"/>
		 <input type="button" value="delete" onclick="gotoAction('deleteGeoHire.do')"/>
	</form:form> --%>

	</table>

</body>
</html>