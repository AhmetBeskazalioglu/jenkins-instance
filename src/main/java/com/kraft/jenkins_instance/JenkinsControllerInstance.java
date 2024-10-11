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
                            background-color: #ffffff;
                            color: #000000;
                            padding: 0;
                            margin: 0;
                        }
                        .main-image {
                            max-width: 80%;
                            height: auto;
                            margin: 20px 0;
                            border: 3px solid #ccc;
                        }
                        .side-images {
                            display: flex;
                            justify-content: center;
                            gap: 10px;
                            margin: 20px 0;
                        }
                        .side-image {
                            max-width: 30%;
                            height: auto;
                            border: 2px solid #ccc;
                        }
                        .advertisement-text {
                            font-size: 16px;
                            margin: 15px auto;
                            max-width: 80%;
                            line-height: 1.6;
                        }
                        .contact-info {
                            font-weight: bold;
                            margin-top: 20px;
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
                        Telefon: 0555 123 45 67<br>
                        Email: info@banyotadilat.com
                    </p>
                </body>
                </html>
                """;
    }
}