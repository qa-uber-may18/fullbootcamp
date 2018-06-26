import unittest
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By
import time

class FitsTestLogin(unittest.TestCase):

    def setUp(self):
        #create web driver object
        exe_path = "/Users/talluri/Downloads/chromedriver"
        self.driver = webdriver.Chrome(executable_path=exe_path)
        #open fits loin page
        self.driver.get("http://fits.qauber.com/#/page/login")
        #add implicit wait of 30 sec
        self.driver.implicitly_wait(30)
        #maximum the window
        self.driver.maximize_window()
        #add page load time out
        self.driver.set_page_load_timeout(30)
        print("in setup method")


    def testLogin(self):
        #test login
        print("in test method")
        #locate the user name text box
        time.sleep(10)
        locator = (By.NAME, "account_email")
        username = self.driver.find_element(locator[0],locator[1])
        # username = self.driver.find_element_by_name("account_email")
        #locate the password text box
        password = self.driver.find_element_by_name("account_password")

        #pass username to the username box
        username.send_keys("aerosk@outlook.com")
        #send password
        password.send_keys("catus3012!")
        #press enter key
        password.send_keys(Keys.ENTER)

        time.sleep(10)
        #TODO: add explicit wait here

        #check the result
        reports_header = self.driver.find_element_by_xpath("/html/body/div[2]/section/div/h3/small")
        self.assertTrue("Search" in reports_header.text, "not on home page")

    # @unittest.skip("deliberately skipped")
    # def testloginNegative(self):
    #     #we give wrong credentials it should fail
    #     # locate the user name text box
    #     username = self.driver.find_element_by_name("account_email")
    #     # locate the password text box
    #     password = self.driver.find_element_by_name("account_password")
    #
    #     # pass username to the username box
    #     username.send_keys("t@gmail.com")
    #     # send password
    #     password.send_keys("dummy")
    #     # press enter key
    #     password.send_keys(Keys.ENTER)
    #
    #     time.sleep(10)
    #     # TODO: add explicit wait here
    #
    #     # check the result
    #     # reports_header = self.driver.find_element_by_xpath("/html/body/div[2]/div/div/div[1]/div[2]/div")
    #     self.assertTrue("correct" in self.driver.page_source, "login failed")
    #
    #
    # @unittest.expectedFailure
    # def testLoginFailure(self):
    #     #test login
    #     print("in test method")
    #     #locate the user name text box
    #     username = self.driver.find_element_by_name("account_email")
    #     #locate the password text box
    #     password = self.driver.find_element_by_name("account_password")
    #
    #     #pass username to the username box
    #     username.send_keys("aek@outlook.com")
    #     #send password
    #     password.send_keys("catus3012!")
    #     #press enter key
    #     password.send_keys(Keys.ENTER)
    #
    #     time.sleep(10)
    #     #TODO: add explicit wait here
    #
    #     #check the result
    #     reports_header = self.driver.find_element_by_xpath("/html/body/div[2]/section/div/h3/small")
    #     self.assertTrue("Search" in reports_header.text, "not on home page")


    def tearDown(self):
        print("Cleaning up")
        self.driver.close()


if __name__ == '__main__':
    #if you are running this file execute the following code
    unittest.main()


