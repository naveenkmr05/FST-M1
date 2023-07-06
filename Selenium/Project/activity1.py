# Verify the website title

from selenium import webdriver

driver = webdriver.Firefox()
driver.get("http://alchemy.hguy.co/crm")
pageTitle1 = driver.title
print(pageTitle1)
assert pageTitle1 == 'SuiteCRM'

driver.quit()