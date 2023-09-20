ÖZET
Bu rapor, Java programlama dili kullanılarak geliştirilen bir mobil ilaç hatırlatma uygulamasını tanıtmaktadır. Uygulama, ilaç ekleyebilme, silme ve hatırlatma özelliklerini içermektedir. Kullanıcılar ilaçları ana sayfada görüntüleyebilir, silme ve hatırlatma işlemlerini gerçekleştirebilirler. Uygulama, kullanıcıların ilaçları düzenli olarak hatırlayabilmesini sağlamaktadır.

GİRİŞ
Bu projeyi, ilaç kullanımının düzenli ve hatırlanabilir olması önemli bir konu olduğu için geliştirdim. İnsanlar sıklıkla ilaçlarını hatırlamada zorluk yaşayabilir ve bu da sağlık sorunlarına yol açabilir. İlaç hatırlatma uygulaması, kullanıcılara ilaçlarını düzenli olarak hatırlatma ve yönetme imkânı sunarak bu soruna çözüm sağlamayı amaçlamaktadır. Bu uygulama, özellikle kronik hastalıkları olan bireyler, ilaç tedavisi görenler ve yaşlı insanlar gibi ilaç kullanımında düzen ve hatırlanabilirlik gerektiren gruplara fayda sağlamaktadır. Kullanıcılar, ilaç ekleme, silme ve hatırlatma özelliklerini kullanarak ilaçlarını düzenli bir şekilde takip edebilir ve hatırlama konusunda destek alabilirler. Bu projenin temel amacı, sağlık ve yaşam kalitesini artırmak için ilaç kullanımını kolaylaştırmaktır. İlaç hatırlatma uygulaması sayesinde kullanıcılar, ilaçlarını doğru zamanda ve düzenli olarak alarak tedavi süreçlerini etkili bir şekilde yönetebilirler.
Bu rapor, mobil bir ilaç hatırlatma uygulamasının Java programlama dili kullanılarak nasıl geliştirildiğini ve temel işlevlerini açıklamaktadır. Uygulamanın ana sayfasında kullanıcılar ilaç ekleyebilir ve kaydedebilirler. Kaydedilen ilaçlar ana sayfada listelenir ve kullanıcılar ilaçları silme veya hatırlatma özelliğini kullanma seçeneklerine sahiptirler. Rapor ayrıntılı olarak uygulamanın yapısal özelliklerini ele almaktadır. İlk olarak, kullanıcıların karşılaştığı ana sayfada ilaç eklemek için bir buton bulunmaktadır. İlaç ekleme sayfasında, kullanıcılar ilaç adını ve türünü girebilirler. Kaydet butonuna basıldığında, ilaç ana sayfaya kaydedilir ve kullanıcılar bu sayfada kaydedilen ilaçları görüntüleyebilirler. Ana sayfada, her bir kaydedilen ilacın üzerine basılı tutulduğunda, silme ve hatırlatma butonları görüntülenir. Sil butonuna tıklandığında, ilaç listeden silinir ve kullanıcılar ilacı daha fazla hatırlatma almadan kaldırabilirler. Hatırlat butonuna tıklandığında, kullanıcılar ilacın hatırlatma zamanını belirlemek için bir sayfaya yönlendirilirler. Burada, kullanıcılar ilaç hatırlatmasının gerçekleşeceği saati seçebilir ve hatırlatıcıyı ayarla butonuna basarak hatırlatma zamanını kaydedebilirler. Rapor, uygulamanın temel işlevlerini anlatırken, uygulama kullanıcılarına ilaçlarını düzenli olarak hatırlatma ve yönetme kolaylığı sağladığını vurgulamaktadır. Bu bilgilerin temel alınarak, uygulamanın kullanıcı deneyimini artırmak ve ilaç hatırlatma sürecini kolaylaştırmak için geliştirme çalışmaları yapılabilir.

ANASAYFA
Anasayfa ilk açıldığında boş bir şekilde açılıyor. Ekranda sadece ilaç ekle butonu bulunmaktadır. Butona tıklandığında ikinci bir sayfa açılıyor ve buradan ilaç eklendiğinde anasayfada listeleniyor.

![Ana Sayfa]([images/anasayfa.png])


 
1. SAYFA
Bu sayfada bir ilaç kayıt formu bulunmaktadır. Anasayfadan ilaç ekle butonuna tıklandığında kullanıcı bu sayfaya yönlendiriliyor. Bu formda İlaç Adı ve İlaç Türü seçilerek Kaydet butonuna tıklandığında formdaki veriler anasayfaya gönderilir. 


 
2. SAYFA
Anasayfada listelenen ilaçlardan istenilenin üstüne tıklandığında 2 adet buton çıkmaktadır. Bu butonlardan biri Sil diğeri ise Hatırlat işlevini görmektedir. Hatırlat butonuna tıklandığında kullanıcıyı 2. Sayfa olan Hatırlat sayfasına yönlendirmektedir. Bu sayfada istenilen zaman iki farklı arayüzde saat ve dakika olarak seçilebilir ardından Hatırlatıcıyı Ayarla butonuna tıklandığında seçilen ilaca yönelik hatırlatıcı kurulmuş olur. 
 







SONUÇ
Bu projede, ilaç hatırlatma uygulamasını başarılı bir şekilde geliştirdik ve kullanıcıların ilaçlarını düzenli olarak hatırlama ve yönetme konusunda yardımcı olduk. Uygulama, ilaç ekleyebilme, silme ve hatırlatma özelliklerini içermekte ve kullanıcıların ilaçlarını takip etmelerini kolaylaştırmaktadır. Ancak, uygulamanın tam anlamıyla hatırlatıcıyı kurabilmesi için kullanıcıların telefondan izin alması gerekmektedir. Bu izinlerin alınmaması durumunda, hatırlatıcı işlevi tam olarak gerçekleştirilememektedir. Bu durum, kullanıcıların hatırlatma özelliğinin tam kapasitede kullanımını kısıtlayabilir. Sonuç olarak, ilaç hatırlatma uygulaması, ilaç kullanımını düzenli hale getirme konusunda kullanıcılara önemli bir destek sağlamaktadır. Ancak, hatırlatıcı işlevinin tam olarak kullanılabilmesi için telefondan izin alınması gerekmektedir. Gelecekteki geliştirmelerde, kullanıcı deneyimini iyileştirmek ve izin alma sürecini daha kullanıcı dostu hale getirmek için çalışmalar yapılabilir.
