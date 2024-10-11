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
                            margin: 0;
                            padding: 0;
                            background-color: #f0f0f0;
                            color: #333;
                        }
                        .container {
                            text-align: center;
                            padding: 20px;
                        }
                        .image {
                            width: 70%;
                            border-radius: 10px;
                            margin-top: 20px;
                            box-shadow: 0px 0px 10px rgba(0,0,0,0.2);
                        }
                        .text-section {
                            background-color: #fff;
                            padding: 20px;
                            margin-top: 30px;
                            box-shadow: 0px 0px 15px rgba(0,0,0,0.1);
                            border-radius: 10px;
                            max-width: 800px;
                            margin-left: auto;
                            margin-right: auto;
                        }
                        h1 {
                            color: #444;
                            font-size: 32px;
                            margin-bottom: 15px;
                        }
                        p {
                            font-size: 18px;
                            line-height: 1.6;
                        }
                        .contact-info {
                            font-weight: bold;
                            font-size: 20px;
                            margin-top: 30px;
                        }
                    </style>
                </head>
                <body>
                    <div class="container">
                        <h1>Banyo Tadilat ve Yenileme</h1>
                        
                        <div class="text-section">
                            <p>Banyo tadilat, tesisat, kırım döküm, fayans döşeme ve yeniden banyo oluşturma hizmetlerimizle hizmetinizdeyiz! Uzman ekibimizle banyolarınızı tamamen yeniliyoruz.</p>
                        </div>
                        
                        <img src="/images/1.DNG" alt="Banyo Tadilat" class="image">
                        
                        <div class="text-section">
                            <p>Profesyonel ustalık ve kaliteli malzemelerle banyolarınızı hayalinizdeki gibi yeniliyoruz. Banyonuza değer katmak bizim işimiz!</p>
                        </div>
                        
                        <img src="/images/2.DNG" alt="Banyo Yenileme" class="image">
                        
                        <div class="text-section">
                            <p>Fayans döşeme, lavabo montajı, duşakabin kurulumu gibi işlemlerle banyolarınıza estetik ve kullanışlı bir görünüm kazandırıyoruz. İletişime geçerek ücretsiz keşif randevusu talep edebilirsiniz!</p>
                        </div>
                        
                        <div class="contact-info">
                            Telefon: 0555 123 45 67<br>
                            Email: info@banyotadilat.com
                        </div>
                    </div>
                </body>
                </html>
                """;
    }
}