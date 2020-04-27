# SpringBootMVC
Spring Boot MVC, Thymeleaf

Good day, everyone.

Here I present a very cool little Spring Boot MVC template project.

What is MVC? Well, first and foremost, it is an architectural design pattern, common across many languages. It is forced on us by the standards of the Internet. In a nutshell, MVC provides programmers with a way to translate from HTML to a different language(Java in our case), in order to take in input, process it and return a result - a view (new HTML page). Or in case of microservices - return data object(JSON, XML, text, etc).

It all starts with a user request coming in from HTTP servers that we set up - Tomcat, Glassfish, whatnot. These servers handle the HTTP side of things - IP addressing, packets, routing, all that networking stuff. And then handle us a user request object. These web servers also give us Java run-time environment, to run our Servlets in.

User request objects then get parsed to extract particular data. The request then gets routed to a proper method, through what is called a Controller class or classes. The method to run could be based on the original request URL address, particular HTTP method used, specific parameters, and many other conditions. 

Mostly, actual MVC processing is based on URL resource end-point mappings. How you setup these end-points is up to you.

I can go on and on about MVC, and how amazing it is. But I will expand on this later.

Thank you for your time!

Vic
