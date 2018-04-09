<html>
   <head>
      <title>Get form data</title>
   </head>
   
   <body>
      <h1>Reading form data:</h1>
      <ul>
         <li><p><b>First Name:</b>
             <%=String FN = request.getParameter("first_name")%> 
         </p></li>
         <li><p><b>Last  Name:</b>
		   <%=String LN = request.getParameter("last_name")%>
         </p></li>
		 <li><p><b>ID  Name:</b>
		   <%=String ID = request.getParameter("IDnumber")%>
         </p></li>
      </ul>
   
   </body>
</html>

