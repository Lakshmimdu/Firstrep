//package org.toolsexe;
//
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//import org.toolslocator.ToolsLogin;
//
//public class ToolsLoginExe extends ToolsLogin {
//	@Test(priority = 1)
//
//	public void url() {
//		browserOpen("chrome");
//		launch("https://demoqa.com/automation-practice-form");
//		windowMaximize();
//
//	}
//
//	@Test(priority = 2)
//	public void signIn() {
//		findElementByLinkText(signin).click();
//
//	}
//
//	@Parameters("FirstName")
//	@Test(priority = 3)
//	public void userName(String fname) {
//		sendKey(findElementById(fName), fname);
//		System.out.println(fname);
//	}
//
//	@Parameters("LastName")
//	@Test(priority = 4)
//	public void passWord(String lname) {
//		sendKey(findElementById(lName), lname);
//		System.out.println(lname);
//	}
//
//	@Parameters("Email")
//	@Test(priority = 5)
//	public void email(String emaili) {
//		sendKey(findElementById(email), emaili);
//
//	}
//
//	@Test(priority = 6)
//	public void radio() {
//		click(findElementById(gender));
//
//	}
//
//	@Parameters("phno")
//	@Test(priority = 7)
//	public void phno(String phno) {
//		sendKey(findElementById(phnumber), phno);
//	}
//
//	@Parameters("dob")
//	@Test(priority = 8)
//	public void dob(String dob) {
//		clear(findElementById(dobirth));
//		sendKey(findElementById(dobirth), dob);
//	}
//
//	@Parameters("sub")
//	@Test(priority = 9)
//	public void sub(String sub) {
//		sendKey(findElementById(subject), sub);
//	}
//
//	@Test(priority = 10)
//	public void hobbies() {
//		click(findElementById(hob));
//
//	}
//
//	@Parameters("currentadress")
//	@Test(priority = 11)
//	public void add(String add) {
//		sendKey(findElementById(caddress), add);
//	}
//
//	@Test(priority = 12)
//	public void assertcheck() {
//		String expectedurl = driver.getCurrentUrl();
//		System.out.println(expectedurl);
//		String actualurl = "https://demoqa.com/automation-practice-form";
//		if (actualurl.equals(expectedurl)) {
//			System.out.println("Test passed");
//		} else {
//			System.out.println("Test failed");
//		}
//	}
//}
