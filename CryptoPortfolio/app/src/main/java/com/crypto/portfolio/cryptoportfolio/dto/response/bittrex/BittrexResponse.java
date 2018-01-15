package com.crypto.portfolio.cryptoportfolio.dto.response.bittrex;

import java.util.List;

public class BittrexResponse {

    private Boolean success;
    private String message;
    private List<GetBalanceDTO> result;

    public BittrexResponse() {
        super();
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<GetBalanceDTO> getResult() {
        return result;
    }

    public void setResult(List<GetBalanceDTO> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "BittrexResponse{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
