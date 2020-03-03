set projectLocation=C:\Users\sriharsha.bikumalla\eclipse-workspace\Automation

cd %projectLocation%

set classpath=%projectLocation%\bin;%projectLocation%\lib\*

java org.testng.TestNG %projectLocation%\TestNG.xml

pause