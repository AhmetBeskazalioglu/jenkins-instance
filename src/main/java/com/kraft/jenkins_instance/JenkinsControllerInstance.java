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
                        .main-image {
                            width: 80%;
                            border-radius: 10px;
                            margin: 20px auto;
                            box-shadow: 0px 0px 15px rgba(0,0,0,0.2);
                        }
                        .side-image {
                            width: 30%;
                            margin: 10px;
                            border-radius: 10px;
                            box-shadow: 0px 0px 10px rgba(0,0,0,0.1);
                        }
                        .advertisement-text {
                            font-size: 18px;
                            margin: 20px;
                            color: #333;
                            line-height: 1.5;
                        }
                        h1 {
                            color: #444;
                        }
                    </style>
                </head>
                <body>
                    <h1>Banyo Tadilat ve Yenileme</h1>
                    <p class="advertisement-text">
                        Banyo tadilat, tesisat, kırım döküm, fayans örme ve yeniden banyo oluşturma hizmetlerimizle hizmetinizdeyiz!
                    </p>
                    <img src="/images/1.DNG" alt="Banyo Tadilat" class="main-image">
                    <p class="advertisement-text">
                        Profesyonel ustalık ve kaliteli malzemelerle banyolarınızı hayalinizdeki gibi yeniliyoruz.
                    </p>
                    <img src="/images/2.DNG" alt="Banyo Yenileme" class="side-image">
                    <img src="/images/1.DNG" alt="Tadilat Hizmeti" class="side-image">
                    <p class="advertisement-text">
                        Bize ulaşarak banyonuza değer katacak çözümlerimiz hakkında daha fazla bilgi edinebilirsiniz!
                    </p>
                </body>
                </html>
                """;
    }
}
