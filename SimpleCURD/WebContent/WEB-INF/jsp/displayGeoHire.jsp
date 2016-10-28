<%@page import="com.slokam.curd.pojo.GeoHirePojo"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<body>
	<table border="2" color="red">
		<th><a href="sortGeoHireName.do?option=1">NAME</a></th>
		<th><a href="sortGeoHireName.do?option=2">CODE</a></th>
		<th><a href="sortGeoHireName.do?option=3">ENTITY</a></th>
		<th><a href="sortGeoHireName.do?option=4">STATUS</a></th>

		<c:forEach items="${POjoList}" var="obj">
			<tr>
				<td><a href="getGeoHire.do?id=${obj.id}">${obj.name}</a></td>
				<td>${obj.code}</td>
				<td>${obj.entity}</td>
				<td>${obj.status}</td>
		</c:forEach>
	</table>
	<%-- <%Integer pageno=(Integer) session.getAttribute("pageNo");
if(pageno==1){
%>
<a href="#">Previous</a>
<%}else { %>
<a href="previousPageGeoHire.do">Previous</a>
<%} %>
<%=pageno %>
<% String nextPage=(String) session.getAttribute("end");
if(nextPage!=null && nextPage.equals("yes")){
%>
<a href="#">Next</a>
<%}else{ %>
<a href="nextPageGeoHire.do">Next</a>
<%} %> --%>
	<%Integer pageno=(Integer) session.getAttribute("pageNo");
%>
	<a href="previousPageGeoHire.do">Previous</a>
	<%=pageno %>
	<a href="nextPageGeoHire.do">Next</a>
</body>

<%-- <table border="2" color="red">
<th>NAME</th>
<th>CODE</th>
<th>ENTITY</th>
<th>STATUS</th>

<%List<GeoHirePojo> pojo=(List<GeoHirePojo>)request.getAttribute("POjoList");
for(GeoHirePojo pojo1 :pojo)
{

%>
<tr>

<td><a href="getGeoHire.do?id=<%=pojo1.getId()%>"><%=pojo1.getName()%></td>
<td><%=pojo1.getCode() %></td>
<td><%=pojo1.getEntity() %></td>
<td><%=pojo1.getStatus() %></td>
</td>
<%} %>
</table> --%>