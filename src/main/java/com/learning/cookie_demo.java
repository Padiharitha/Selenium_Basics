package com.learning;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookie_demo {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Set<Cookie> allCookies = driver.manage().getCookies();
		{
			for(Cookie c : allCookies)
			{
				System.out.println(c.getName() + " " + c.getValue());
			}
		}
		
		Cookie myCookie = new Cookie("demo_Key" , "demo_Value");
		driver.manage().addCookie(myCookie);
		
		//Delete the Cookie.
		driver.manage().deleteCookieNamed("orangehrm");
	}
}
