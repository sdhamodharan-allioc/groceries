## Deploy Instructions
# Start Tomcat
Go to 

C:\sys\apache-tomcat-10.1.7\bin

setclasspath.bat
rem Make sure prerequisite environment variables are set
SET JAVA_HOME=C:/sys/Java/jdk-20

# DB Connection in Tomcat
 c:\sys\apache-tomcat-10.1.7\conf\context.xml

#contex.xml content.
<Context>
...
 <Resource auth="Container"
 driverClassName="org.mariadb.jdbc.Driver"
 maxActive="100"  maxIdle="30" maxWait="10000"
 name="jdbc/demo" type="javax.sql.DataSource"
 url="jdbc:mariadb://localhost:3306/demo"
 username="root"  password="MariaDB@123" />

...
</Conext>

# Link to this JNDI in web.xml
