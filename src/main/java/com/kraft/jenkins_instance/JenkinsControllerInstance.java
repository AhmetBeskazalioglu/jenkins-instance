package com.kraft.jenkins_instance;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class JenkinsControllerInstance {

    @RequestMapping("/hello")
    public String hello() {
        // HTML formatında görseller ve açıklamalarla banyo tadilat reklamı
        return """
                <!DOCTYPE html>
                <html>
                <head>
                    <title>Banyo Tadilat ve Yenileme</title>
                    <style>
                        body {
                            font-family: Arial, sans-serif;
                            text-align: center;
                            margin: 0;
                            padding: 0;
                            background-color: #f0f0f0;
                        }
                        h1 {
                            color: #444;
                            font-size: 36px;
                            margin: 20px 0;
                        }
                        .main-image {
                            width: 80%;
                            border-radius: 10px;
                            margin: 20px auto;
                            box-shadow: 0px 0px 15px rgba(0,0,0,0.2);
                        }
                        .side-images {
                            display: flex;
                            justify-content: center;
                            gap: 20px;
                            margin: 20px 0;
                        }
                        .side-image {
                            max-width: 45%;
                            height: auto;
                            border-radius: 10px;
                            box-shadow: 0px 0px 10px rgba(0,0,0,0.1);
                        }
                        .advertisement-text {
                            font-size: 22px;
                            margin: 20px;
                            color: #333;
                            line-height: 1.8;
                        }
                        .contact-info {
                            font-weight: bold;
                            font-size: 20px;
                            margin-top: 30px;
                        }
                        a {
                            color: #0056b3;
                            text-decoration: none;
                        }
                        a:hover {
                            text-decoration: underline;
                        }
                    </style>
                </head>
                <body>
                    <h1>Banyo Tadilat ve Yenileme</h1>
                    <p class="advertisement-text">
                        Banyo tadilat, tesisat, kırım döküm, fayans döşeme ve yeniden banyo oluşturma hizmetlerimizle hizmetinizdeyiz! Uzman ekibimizle banyolarınızı tamamen yeniliyoruz.
                    </p>
                    <img src="/images/1.DNG" alt="Banyo Tadilat" class="main-image">
                    <p class="advertisement-text">
                        Profesyonel ustalık ve kaliteli malzemelerle banyolarınızı hayalinizdeki gibi yeniliyoruz. Banyonuza değer katmak bizim işimiz!
                    </p>
                    <div class="side-images">
                        <img src="/images/2.DNG" alt="Banyo Yenileme" class="side-image">
                        <img src="/images/1.DNG" alt="Tadilat Hizmeti" class="side-image">
                    </div>
                    <p class="advertisement-text">
                        Fayans döşeme, lavabo montajı, duşakabin kurulumu gibi işlemlerle banyolarınıza estetik ve kullanışlı bir görünüm kazandırıyoruz. 
                        İletişime geçerek ücretsiz keşif randevusu talep edebilirsiniz!
                    </p>
                    <p class="contact-info">
                        Telefon: <a href="tel:+905551234567">0555 123 45 67</a><br>
                        Email: <a href="mailto:info@banyotadilat.com">info@banyotadilat.com</a>
                    </p>
                </body>
                </html>
                """;
    }
}