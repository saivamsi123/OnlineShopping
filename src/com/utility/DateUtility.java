package com.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.text.ParseException;

public class DateUtility {
	public static Date connectStringToDate(String date) 
	{
		SimpleDateFormat dtf = new SimpleDateFormat("dd/mm/yyyy");
		try
		{
			Date dateLocal = dtf.parse(date);
			return dateLocal;
		}
		catch(ParseException pex)
		{
			pex.printStackTrace();
		}
		return null;
	}
	
	public static String connectDateToString(Date date) throws ParseException
	{
		SimpleDateFormat dtf = new SimpleDateFormat("dd/mm/yyyy");
		String dateLocal;
		dateLocal = dtf.format(date);
		return dateLocal;
		
	}
	
	public static java.sql.Date convertUtiltoSql(java.util.Date date)
	{
		return new java.sql.Date(date.getTime());
	}
}
