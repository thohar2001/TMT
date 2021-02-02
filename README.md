# TMT (Thomas, Mehrdad, Tommi)

Vårt projekt är ett Maven-projekt som simulerar en adressbok (Addressbook-klassen). Man kan ta bort, lägga till och hitta kontakter i adressboken. Contact-klassen ärver
av Person-klassen och innehåller mer information och metoder som relaterar till kontaktuppgifter såsom email, telefonnummer och adress. 

Man bygger och kör vår applikation med hjälp av Maven (Exempel kommandon: mvn compile, mvn test, mvn package).

Man kan köra vår applikation i Jenkins genom Github-länken till projektet:

https://github.com/thohar2001/TMT.git 

OBS: Skall man köra vårt projekt i Jenkins så behöver man byta katalog till maven-addressbook i Pipeline-scriptet eftersom det är där Maven-projektet ligger.


Innehåll/Klasser:

Person
Addressbook
Contact extends Person

Testklasser:

TestPerson
TestContact
TestAddressBook