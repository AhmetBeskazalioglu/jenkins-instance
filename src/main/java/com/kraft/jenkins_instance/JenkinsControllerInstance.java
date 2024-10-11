package com.kraft.jenkins_instance;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class JenkinsControllerInstance {

    @RequestMapping("/hello")
    public String hello() {
        return """
        <!DOCTYPE html>
        <html lang="tr">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Banyo Tadilat ve Tesisat Hizmetleri</title>
            <style>
                body {
                    font-family: Arial, sans-serif;
                    text-align: center;
                    background-color: #f7f7f7;
                    padding: 20px;
                }
                .banner {
                    max-width: 800px;
                    margin: auto;
                    border: 2px solid #ddd;
                    padding: 20px;
                    background-color: #fff;
                }
                .banner img {
                    width: 100%;
                    height: auto;
                    margin-bottom: 20px;
                }
                .services {
                    display: flex;
                    flex-wrap: wrap;
                    justify-content: space-around;
                }
                .service {
                    width: 45%;
                    margin-bottom: 20px;
                    padding: 10px;
                    background-color: #e7e7e7;
                    border-radius: 8px;
                    box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
                }
                @media (max-width: 600px) {
                    .service {
                        width: 100%;
                    }
                }
            </style>
        </head>
        <body>
            <div class="banner">
                <img src="data:image/jpeg;base64,{REPLACE_WITH_BASE64_ENCODED_IMAGE}" alt="Banyo Tadilat Görüntüsü">
                <h1>Banyo Tadilat ve Tesisat İşleriniz İçin Profesyonel Hizmet</h1>
                <p>Yeni banyo tasarımı, tesisat yenileme, kırım döküm ve fayans işleriyle ustayız. Profesyonel ekibimizle banyonuzu en güzel hale getiriyoruz.</p>
            </div>
            <div class="services">
                <div class="service">
                    <h3>Banyo Tadilat</h3>
                    <p>Eski banyonuzu yeni bir görünüme kavuşturuyoruz. Profesyonel işçilik ve kaliteli malzeme kullanımı.</p>
                </div>
                <div class="service">
                    <h3>Tesisat Yenileme</h3>
                    <p>Su kaçağı veya eski tesisat sorunlarınıza kesin çözümler sunuyoruz.</p>
                </div>
                <div class="service">
                    <h3>Kırım Döküm</h3>
                    <p>Fayans ve eski tesisat kırımı için hızlı ve etkili hizmet veriyoruz.</p>
                </div>
                <div class="service">
                    <h3>Fayans Döşeme</h3>
                    <p>Farklı desenlerde fayans döşeme hizmeti, yüksek kaliteli işçilikle sağlanır.</p>
                </div>
            </div>
        </body>
        </html>
        """;
    }
}

