# rest-example 


##Run configurations Intellij
On proxy:

Install
```sh
-Dmaven.wagon.http.ssl.insecure=true -Dmaven.wagon.http.ssl.allowall=true -Dmaven.wagon.http.ssl.ignore.validity.dates=true install
```

Clean
```sh
-Dmaven.wagon.http.ssl.insecure=true -Dmaven.wagon.http.ssl.allowall=true -Dmaven.wagon.http.ssl.ignore.validity.dates=true clean
```

Run
```sh
-Dmaven.wagon.http.ssl.insecure=true -Dmaven.wagon.http.ssl.allowall=true -Dmaven.wagon.http.ssl.ignore.validity.dates=true spring-boot:run
```

Off proxy:
Install
```sh
install
```

Clean
```sh
clean
```

Run
```sh
spring-boot:run
```

Run configurations Eclipse Neon
