# PAASPORT Adapter Template
> Template for the creation of an Adapter for PaaSport Marketplace, the PaaS Interoperability platform. 
* Implement methods in adapter Class. 
* Provide the created adapter to test and addition to our marketplace ( contact us: http://paasport-project.eu/contact.php)

## Prerequisites

* JDK 1.7.0_latest
* Maven 3.x

Before moving on, make sure you have the required JDK and Maven version.
 
	$ mvn -version
	$ java -version
	$ javac -version

###### Install Maven on Ubuntu 
	sudo apt-get install maven
###### Install Maven on OS X
	brew install maven

## Build the Adapter

	$ git clone git@github.com:gledakis/PaaSportAdapterTemplate.git or instead: git clone https://github.com/gledakis/PaaSportAdapterTemplate.git
	$ cd AdapterTemplate
	$ mvn clean install

## Extend the Adapter

In order to extend this adapter for supporting a PaaS, provide implementations to the methods of class Adapter.java. For being able to use this adapter in PaaSpor Marketplca, the basic methods startApplication, stopApplication, deleteApplication should be implemented and at least one of the createApplication and deployApplication. Supporting more methods like getAvailableServicesList/createServiceBinding/deleteServiceBinding is optional but reccomended in order to provide full compiance with PaaSport Unified API and being able to support more functionalities through PaaSport Marketplace
