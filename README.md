# redis-spring-session-integration
Spring security session integration with Redis.

Web uygulamalarında bir kişi authentication aşamasında sonra tekrar kullanıcı adı-şifre girişi yapmaması adına client üzerinde "JSESSIONID" cookie' si saklanır.

Bu cookie, Spring Security kullanan uygulamanın kendisi tarafından oluşturulup hafızada saklanır. Uygulama herhangi bir şekilde yeniden başlarsa veya yatay olarak çoklama yapılan bir ortam var ise yeni uygulamalar aynı hafıza ile ayağa kalkamayacağından ötürü bu "JSESSIONID" bilgisine sahip olmayacaklardır.

Bu gibi durumlarda kullanıcı deneyiminin etkilenmemesi adına "JSESSIONID" bilgilerinin ortak bir alanda, tüm uygulamalar tarafından erişilebilir şekilde saklanması gerekiyor.

"spring session redis" entegrasyonu ile bunu sağlayabiliriz.

1 - "spring-boot-starter-data-redis" ve "spring-session-data-redis" bağımlılıkları eklenir.