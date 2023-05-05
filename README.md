# redis-spring-session-integration
Spring security session integration with Redis.

Web uygulamalarında bir kişi authentication aşamasında sonra tekrar kullanıcı adı-şifre girişi yapmaması adına client üzerinde "JSESSIONID" cookie' si saklanır.

Bu cookie, Spring Security kullanan uygulamanın kendisi tarafından oluşturulup hafızada saklanır. Uygulama herhangi bir şekilde yeniden başlarsa veya yatay olarak çoklama yapılan bir ortam var ise yeni uygulamalar aynı hafıza ile ayağa kalkamayacağından ötürü bu "JSESSIONID" bilgisine sahip olmayacaklardır.

Bu gibi durumlarda kullanıcı deneyiminin etkilenmemesi adına "JSESSIONID" bilgilerinin ortak bir alanda, tüm uygulamalar tarafından erişilebilir şekilde saklanması gerekiyor.

"spring session redis" entegrasyonu ile bunu sağlayabiliriz.

1 - "spring-boot-starter-data-redis" ve "spring-session-data-redis" bağımlılıkları eklenir.

2 - Bilgisayarda redis kurulu olmadığı için docker kullancağız. Spring' in 3.1 ile sağladığı kolaylık sayesinde uygulamayı ayağa kaldırırken aynı zamanda konteynerlar da çalıştırabilir ve log mesajlarından takip edebilirsin.

3 - "spring-boot-docker-compose" bağımlılığını ekliyoruz.

4 - "docker-compose.yml" dosyamızı oluşturuyoruz.