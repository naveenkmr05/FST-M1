#Reading additional information
import time

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains


driver = webdriver.Firefox()
driver.get("http://alchemy.hguy.co/crm")

driver.find_element(By.ID, "user_name").send_keys("admin")
driver.find_element(By.ID, "username_password").send_keys("pa$$w0rd")
driver.find_element(By.NAME, "Login").click()

sales = driver.find_element(By.XPATH, "//span/a[text()='Sales']")
leads = driver.find_element(By.XPATH, "//span/ul/li/a[text()='Leads']")

action:ActionChains = ActionChains(driver)

action.move_to_element(sales).click().perform()
action.move_to_element(leads).click().perform()

time.sleep(2.0)
driver.find_element(By.XPATH, "//form[@id='MassUpdate']/div[@class='list-view-rounded-corners']/table/tbody/tr[1]/td/span/span[@title='Additional Details']").click()
time.sleep(2.0)
phoneNumber = driver.find_element(By.XPATH, "//span[@class='phone']")
print(phoneNumber.text);

driver.quit()
