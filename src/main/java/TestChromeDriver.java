import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Test

public class TestChromeDriver {
//    public static void main(String[] args) throws InterruptedException {

    public  void test1 () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/aovchar/Desktop/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("http://fits.qauber.com");

        // WebElement name = driver.findElement(By.xpath("");
        WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='exampleInputEmail1']"));
        emailTextBox.sendKeys(new CharSequence[]{"allaovchar7@gmail.com"});
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='exampleInputPassword1']"));
        passwordTextBox.sendKeys("Marina1234");
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
        Thread.sleep(2000);
        loginButton.click();

        WebElement addReportLink = driver.findElement(By.xpath("//span[text()='Add Report'] "));
        addReportLink.click();
        WebElement entityReportPage = driver.findElement(By.xpath("//h4/div[@title ='Entity']"));
        entityReportPage.click();
        WebElement radioButton = driver.findElement(By.xpath("//label[text() = 'Alla Ovchar']/span"));
        radioButton.click();


        // Subject Information Page

        WebElement subjectInformationPage = driver.findElement(By.xpath("//h4/div[@title='Subject Information']"));
        subjectInformationPage.click();
        WebElement caseIdTextBox = driver.findElement(By.xpath("//input[@ng-model='wizard.report.caseNumber']"));
        caseIdTextBox.sendKeys("123");
        WebElement suspectTypeTextBox = driver.findElement(By.xpath("//select[@ng-model = 'wizard.report.suspectType']"));
        suspectTypeTextBox.sendKeys("Victim");
        WebElement lastNameTextBox = driver.findElement(By.xpath("//input[@ng-model='wizard.report.lastName']"));
        lastNameTextBox.sendKeys("Ovchar");
        WebElement firstNameTextBox = driver.findElement(By.xpath("//input[@ng-model='wizard.report.firstName']"));
        firstNameTextBox.sendKeys("Alla");
        WebElement middleNameTextBox = driver.findElement(By.xpath("//input[@ng-model='wizard.report.middleName']"));
        middleNameTextBox.sendKeys("G");
        WebElement nickNameTextBox = driver.findElement(By.xpath("//input[@ng-model='wizard.report.nickname']"));
        nickNameTextBox.sendKeys("Alice");
        WebElement dayOfBirthTextBox = driver.findElement(By.xpath("//input[@ng-model='wizard.report.dob']"));
        dayOfBirthTextBox.sendKeys("05/13/1998");
        WebElement ageTextBox = driver.findElement(By.xpath("//input[@ng-model = 'wizard.report.age']"));
        ageTextBox.sendKeys("20");
        WebElement sexTextBox = driver.findElement(By.xpath("//select[@ng-model='wizard.report.sex']"));
        sexTextBox.sendKeys("F");
        WebElement raceTextBox = driver.findElement(By.xpath("//select[@ng-model='wizard.report.race']"));
        raceTextBox.sendKeys("Unknown");
        WebElement heightTextBox = driver.findElement(By.xpath("//input[@ng-model='wizard.report.height']"));
        heightTextBox.sendKeys("5.2");
        WebElement weightTextBox = driver.findElement(By.xpath("//input[@ng-model='wizard.report.weight']"));
        weightTextBox.sendKeys("120");
        WebElement buildTextBox = driver.findElement(By.xpath("//select[@ng-model='wizard.report.build']"));
        buildTextBox.sendKeys("small");
        WebElement hairColorTextBox = driver.findElement(By.xpath("//select[@ng-model='wizard.report.hairColor']"));
        hairColorTextBox.sendKeys("Black");
        WebElement hairLengthTextBox = driver.findElement(By.xpath("//select[@ng-model='wizard.report.hairLength']"));
        hairLengthTextBox.sendKeys("Long");
        WebElement teethTextBox = driver.findElement(By.xpath("//select[@ng-model='wizard.report.teeth']"));
        teethTextBox.sendKeys("Gold");
        WebElement handPreferenceTextBox = driver.findElement(By.xpath("//select[@ng-model='wizard.report.handPreference']"));
        handPreferenceTextBox.sendKeys("right");
        WebElement primaryLanguageTextBox = driver.findElement(By.xpath("//input[@ng-model='wizard.report.primaryLanguage']"));
        primaryLanguageTextBox.sendKeys("English");
        WebElement streetAddressTextBox = driver.findElement(By.xpath("//input[@ng-model='wizard.report.streetAddress']"));
        streetAddressTextBox.sendKeys("Main");
        WebElement countryTextBox = driver.findElement(By.xpath("//select[@ng-model='wizard.report.country']"));
        countryTextBox.sendKeys("United States");
        //select only
        WebElement cityTextBox = driver.findElement(By.xpath("//input[@ng-model='wizard.report.city']"));
        cityTextBox.sendKeys("San Francisco");
        WebElement stateTextBox = driver.findElement(By.xpath("//select[@ng-model='wizard.report.state']"));
        stateTextBox.sendKeys("CA");
        WebElement zipTextBox = driver.findElement(By.xpath("//input[@ng-model='wizard.report.zip']"));
        zipTextBox.sendKeys("94112");
        WebElement contactTelephoneTextBox = driver.findElement(By.xpath("//input[@ng-model='wizard.report.contactTelephone']"));
        contactTelephoneTextBox.sendKeys("415-222-5555");
        WebElement contactEmailTextBox = driver.findElement(By.xpath("//input[@ng-model='wizard.report.contactEmail']"));
        contactEmailTextBox.sendKeys("allaovchar7@gmail.com");

        WebElement radioDriverButton = driver.findElement(By.xpath("//label[text() = 'Driver']/input"));
        radioDriverButton.click();

        WebElement clickNextButton = driver.findElement(By.xpath("//a[@ng-click = 'wizard.go(3)']"));
        Actions action = new Actions(driver);
        action.moveToElement(clickNextButton);
        action.click();
        action.perform();


