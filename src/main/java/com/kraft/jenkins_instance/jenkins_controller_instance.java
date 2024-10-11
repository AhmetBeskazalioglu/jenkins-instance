package com.kraft.jenkins_instance;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class jenkins_controller_instance {

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
                        }
                        .main-image {
                            width: 80%;
                            border-radius: 10px;
                            margin: 20px auto;
                        }
                        .side-image {
                            width: 30%;
                            margin: 10px;
                        }
                        .advertisement-text {
                            font-size: 18px;
                            margin: 20px;
                            color: #555;
                        }
                    </style>
                </head>
                <body>
                    <h1>Banyo Tadilat ve Yenileme</h1>
                    <p class="advertisement-text">
                        Banyo tadilat, tesisat, kırım döküm, fayans örme ve yeniden banyo oluşturma hizmetlerimizle hizmetinizdeyiz!
                    </p>
                    <img src="https://drive.google.com/uc?export=view&id=1NajdbiQ3Udcaea-gsVLvjtVXSaYBxKWT" alt="Banyo Tadilat" class="main-image">
                    <p class="advertisement-text">
                        Profesyonel ustalık ve kaliteli malzemelerle banyolarınızı hayalinizdeki gibi yeniliyoruz.
                    </p>
                    <img src="https://drive.google.com/uc?export=view&id=1qcAoANAR21ce3owufW_v6cUipzV3MrLG" alt="Banyo Yenileme" class="side-image">
                    <img src="https://drive.google.com/uc?export=view&id=1NajdbiQ3Udcaea-gsVLvjtVXSaYBxKWT" alt="Tadilat Hizmeti" class="side-image">
                    <p class="advertisement-text">
                        Bize ulaşarak banyonuza değer katacak çözümlerimiz hakkında daha fazla bilgi edinebilirsiniz!
                    </p>
                </body>
                </html>
                """;
    }
}
