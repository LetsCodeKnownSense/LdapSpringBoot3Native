# SpringBoot3Native
Repo to add projects build as native images using SpringBoot3

This repository has code for Ldap to work as native image using SpringBoot3.
The ldap can also be accessed securely over SSL. 
Runtime class is also present in the code. Utilise the same for making Ldap work over SSL.

#Steps to run Ldap as docker container:
1. Inside ldap-setup-file directory: 
    cd ldap-setup-file

2. Run ldap container:
    docker-compose up -d ldap

3. Add a new user in ldap: 
   ldapadd -x -H ldap://localhost -D "cn=admin,dc=knownsense,dc=com" -f bassa.ldif -w knownsense

4. If ldapadd doesn't work for you use the below command:
   docker cp bassa.ldif <container-id>:bassa.ldif

   And inside container run the command:

   ldapadd -x -H ldap://localhost -D "cn=admin,dc=knownsense,dc=com" -f bassa.ldif -w knownsense 


Refer to codingknownsense.com for further information. 
Youtube video link is also present on the website.

https://codingknownsense.com/ldap-over-ssl-with-native-springboot3/
