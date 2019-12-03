# Foriba Bulut e-SMM API Java Test Projesi

Bu proje Foriba Bulut e-SMM API web servis metodlarının nasıl kullanılması gerektiği ile ilgili örnek olması için oluşturulmuştur. Proje yalnızca 
test sisteminde çalışmaktadır ve web servislere bağlantı ayarları da projede bulunmaktadır.

 **e-SMM Ürünü İçin:**

- e-SMM belge gönderimi.
- e-SMM belgesinin PDF görüntüsünün alınması.
- e-SMM belge iptali.


işlemleri yapılmaktadır.

Web servis erişim güvenliği basic authentication ile sağlanmaktadır. Web servisleri kullanacak istemcilerin Foriba Bulut e-SMM Portal test sistemi
kullanıcı adı ve şifresine sahip olmaları gerekmektedir. Bu kullanıcı adı ve şifre ile web service doğrulaması gerçekleştirilebilir.


# Kurulum

Bu proje Eclipse geliştirme ortamında Java yazılım dili standartları ile oluşturulmuştur.

foriba-esmm-cloud-client-app projesinin test edilmesi:

- İndirilen proje File -> Open Project from File System.. üzerinden açılır.
- sendDocument methodu için örnek ziplenmiş e-SMM belgesi com/foriba/esmm/client dizini altındadır.
- Foriba Bulut e-SMM Portal test sistemi kullanıcı adı ve şifresi, proje içerisindeki username ve password alanlarına girilmelidir.
- Application.java içerisinde bulunan sendDocument, getDocument ve cancelDocument WS methodları test edilebilir.



# Lisans
  
Foriba Bulut API Java Test Projesi, **Foriba R&D** ekibi tarafından API kullanımını anlatmak için hazırlanmıştır, izinsiz olarak ticari uygulamalarda kullanılması yasaktır.  
