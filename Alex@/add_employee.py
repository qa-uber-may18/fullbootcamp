import unittest
from random import randint
from time import sleep
from selenium import webdriver


class AddEmployee(unittest.TestCase):

    def setUp(self):
        self.driver = webdriver.Chrome(
            executable_path='C:/Users/Alex/PycharmProjects/my_test/chromedriver.exe'
        )
        self.driver.get('http://hrm-online.portnov.com')

    def tearDown(self):
        self.driver.quit()


    def test_something(self):
        empId = randint(100000,999999)
        expected_job_title = "QA Manajer"
        driver = self.driver

        driver.find_element_by_id('txtUsername').send_keys('admin')
        driver.find_element_by_id('txtPassword').send_keys('password')
        driver.find_element_by_id('btnLogin').click()

        sleep(2)

        welcome_text = driver.find_element_by_id('welcome').text
        self.assertEqual('Welcome Admin', welcome_text)

        # Click the Add button
        driver.find_element_by_id("btnAdd").click()
        # TODO  EY: may need to come back and do 'something'

        # Enter First and Last name
        driver.find_element_by_id("firstName").send_keys("James")
        driver.find_element_by_id("lastName").send_keys("Bond")

        # Enter and remember the empId
        driver.find_element_by_id("employeeId").clear()
        driver.find_element_by_id("employeeId").send_keys(empId)

        # Save the Employee
        driver.find_element_by_id("btnSave").click()

        # Go to PIM page
        driver.find_element_by_id("menu_pim_viewPimModule").click()
        # TODO  EY: may need to come back and do 'something' here as well :P

        # Search by EmpId
        driver.find_element_by_id("empsearch_id").send_keys(empId)
        driver.find_element_by_id("searchBtn").click()

        # Expected: 1 record back
        self.assertTrue(len(driver.find_elements_by_xpath("//td[3]/a")) == 1)


        # Expected Correct Full Name
        firstName = driver.find_element_by_xpath("//td[3]/a").text
        lastName = driver.find_element_by_xpath("//td[4]/a").text


        self.assertEqual("James", firstName)
        self.assertEqual("Bond", lastName)


if __name__ == '__main__':
    unittest.main()
