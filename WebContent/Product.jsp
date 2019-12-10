<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Book Store Template, Free CSS Template, TemplateMo.com</title>
<meta name="keywords" content="Book Store Template, Free CSS Template, CSS Website Layout, CSS, HTML, TemplateMo.com" />
<meta name="description" content="Book Store Template, Free CSS Template, Download CSS Website from TemplateMo.com" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<!--  Free CSS Templates from www.templatemo.com -->
<div id="templatemo_container">

	<jsp:include page="menu.jsp" />
    
    <jsp:include page="header.jsp" />
    
    <div id="templatemo_content">
    	
        <div id="templatemo_content_left">
        	<div class="templatemo_content_left_section">
            	<h1>Categories</h1>
                <ul>
                    <li><a href="index.html">Donec accumsan urna</a></li>
                    <li><a href="index.html">Proin vulputate justo</a></li>
                    <li><a href="#">In sed risus ac feli</a></li>
                    <li><a href="#">Aliquam tristique dolor</a></li>
                    <li><a href="#">Maece nas metus</a></li>
                    <li><a href="#">Sed pellentesque placerat</a></li>
                    <li><a href="#">Suspen disse</a></li>
                    <li><a href="#">Maece nas metus</a></li>
                    <li><a href="#">In sed risus ac feli</a></li>
            	</ul>
            </div>
			<div class="templatemo_content_left_section">
            	<h1>Bestsellers</h1>
                <ul>
                    <li><a href="#">Vestibulum ullamcorper</a></li>
                    <li><a href="#">Maece nas metus</a></li>
                    <li><a href="#">In sed risus ac feli</a></li>
                    <li><a href="#">Praesent mattis varius</a></li>
                    <li><a href="#">Maece nas metus</a></li>
                    <li><a href="#">In sed risus ac feli</a></li>
                    <li><a href="http://www.flashmo.com" target="_parent">Flash Templates</a></li>
                    <li><a href="http://www.templatemo.com" target="_parent">CSS Templates</a></li>
                    <li><a href="http://www.webdesignmo.com" target="_parent">Web Design</a></li>
                    <li><a href="http://www.photovaco.com" target="_parent">Free Photos</a></li>
            	</ul>
            </div>
            
            <div class="templatemo_content_left_section">                
                <a href="http://validator.w3.org/check?uri=referer"><img style="border:0;width:88px;height:31px" src="http://www.w3.org/Icons/valid-xhtml10" alt="Valid XHTML 1.0 Transitional" width="88" height="31" vspace="8" border="0" /></a>
<a href="http://jigsaw.w3.org/css-validator/check/referer"><img style="border:0;width:88px;height:31px"  src="http://jigsaw.w3.org/css-validator/images/vcss-blue" alt="Valid CSS!" vspace="8" border="0" /></a>
			</div>
        </div> <!-- end of content left -->
        
        <div id="templatemo_content_right">
        	
	<form action="ProductController" method="post">
		<c:if test="${ params.action eq 'editcart' }">
			<input type="hidden" name="action" value="update">
		</c:if>
	
		<c:if test="${ params.action eq 'new' }">
			<input type="hidden" name="action" value="save">
		</c:if>
		<table border="2">
			<tr>
				<th>Id</th>
				<td><input type="text" name="id" id="id" value="${ product.id }"></td>
			</tr>
			<tr>
				<th>Code</th>
				<td><input type="text" name="code" id="code" value="${ product.code }"></td>
			</tr>
			<tr>
				<th>Description</th>
				<td><input type="text" name="description" id="description" value="${ product.description }"></td>
			</tr>
			<tr>
				<th>Price</th>
				<td><input type="text" name="price" id="price" value="${ product.price }"></td>
			</tr>
			<tr>
				<th>ManufactureDate</th>
				<td><fmt:formatDate value="${product.mfgDate}" pattern="dd/MM/yyyy" var="mfgRefined"/><input type="text" name="manufactureDate" id="manufactureDate" value="${mfgRefined}"></td>
			</tr>
		</table>
		<input type="submit" name="submit" value="submit">
		<input type="reset" name="reset" value="reset">
	</form>

            
            
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus nec dui. Donec nec neque ut quam sodales feugiat. Nam sodales, pede vel dapibus lobortis, ipsum diam molestie risus, a vulputate risus nisl pulvinar lacus.</p>

			<p>Donec at arcu. Nunc aliquam, dolor vitae sollicitudin lacinia, nibh orci sagittis diam, dignissim sodales dui erat nec eros. Fusce quis enim. Aenean eleifend, neque hendrerit elementum sodales, odio erat sagittis quam, sed tempor orci magna vitae tellus. Proin dui mauris, tempor eget, pulvinar sed, pretium sit amet, dui. Proin vulputate justo et quam.</p>

			<p>In fermentum, eros ac tincidunt aliquam, elit velit semper nunc, a tincidunt orci lectus a arcu. Nullam commodo, arcu non facilisis imperdiet, felis lectus tempus felis, vitae volutpat augue ante quis leo. Aliquam tristique dolor ac odio. Sed consectetur, lacus et dictum tristique, odio neque elementum ante, nec eleifend leo dolor vel tortor.</p>
            
             <div class="cleaner_with_height">&nbsp;</div>
            
            <a href="index.html"><img src="images/templatemo_ads.jpg" alt="css template ad" /></a>
            
        </div> <!-- end of content right -->
    
    	<div class="cleaner_with_height">&nbsp;</div>
    </div> <!-- end of content -->
    
    <div id="templatemo_footer">
	       <a href="index.html">Home</a> | <a href="index.html">Search</a> | <a href="index.html">Books</a> | <a href="#">New Releases</a> | <a href="#">FAQs</a> | <a href="#">Contact Us</a><br />
        Copyright © 2048 <a href="#"><strong>Your Company Name</strong></a> | <a href="http://www.iwebsitetemplate.com" target="_parent">Website Templates</a> by <a href="http://www.templatemo.com" target="_parent">Free CSS Templates</a>
	</div> <!-- end of footer -->
<!--  Free CSS Template www.templatemo.com -->
</div> <!-- end of container -->
<div align=center>This template  downloaded form <a href='http://all-free-download.com/free-website-templates/'>free website templates</a></div></body>
</html>