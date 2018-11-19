# Optitouch Maven

## Start the development mode

See https://github.com/tbroyer/gwt-maven-archetypes

Change directory to your generated project and issue the following commands:

In one terminal window: `mvn gwt:codeserver -pl *-client -am`

In another terminal window: `mvn jetty:run -pl *-server -am -Denv=dev`

Note that the -pl and -am are not strictly necessary, they just tell Maven not to build the client module when you're dealing with the server one, and vice versa.

Open Browser http://127.0.0.1:8080