package cucumber.steps;

import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberTest {

    WebDriver driver;

    @假如("^我打开\"(.*?)\"网站$")
    public void openfire(String url) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\IdeaProjects\\cucumberDemo03\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement iframe=driver.findElement(By.xpath("//div[@id='loginDiv']/iframe"));
        driver.switchTo().frame(iframe);
    }

    @当("^我输入我的账号\"(.*?)\"$")
    public void sendEmail(String ac) {

        driver.findElement(By.name("email")).sendKeys(ac);
    }
    @并且("^输入我的密码\"(.*?)\"$")
    public void sendMima(String pwd) {
        driver.findElement(By.name("password")).sendKeys(pwd);

    }

    @当("^点击登录按钮$")
    public void click() throws InterruptedException {
        driver.findElement(By.id("dologin")).click();
        Thread.sleep(3000);

    }

    @那么("^登录成功$")
    public void login() throws InterruptedException {

        System.out.println("登录成功");
        Thread.sleep(3000);

    }
    @当("^我输入\"(.*?)\"账号，输入\"(.*?)\"密码$")
    public void login01(String email,String pwd){
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(pwd);
    }

    @那么("^关闭浏览器$")
    public void close() {
        driver.quit();
    }
}




/*

    @假如("^我打开\"(.*?)\"网站$")
    public void openfire(String url) {
//        System.out.println("我打开163网站");
    }

    @当("^我用\"(.*?)\"账号$")
    public void sendEmail(String ac) {
//        System.out.println("我输入了email账号:" + email);
    }

    @并且("^输入\"(.*?)\"密码$")
    public void sendMima(String pwd) {

        System.out.println("我输入了密码:" + pwd);
    }

    @当("^点击登录按钮$")
    public void click() {
        System.out.println("当我点击登录按钮");
    }

    @那么("^登录成功$")
    public void login() {

        System.out.println("登录成功");
    }
*/

//    @当("我输入\"(.*?)\"账号，输入\"(.*?)\"密码$")
//    public void login01(String email, String pwd) {
//        System.out.println(email + pwd);
//    }
//
//    @那么("^关闭浏览器$")
//    public void close() {
//        System.out.println("关闭");
//    }
//}