//Identifiers Page
        WebElement checkButtonTattoos = driver.findElement(By.xpath("//input[@ng-model = 'wizard.report.tattoos']"));
        checkButtonTattoos.click();
//        WebElement checkButtonTextTattoos = driver.findElement(By.xpath("//input[@ng-model='wizard.report.tattoosDescription']"));
//        checkButtonTextTattoos.sendKeys("Tigr");
        WebElement checkButtonScars = driver.findElement(By.xpath("//input[@ng-model = 'wizard.report.scars']"));
        checkButtonScars.click();
        WebElement clickNextButton2 = driver.findElement(By.xpath("//a[@ng-click = 'wizard.go(4)']"));
        Actions actionNext = new Actions(driver);
        actionNext.moveToElement(clickNextButton2);
        actionNext.click();
        actionNext.perform();

        WebElement socialSecurityNumber = driver.findElement(By.xpath("//input[@ng-model='wizard.report.socialSecurity']"));
        socialSecurityNumber.sendKeys("345646464");
        WebElement driverLicense = driver.findElement(By.xpath("//input[@ng-model='wizard.report.driverLicense']"));
        driverLicense.sendKeys("B444444");

        //dropdown list State
        String stateCA = "California";
        WebElement newStateCA = driver.findElement(By.xpath("//select[@ng-model='wizard.report.dlState']"));
        Select newstateCA = new Select(newStateCA);
        newstateCA.selectByVisibleText(stateCA);

        WebElement otherIDNumber = driver.findElement(By.xpath("//input[@name='other-id']"));
        otherIDNumber.sendKeys("5555555");
        String countryState = "United States";
        WebElement stateSelect2 = driver.findElement(By.name("otherIdCountry"));
        Select selCountry = new Select(stateSelect2);
        selCountry.selectByVisibleText(countryState);

        //school Information - ID information page
        WebElement schoolName = driver.findElement(By.xpath("//input[@name='school-name']"));
        schoolName.sendKeys("Aragon");
        WebElement schoolAddress = driver.findElement(By.xpath("//input[@name='school-address']"));
        schoolAddress.sendKeys("Aragon str");
        WebElement schoolCity = driver.findElement(By.xpath("//input[@name='school-city']"));
        schoolCity.sendKeys("San Mateo");
        WebElement schoolState = driver.findElement(By.xpath("//select[@ng-model='wizard.report.schoolState']//option[text()='California']"));
        schoolState.click();
        WebElement schoolZip = driver.findElement(By.xpath("//input[@ng-model='wizard.report.schoolZip']"));
        schoolZip.sendKeys("94402");
        WebElement schoolTelephone = driver.findElement(By.xpath("//input[@name='schoolTelephone']"));
        schoolTelephone.sendKeys("45555555");

        WebElement parentName = driver.findElement(By.xpath("//input[@name='parent-name']"));
        parentName.sendKeys("Alex");
        WebElement parentAddress = driver.findElement(By.xpath("//input[@name='parent-address']"));
        parentAddress.sendKeys("12 Aragon st");
        WebElement parentCity = driver.findElement(By.xpath("//input[@name='parent-city']"));
        parentCity.sendKeys("Foster City");
        WebElement parentState = driver.findElement(By.xpath("//select[@ng-model='wizard.report.parentState']//option[text()='Hawaii']"));
        parentState.click();
        WebElement parentZip = driver.findElement(By.xpath("//input[@name='parentZip']"));
        parentZip.sendKeys("94404");
        WebElement parentTelephone = driver.findElement(By.xpath("//input[@name='parentTelephone']"));
        parentTelephone.sendKeys("35353555");


        WebElement subjectOccupation = driver.findElement(By.xpath("//input[@name='occupation']"));
        subjectOccupation.sendKeys("Engineer");
        WebElement employersName = driver.findElement(By.xpath("//input[@name='employer-name']"));
        employersName.sendKeys("Oracle");
        WebElement employersAddress = driver.findElement(By.xpath("//input[@name='employer-address']"));
        employersAddress.sendKeys("120 Delfin rd");
        WebElement employersCity = driver.findElement(By.xpath("//input[@name='employer-city']"));
        employersCity.sendKeys("Redwood City");
        WebElement employersState = driver.findElement(By.xpath("//select[@ng-model='wizard.report.employerState']//option[text()='California']"));
        employersState.click();
        WebElement employersZip = driver.findElement(By.xpath("//input[@name='employer-zip']"));
        employersZip.sendKeys("95444");
        WebElement employerTelephone = driver.findElement(By.xpath("//input[@name='employerTelephone']"));
        employerTelephone.sendKeys("6509898441");

        WebElement nextPage = driver.findElement(By.xpath("//*[@ng-show='wizard.active(4)']//a[@ng-click = 'wizard.go(5)']"));
        nextPage.click();
        Thread.sleep(2000);









        

    }
}
//      String title = driver.getTitle();
//        System.out.println(title);
//       String url = driver.getCurrentUrl();
//       System.out.println(url);
//        String source = driver.getPageSource();
//       System.out.println(source);
//
//
//        emailTextBox = driver.findElement(By.xpath(".//*[@id='exampleInputEmail1']"));
//        emailTextBox.sendKeys("allaovchar7@gmail.com");}
