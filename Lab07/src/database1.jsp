<html>
<head><title>Enter to database</title></head>
<body>
<table>
<%@ page import="java.util.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="java.io.*" %>
<% 

java.sql.Connection con;
java.sql.Statement s;
java.sql.ResultSet rs;
java.sql.PreparedStatement pst;

con=null;
s=null;
pst=null;
rs=null;

// Remember to change the next line with your own environment 
String url= 
"jdbc:jtds:sqlserver://acaddb/RJB_GG";
String id= "sa";
String pass = "Op4SQLclass";
try{

Class.forName("net.sourceforge.jtds.jdbc.Driver");
con = java.sql.DriverManager.getConnection(url, id, pass);

}catch(ClassNotFoundException cnfex){
cnfex.printStackTrace();

}
String sql = "select * from sale";
try{
s = con.createStatement();
rs = s.executeQuery(sql);
%>

<%
while( rs.next() ){
%><tr>
<td><%= rs.getString("FIRSTNAME") %></td>

</tr>
<%
}
%>

<%

}
catch(Exception e){
	
	e.printStackTrace();
	StringWriter sw = new StringWriter();
	e.printStackTrace(new PrintWriter(sw));
	String exceptionAsString = sw.toString();


%><tr>
<td><%= 



exceptionAsString %></td>

</tr>
<%
	}
finally{
if(rs!=null) rs.close();
if(s!=null) s.close();
if(con!=null) con.close();
}

%>

</body>
</html>

