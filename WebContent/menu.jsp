

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>

	<div id="templatemo_menu">
    	<ul>
            <li><a href="subpage.html" class="current">Home</a></li>
            <li><a href="subpage.html">Search</a></li>
            <li><a href="subpage.html">Books</a></li>            
            <li><a href="subpage.html">New Releases</a></li>  
            <li><a href="#">Company</a></li> 
            <li><a href="#">Contact</a></li>
            <li><a href="CheckOutController?action=showOrders">View Orders</a></li>
            <c:if test="${username eq null }">
           		<c:redirect url="login.jsp"></c:redirect>
            </c:if>
            <c:if test="${username ne null }">
            <li> <a href="#">Hello ${username}</a></li>
            </c:if>
            <c:if test="${username ne null }">
            	<li><a href="logout.jsp">Logout</a></li>
            </c:if>
    	</ul>
    </div> <!-- end of menu -->