package com.example.smartemailgenerator.Service;

import com.example.smartemailgenerator.EmailRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;

@Service
public class EmailGeneratorService {

    @Value("${gemini.api.url}")
    private String geminiApiURL;

    @Value("${gemini.api.key}")
    private String geminiApiKey;

    public String generateEmailReply(EmailRequest emailRequest){
        //Build Prompt
        String prompt = buildPrompt(emailRequest);

        //Craft request
        Map <String, Object> requestBody = Map.of(
                "content", new Object[] {
                        Map.of("parts", new Object[]{
                                Map.of("text", prompt)
                        })
                }
        );

        //Do the request Get the response


        return "";
    }

    private String buildPrompt(EmailRequest emailRequest) {
        StringBuilder prompt = new StringBuilder();
        prompt.append("Generate a good professional email reply for the following email content. Please dont generate the subject line. ");
        if (emailRequest.getTone() != null && !emailRequest.getTone().isEmpty()) {
            prompt.append("Use a ").append(emailRequest.getTone()).append(" tone.");
        }
        prompt.append("\nOriginal email: \n").append(emailRequest.getEmailContent());

        return prompt.toString();
    }

}
