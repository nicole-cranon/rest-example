# rest-example 


## Run configurations Intellij

On proxy (ignore ssl):

Put desired option command in the 'Command line' text box. 

Install
```
-Dmaven.wagon.http.ssl.insecure=true -Dmaven.wagon.http.ssl.allowall=true -Dmaven.wagon.http.ssl.ignore.validity.dates=true install
```

Clean
```
-Dmaven.wagon.http.ssl.insecure=true -Dmaven.wagon.http.ssl.allowall=true -Dmaven.wagon.http.ssl.ignore.validity.dates=true clean
```

Run
```
-Dmaven.wagon.http.ssl.insecure=true -Dmaven.wagon.http.ssl.allowall=true -Dmaven.wagon.http.ssl.ignore.validity.dates=true spring-boot:run
```

Off proxy:

Install
```
install
```

Clean
```
clean
```

Run
```
spring-boot:run
```

## Run configurations Eclipse Neon

On proxy(ignore ssl):

Run Configurations > Maven Build > Parameter Add:

Parameter Name                             | Value
-------------------------------------------|:------:
maven.wagon.http.ssl.insecure              | true
maven.wagon.http.ssl.allowall              | true
maven.wagon.http.ssl.ignore.validity.dates | true

Goals:

* install - install maven dependencies, create war/jar
* clean - remove target with all compiled artifacts
* spring-boot:run - runs the application

Off proxy: 

Run as > * (any of the options under this option should work off proxy)