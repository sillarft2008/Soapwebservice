# Soapwebservice
I created a soap based webservice application named SIWebserverServer that takes a text as an input parameter and 
returns the number of line count, word count and a letter count.

The Software required for this application
	Netbeans IDE
	Java Development Kit (JDK)
	Java EE-compliant application server
	Glassfish server

The implementation class Server is annotated as a web service endpoint using the @WebService annotation. 
Server declares three method named getLetterCount, getWordCount, getLineCount, annotated with the @WebMethod annotation, 
which exposes the annotated method to web service clients. 

The getLetterCount - This method will count a number of letters in a text. 
	This will work by passing a text as an input parameter. We convert a string into a character array.
	And for each charater in the array, we determine if the specified character is a letter, and if it is, 
	we add it to the count. Finally, return the count.
	
The getLineCount - This method will count the number of lines in a text.
 	This will work by passing a text as an input parameter. 
	Then slitting up a text into an array of strings split by new line and returns the number of lines in a text. 

The getWordCount - This method will count a number of words in a text. 
	This will work by passing a text as an input parameter. Then slitting up a text into an array of strings split by new line.
	And for each line in the array we split it up into an array of words split by white space and then return the number of words. 

To build and deploy service 
1. Make sure that the Glassfish server has been started.
2. In the project tab, right click the SIWebserviceServer project and select deploy.
3. When the server is deployed, you can now test the client (SoapClient).
4. To test the client, right click the project SIWebServiceSoapClieint and choose run

