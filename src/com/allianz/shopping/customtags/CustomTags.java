package com.allianz.shopping.customtags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomTags extends TagSupport {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int doStartTag() throws JspException {  
	    JspWriter out=pageContext.getOut();  
	    try{  
	        out.print(name);  
	    }catch(Exception e){e.printStackTrace();}  
	      
	    return SKIP_BODY;  
	}  
}
