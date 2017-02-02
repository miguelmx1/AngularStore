package com.moram;
public class Result {

    private final long id;
    private final int resultCode;
    private final String resultText;

    public Result(long id, int ResultCode, String ResultText) {
        this.id = id;
        this.resultCode = ResultCode;
        this.resultText = ResultText;
    }

    public long getId() {
        return id;
    }

    public int getResultCode() {
        return resultCode;
    }
    
    public String getResultText() {
        return resultText;
    }
}
