package a101;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class a101test {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.a101.com.tr");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        {
            // COOKİE KABUL ETME

            List<WebElement> cookieDialog = driver.findElements(By.id("CybotCookiebotDialog"));
            if (cookieDialog.size() == 1) {
                driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
            }
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        {
            //POPUP KONTROLÜ

            List<WebElement> popPersona = driver.findElements(By.className("personaPopup"));
            if (popPersona.size() == 1){
                driver.findElement(By.className("closePopupPersona")).click();
            }
            else {
                {
                    //GİYİM & AKSESUAR BÖLÜMÜNE TIKLAMA

                    WebElement giyimAksesuar = driver.findElement(By.xpath("//a[@title='GİYİM & AKSESUAR']"));
                    giyimAksesuar.click();
                }
            }
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        {
            //POPUP KONTROLÜ

            List<WebElement> popPersona = driver.findElements(By.className("personaPopup"));

            if (popPersona.size() == 1){
                driver.findElement(By.className("closePopupPersona")).click();

            }
            else {
                {
                    //KADIN İÇ GİYİM BÖLÜMÜNE TIKLAMA

                    WebElement kadinIcGiyim = driver.findElement(By.xpath("//a[@data-value='1565']"));
                    kadinIcGiyim.click();
                }
            }
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        {
            //POPUP KONTROLÜ

            List<WebElement> popPersona = driver.findElements(By.className("personaPopup"));

            if (popPersona.size() == 1){
                driver.findElement(By.className("closePopupPersona")).click();

            }
            else {
                {
                    //DİZALTI ÇORAP BÖLÜMÜNE TIKLAMA

                    WebElement dizaltiCorap = driver.findElement(By.xpath("//a[@data-value='1567']"));
                    dizaltiCorap.click();
                }
            }
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        {
            //POPUP KONTROLÜ

            List<WebElement> popPersona = driver.findElements(By.className("personaPopup"));

            if (popPersona.size() == 1){
                driver.findElement(By.className("closePopupPersona")).click();

            }
            else {
                {
                    //RENGİ SİYAH OLAN ÜRÜNE TIKLAMA

                    WebElement product = driver.findElement(By.xpath("//article[@data-pk='18864']"));
                    product.click();
                }
            }
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        {
            //POPUP KONTROLÜ

            List<WebElement> popPersona = driver.findElements(By.className("personaPopup"));

            if (popPersona.size() == 1){
                driver.findElement(By.className("closePopupPersona")).click();

            }
            else {
                {
                    //SEPETE EKLE BUTONUNA TIKLAMA

                    WebElement sepeteEkle = driver.findElement(By.xpath("//button[@class='add-to-basket button green block with-icon js-add-basket']"));
                    sepeteEkle.click();
                }
            }
        }

        {
            //POPUP KONTROLÜ

            List<WebElement> popPersona = driver.findElements(By.className("personaPopup"));

            if (popPersona.size() == 1){
                driver.findElement(By.className("closePopupPersona")).click();

            }
            else {
                {
                    //"SEPETİ GÖRÜNTÜLE" TEXTİNE TIKLAMA

                    driver.findElement(By.linkText("Sepeti Görüntüle")).click();
                }
            }
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        {
            //POPUP KONTROLÜ

            List<WebElement> popPersona = driver.findElements(By.className("personaPopup"));

            if (popPersona.size() == 1){
                driver.findElement(By.className("closePopupPersona")).click();

            }
            else {
                {
                    //"SEPETİ ONAYLA" BUTONUNA TIKLAMA

                    WebElement sepeteOnayla = driver.findElement(By.xpath("//a[@class='button green checkout-button block js-checkout-button']"));
                    sepeteOnayla.click();
                }
            }
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        {
            //POPUP KONTROLÜ

            List<WebElement> popPersona = driver.findElements(By.className("personaPopup"));

            if (popPersona.size() == 1){
                driver.findElement(By.className("closePopupPersona")).click();

            }
            else {
                {
                    //"ÜYE OLMADAN DEVAM ET" BÖLÜMÜNE TIKLAMA

                    WebElement uyeDevamEt = driver.findElement(By.xpath("//a[@class='auth__form__proceed js-proceed-to-checkout-btn']"));
                    uyeDevamEt.click();
                }
            }
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        {
            //POPUP KONTROLÜ

            List<WebElement> popPersona = driver.findElements(By.className("personaPopup"));

            if (popPersona.size() == 1){
                driver.findElement(By.className("closePopupPersona")).click();

            }
            else {
                {
                    //EMAİL YAZILIP DEVAM EDİLMESİ

                    WebElement email = driver.findElement(By.xpath("//input[@name='user_email']"));
                    email.click();
                    email.sendKeys("mtalhakmsgl@outlook.com");

                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

                    WebElement sendEmail = driver.findElement(By.xpath("//button[@class='button block green']"));
                    sendEmail.click();
                }
            }
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        {
            //POPUP KONTROLÜ

            List<WebElement> popPersona = driver.findElements(By.className("personaPopup"));

            if (popPersona.size() == 1){
                driver.findElement(By.className("closePopupPersona")).click();

            }
            else {
                {
                    //"YENİ ADRES EKLE" BÖLÜMÜNE TIKLAMA

                    WebElement newAddress = driver.findElement(By.xpath("//a[@class='new-address js-new-address']"));
                    newAddress.click();
                }
            }
        }

        {
            //////////////////ADRES OLUŞTURMA BÖLÜMÜ/////////////////////



            //POPUP KONTROLÜ

            List<WebElement> popPersona = driver.findElements(By.className("personaPopup"));

            if (popPersona.size() == 1){
                driver.findElement(By.className("closePopupPersona")).click();

            }
            else {
                {
                    //ADRES BAŞLIĞI EKLEME
                    WebElement addressTitle = driver.findElement(By.xpath("//input[@name='title']"));
                    addressTitle.click();
                    addressTitle.sendKeys("Ev Adresi");

                    //AD EKLEME
                    WebElement addressName = driver.findElement(By.xpath("//input[@name='first_name']"));
                    addressName.click();
                    addressName.sendKeys("Mücahid Talha");

                    //SOYAD EKLEME
                    WebElement addressSurname = driver.findElement(By.xpath("//input[@name='last_name']"));
                    addressSurname.click();
                    addressSurname.sendKeys("Kamışlıgöl");

                    //TELEFON EKLEME
                    WebElement addressPhone = driver.findElement(By.xpath("//input[@name='phone_number']"));
                    addressPhone.click();
                    addressPhone.sendKeys("5061151525");

                    //ŞEHİR SEÇME
                    driver.findElement(By.name("city")).click();
                    {
                        WebElement dropdown = driver.findElement(By.name("city"));
                        dropdown.findElement(By.xpath("//option[. = 'ANKARA']")).click();
                    }

                    //İLÇE SEÇME
                    driver.findElement(By.name("township")).click();
                    {
                        WebElement dropdown = driver.findElement(By.name("township"));
                        dropdown.findElement(By.xpath("//option[. = 'MAMAK']")).click();
                    }

                    //MAHALLE SEÇME
                    driver.findElement(By.name("district")).click();
                    {
                        WebElement dropdown = driver.findElement(By.name("district"));
                        dropdown.findElement(By.xpath("//option[. = 'TUZLUÇAYIR MAH']")).click();
                    }

                    {
                        //ADRES EKLEME
                        WebElement addressLine = driver.findElement(By.xpath("//textarea[@name='line']"));
                        addressLine.click();
                        addressLine.sendKeys("Lorem ipsum dolor sit amet, consectetur adipisicing elit");
                    }

                    {
                        //"KAYDET" BUTONUNA TIKLAMA
                        WebElement submitAdr = driver.findElement(By.xpath("//button[@class='button green address-modal-submit-button js-set-country js-prevent-emoji js-address-form-submit-button']"));
                        submitAdr.click();
                    }
                }
            }
        }

        {
            //"KAYDET VE DEVAM ET" BUTONUNA TIKLAMA VE SİPARİŞ TAMAMLAMA SAYFASINA YÖNLENDİRME

            WebElement siparisdevam = driver.findElement(By.xpath("//button[@class='button block green js-proceed-button']"));
            siparisdevam.click();
        }

        {
            //"SİPARİŞİ TAMAMLA" SAYFASINA ULAŞILDIĞINI KONTROL ETME
            WebElement orderComplete = driver.findElement(By.xpath("//div[@class='card-detail']"));
            String text = orderComplete.getText();

            if(text == "Başka bir kart ile ödemek istiyorum"){
                driver.close();
            }
        }
    
    }

}
