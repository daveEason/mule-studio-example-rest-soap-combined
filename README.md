
WELCOME
=======
Welcome to the Mule Example Studio REST & SOAP combined implementation application 

TESTING
=======

This application utilizes both the Jersey and CXF annotations in a common Java class "org.ordermgmt.ProcessOrderImpl" to demonstrate how to implement a REST and SOAP service in a single component.

Importing this example project into Mule Studio
-----------------------------------------------

1) Clone this git repoistory to a local directory

2) From Mule Studio complete the following steps:
	- File > IMPORT
	- Select "Mule > Mule Studio Project from External Location" (click Next)
	- Project Root select local directory from step (1)
	- Click "Finish"

Testing the REST component
--------------------------

1) Start the application from within Mule Studio, by right clicking on the project and selecting 'Run As > Mule Application'

2) Open a command line terminal

3) Change directory 'cd' to the /src/test/resources directory, you will see the 'Order.json' file contained in this location.

4) Invoke the following 'curl' command:
	curl -X POST -H "Content-Type: application/json" -d @Order.json http://localhost:1081/order/fulfillment

5) Note: For testing locally the http.rest.port parameter is required to be set, this can be found in the /src/main/app/mule-app.properties file

Testing the SOAP component
--------------------------

1) Start the application from within Mule Studio, by right clicking on the project and selecting 'Run As > Mule Application'

2) Using SOAPUI (http://www.soapui.org/) open the Soap-UI test project named "Fulfillment-Soap-Rest-Combined-TestSoapProject-soapui-project.xml" located in the /src/test/resources directory.

3) Use the test request contained within this project to invoke the Mule SOAP application.

4) Note: The SOAP WSDL for this services can be accessed directly when the application is running at the following location "http://localhost:1080/order/fulfillment?wsdl"

5) Note also: For testing locally the http.soap.port parameter is required to be set, this can be found in the /src/main/app/mule-app.properties file

ADDITIONAL RESOURCES
====================
Everything you need to know about getting started with Mule can be found here:
http://www.mulesoft.org/documentation/display/MULE3INTRO/Home

Remember if you get stuck you can try getting help on the Mule user list:
http://www.mulesoft.org/email-lists

Also, MuleSoft, the company behind Mule, offers 24x7 support options:
http://www.mulesoft.com/enterprise-subscriptions-and-support

Enjoy your Mule ride!

The Mule Team
