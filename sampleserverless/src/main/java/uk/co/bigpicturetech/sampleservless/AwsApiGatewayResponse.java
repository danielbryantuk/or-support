package uk.co.bigpicturetech.sampleservless;

public class AwsApiGatewayResponse {
    private Integer statusCode;
    private String body;

    public AwsApiGatewayResponse() {
    }

    public AwsApiGatewayResponse(Integer statusCode, String body) {
        this.statusCode = statusCode;
        this.body = body;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getBody() {
        return body;
    }
}
