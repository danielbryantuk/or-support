package uk.co.bigpicturetech.sampleservless;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class HelloWorldHandler implements RequestStreamHandler {

    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {

        LambdaLogger logger = context.getLogger();
        logger.log("test");

        String body = "test";
        Integer statusCode = 200;
        AwsApiGatewayResponse awsApiGatewayResponse = new AwsApiGatewayResponse(statusCode, body);


        Gson gson = new Gson();

        OutputStreamWriter writer = new OutputStreamWriter(outputStream, "UTF-8");
        logger.log(gson.toJson(awsApiGatewayResponse));
        writer.write(gson.toJson(awsApiGatewayResponse));
        writer.close();
    }
}