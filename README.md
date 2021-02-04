# TMT (Thomas, Mehrdad, Tommi)

Vårt projekt är ett Maven-projekt som simulerar en adressbok (Addressbook-klassen). Man kan ta bort, lägga till och hitta kontakter i adressboken. Contact-klassen ärver
av Person-klassen och innehåller mer information och metoder som relaterar till kontaktuppgifter såsom email, telefonnummer och adress. 

Hur man startar programmet: 

Kör kommandot mvn package i "maven-addressbook"-katalogen och kör den genererade .jar filen med
kommandot "java -jar maven-addressbook-0.0.1-SNAPSHOT.jar" i en terminal.

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